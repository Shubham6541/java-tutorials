package org.nklkarthi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.nklkarthi.voter.*"), @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.nklkarthi.multiplelogin.*"),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.nklkarthi.multipleentrypoints.*") })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
