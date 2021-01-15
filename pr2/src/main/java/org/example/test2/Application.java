package org.example.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

    private static final String MODULE_NAME = "test2";

    public static String getModuleName() {
        return MODULE_NAME;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
