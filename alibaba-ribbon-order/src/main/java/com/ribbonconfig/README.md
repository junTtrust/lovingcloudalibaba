此目录下的配置不应该被springboot 扫描到，不然就成为全局的配置，所以没有放到loving.ailibabaribbonorder 目录下


PayCenterRibbonConfig  配置支付工程采用轮询策略
ProductCenterRibbonConfig 配置商品工程采用随机策略
GlobalRibbonConfig 自定义负载均衡算法
    1.WeightedRule 权重算法：通过nacos 配置权重