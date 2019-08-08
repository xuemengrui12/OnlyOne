package com.onlyone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class OnlyoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlyoneApplication.class, args);
    }

}
