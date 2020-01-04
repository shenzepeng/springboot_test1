package com.example.springboot_test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringbootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest1Application.class, args);
    }

}
