package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan(basePackages = "com.example.demo")
public class App {
    ApplicationContext container = new AnnotationConfigApplicationContext(App.class);
}
