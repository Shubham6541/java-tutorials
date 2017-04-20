package org.nklkarthi.ex.dataintegrityviolationexception.spring;

import org.nklkarthi.spring.config.PersistenceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

@Configuration
@ComponentScan("org.nklkarthi.ex.dataIntegrityviolationexception.cause1")
@Import(PersistenceConfig.class)
public class Cause1DataContextWithJavaConfig {

    public Cause1DataContextWithJavaConfig() {
        super();
    }

    // beans

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

}