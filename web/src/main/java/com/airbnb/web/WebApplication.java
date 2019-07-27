package com.airbnb.web;


import com.airbnb.web.service.UserService;
import com.airbnb.web.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.airbnb.web")
@EnableJpaRepositories("com.airbnb.web.repository")
@EntityScan("com.airbnb.web.entity")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
    @Bean
    UserService customerService(){
        return new UserServiceImpl();
    }
}
