package com.nklkarthi.annotation.servletcomponentscan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nklkarthi.autoconfiguration.MySQLAutoconfiguration;

@SpringBootApplication(exclude=MySQLAutoconfiguration.class)
@ComponentScan(basePackages = "com.nklkarthi.annotation.servletcomponentscan.components")
public class SpringBootPlainApp {

    public static void main(String[] args) {
    }

}
