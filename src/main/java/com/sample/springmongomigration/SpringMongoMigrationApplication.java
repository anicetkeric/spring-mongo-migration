package com.sample.springmongomigration;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableMongock
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringMongoMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoMigrationApplication.class, args);
    }

}
