package com.srcb.microservicecloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer//开启eurekaServer
public class MicroserviceCloudApplication{

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloudApplication.class, args);
    }

}
