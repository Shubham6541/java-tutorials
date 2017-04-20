package com.nklkarthi.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.nklkarthi.autoconfiguration.MySQLAutoconfiguration;

@SpringBootApplication(scanBasePackages = { "com.nklkarthi.git" }, exclude=MySQLAutoconfiguration.class)
public class CommitIdApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommitIdApplication.class, args);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setLocation(new ClassPathResource("git.properties"));
        c.setIgnoreResourceNotFound(true);
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }
}
