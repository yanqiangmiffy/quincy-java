package com.miaoshaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */

@EnableAutoConfiguration //sb自动化配置
@RestController
public class App {
    @RequestMapping("/")
    public String Home(){
        return "hello world";
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class,args);
    }
}
