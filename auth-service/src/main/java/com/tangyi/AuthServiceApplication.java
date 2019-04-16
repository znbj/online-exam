package com.tangyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableDiscoveryClient
@ServletComponentScan
@EnableCircuitBreaker
public class AuthServiceApplication extends WebMvcConfigurerAdapter {


    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }
}
