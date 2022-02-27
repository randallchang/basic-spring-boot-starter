package com.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.basic")
@EnableFeignClients(basePackages = "com.basic")
@MapperScan("com.basic")
public class BasicSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicSpringBootApplication.class, args);
    }

    @RestController
    public class BasicController {

        @GetMapping("/root")
        public ResponseEntity<Object> controller() {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
