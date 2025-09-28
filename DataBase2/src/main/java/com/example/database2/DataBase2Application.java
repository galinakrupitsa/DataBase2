package com.example.database2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DataBase2Application {

    public static void main(String[] args) {
        SpringApplication.run(DataBase2Application.class, args);
    }

}
