package org.test.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.test.gateway.filters.PostFilter;
import org.test.gateway.filters.PreFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayApp 
{
    public static void main( String[] args ){
        SpringApplication.run(GatewayApp.class, args);
    }
    
    @Bean
    public PreFilter simpleFilter() {
      return new PreFilter();
    }
    
    @Bean
    public PostFilter postFilter(){
    	return new PostFilter();
    }
}
