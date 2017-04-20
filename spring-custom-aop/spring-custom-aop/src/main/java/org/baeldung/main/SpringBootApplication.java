package org.nklkarthi.main;

import org.nklkarthi.common.error.SpringHelloServletRegistrationBean;
import org.nklkarthi.common.resources.ExecutorServiceExitCodeGenerator;
import org.nklkarthi.controller.servlet.HelloWorldServlet;
import org.nklkarthi.controller.servlet.SpringHelloWorldServlet;
import org.nklkarthi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@EnableAutoConfiguration
@ComponentScan({ "org.nklkarthi.common.error", "org.nklkarthi.common.error.controller", "org.nklkarthi.common.properties", "org.nklkarthi.common.resources", "org.nklkarthi.endpoints", "org.nklkarthi.service", "org.nklkarthi.monitor.jmx", "org.nklkarthi.service" })
public class SpringBootApplication {

    private static ApplicationContext applicationContext;

    @Autowired
    private LoginService service;

    @RequestMapping("/")
    String home() {
        service.login("admin", "admin".toCharArray());
        return "TADA!!! You are in Spring Boot Actuator test application.";
    }

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(SpringBootApplication.class, args);
    }

    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(10);
    }

    @Bean
    public HelloWorldServlet helloWorldServlet() {
        return new HelloWorldServlet();
    }

    @Bean
    public SpringHelloServletRegistrationBean servletRegistrationBean() {
        SpringHelloServletRegistrationBean bean = new SpringHelloServletRegistrationBean(new SpringHelloWorldServlet(), "/springHelloWorld/*");
        bean.setLoadOnStartup(1);
        bean.addInitParameter("message", "SpringHelloWorldServlet special message");
        return bean;
    }

    @Bean
    @Autowired
    public ExecutorServiceExitCodeGenerator executorServiceExitCodeGenerator(ExecutorService executorService) {
        return new ExecutorServiceExitCodeGenerator(executorService);
    }

    public void shutDown(ExecutorServiceExitCodeGenerator executorServiceExitCodeGenerator) {
        SpringApplication.exit(applicationContext, executorServiceExitCodeGenerator);
    }

}
