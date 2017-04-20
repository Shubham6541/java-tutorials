package org.nklkarthi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nklkarthi.autoconfiguration.MySQLAutoconfiguration;

@SpringBootApplication(exclude=MySQLAutoconfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "demo");
        SpringApplication.run(DemoApplication.class, args);
    }

}
