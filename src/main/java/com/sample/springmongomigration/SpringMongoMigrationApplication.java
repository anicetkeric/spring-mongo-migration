package com.sample.springmongomigration;


import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class SpringMongoMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoMigrationApplication.class, args);
    }

}
