package com.nklkarthi.servlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.nklkarthi.autoconfiguration.MySQLAutoconfiguration;

@SpringBootApplication(exclude=MySQLAutoconfiguration.class)
public class ApplicationMain extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationMain.class);
    }
}
