package com.eshare.stock.user.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Evan Leung
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class StockUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockUserApplication.class,args);
    }


    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome eshare-stock ";
    }
}
