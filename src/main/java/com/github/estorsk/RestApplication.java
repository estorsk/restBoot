package com.github.estorsk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestApplication {

    public static void main(String[] args){
        SpringApplication.run(RestApplication.class, args);
        Task1.run();
        Task2.run();
        Task3.run();
        Task4.run();
        Task5.run();
        Task7.min(2022, 222);
    }

}
