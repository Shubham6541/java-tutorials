package org.nklkarthi.ex.dataintegrityviolationexception.spring;

import org.nklkarthi.spring.config.PersistenceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("org.nklkarthi.ex.dataIntegrityviolationexception.cause3")
@Import(PersistenceConfig.class)
public class Cause3DataContextWithJavaConfig {

    public Cause3DataContextWithJavaConfig() {
        super();
    }

    // beans

}