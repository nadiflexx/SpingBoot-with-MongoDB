package org.sportsdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SportsDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportsDataApplication.class, args);
    }

}
