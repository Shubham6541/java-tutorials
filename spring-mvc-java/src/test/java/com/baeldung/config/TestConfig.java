package com.nklkarthi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.nklkarthi.dao", "com.nklkarthi.aop", "com.nklkarthi.events" })
@EnableAspectJAutoProxy
public class TestConfig {
}
