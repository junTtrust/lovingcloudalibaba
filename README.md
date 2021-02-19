# lovingcloudalibaba
cloud alibaba
|-- ribbon  
|   |-- ribbon-order  
|   |   |--V2021/01/03 实现ribbon负载均衡，修改配置随机算法  
|   |   |--V2021/01/09 1.新增pay模块，提供服务调用  
                       2.order模块改造，不同服务使用不同的负载均衡策略  
                       3.自定义负载均衡算法-权重(nacos 配置)  
|   |   |--V2021/01/12 自定义负载均衡算法--同集群优先调用  
|   |   |--V2021/01/13 自定义负载均衡算法--同集群同版本优先 调用(金丝雀发布)  
|   |   |--V2021/02/12 ribbon 接入sentinel  
|   |   |--V2021/02/15 ribbon sentinel 接入持久化到nacos  
|   |   |--V2021/02/15 ribbon sentinel 接入ahas  
|   |-- ribbon-product  
|   |   |--V2021/01/03 实现ribbon负载均衡  
|   |   |--V2021/01/12 配置同集群优先调用  
|   |   |--V2021/01/13 自定义负载均衡算法--同集群同版本优先 调用(金丝雀发布)  
|   |   |--V2021-02/17 代码无改动，作为gateway服务调用者  

|   |-- ribbon-pay  
|   |   |-- V2021/01/09 初始化pay模块提供服务调用  


|-- feign
|   |-- feign-product-api  
|   |   |--V2021/01/23  初始化feign  
|   |   |--V2021/01/25  添加日志打印  
|   |   |--V2021/01/30  feign 默认契约(不推荐使用)  
|   |   |--V2021/01/30  feign 透传token  

|   |-- feign-product
|   |   |--V2021/01/23  feign 服务提供者  
|   |   |--V2021/01/30  feign 透传token  
|   |   |--V2021/01/30  feign 调用优化

|   |-- feign-order feign  
|   |   |--V2020/01/23  服务调用者  
|   |   |--V2020/01/25   添加日志打印  
|   |   |--V2021/01/30  feign 透传token  
|   |   |--V2021/01/30  feign 调用优化
|   |   |--V2021/02/12  feing 接入sentinel  
|   |   |--V2021/02/16  feing sentinel 集成nacos持久化


|-- config  
|   |-- config  
|   |   |--V2021/02/06 配置中心初始化  
                        1.nacos 创建通用配置文件，例：config-app  
                        启动项目可见mcat started on port(s): 9001 (http) with context path '/config-app'  
                        2.nacos 创建当前开发环境配置文件，例：config-app-dev  
                        3.nacos 创建跨项目通用配置，动态刷新配置
                        
                        
|-- sentinel
|   |--sentinel-order
|   |   |--V2021/01/10 1.sentinel 项目初始化  
                       2.sentinel 流控模式【关联】  
                       3.流控效果【排队等待】  
                       4.降级策略  
|   |--sentinel-product
|   |   |--V2021/01/10 sentinel 项目初始化  


|-- gateway
|   |-- gateway
|   |   |--V2021/02/17 1.gateway初始化
                       2.before/after/between/timebetween断言
                       3.header/method/path断言
                       3.filters:添加请求头信息
                       4.filters:过滤器
                       5.添加其他类型断言
                       
|-- gateway-sentinel
|   |--gateway-sentinel
|   |   |--V2021/02/18 网关集成sentinel