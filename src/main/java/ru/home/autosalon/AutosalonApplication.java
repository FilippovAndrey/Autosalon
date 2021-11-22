package ru.home.autosalon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class AutosalonApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutosalonApplication.class, args);
    }

}
