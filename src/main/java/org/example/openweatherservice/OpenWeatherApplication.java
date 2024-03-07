package org.example.openweatherservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OpenWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenWeatherApplication.class, args);
    }

}
