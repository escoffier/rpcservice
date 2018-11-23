package com.example.rpcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloClienApplication {

    public static void main(String[] args){
        System.setProperty("server.port", "8088");
        SpringApplication springApplication = new SpringApplication(HelloClienApplication.class);

        ApplicationContext applicationContext = springApplication.run(args);

        HelloClientImpl helloClient = applicationContext.getBean(HelloClientImpl.class);

        String result = helloClient.sayHelloClient("robbie");
        System.out.println("invoke result:" + result);

    }
}
