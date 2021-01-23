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
|   |-- ribbon-product  
|   |   |--V2021/01/03 实现ribbon负载均衡  
|   |   |--V2021/01/12 配置同集群优先调用
|   |   |--V2021/01/13 自定义负载均衡算法--同集群同版本优先 调用(金丝雀发布)

|   |-- ribbon-pay  
|   |   |-- V2021/01/09 初始化pay模块提供服务调用  


|-- feign
|   |-- feign-product-api  
|   |   |--V2021/01/23  初始化feign  

|   |-- feign-product
|   |   |--V2021/01/23  feign 服务提供者  

|   |-- feign-order feign 服务调用者


