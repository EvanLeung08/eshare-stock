package com.eshare.gateway.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Evan Leung
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class StockGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockGatewayApplication.class, args);
    }
}
