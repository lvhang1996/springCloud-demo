# springCloud-demo
springCloud 分布式


创建3个module  1个server中调eureka server  2个调eureka discovery
server： 	1.配置yml 
	2.主程序@EnableEurekaServer

provider：1.配置yml
	2.写好功能Service、Controller

customer：1.配置yml
	2.功能Controller
		restTemplate.getForObject("http://PROVIDER-TICKET/ticket",String.class);

	3.主程序：@EnableDiscoveryClient      //开启发现服务功能
		@LoadBalanced //开启负载均衡
    		@Bean
    		public RestTemplate restTemplate(){
       			 return new RestTemplate();}
