package com.nklkarthi.internationalization;

import javax.annotation.security.RolesAllowed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nklkarthi.autoconfiguration.MySQLAutoconfiguration;

@SpringBootApplication(exclude=MySQLAutoconfiguration.class)
public class InternationalizationApp {
    @RolesAllowed("*")
    public static void main(String[] args) {
        System.setProperty("security.basic.enabled", "false");
        SpringApplication.run(InternationalizationApp.class, args);
    }
}
