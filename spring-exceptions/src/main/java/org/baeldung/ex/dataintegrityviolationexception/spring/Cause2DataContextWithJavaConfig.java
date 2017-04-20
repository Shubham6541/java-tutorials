package org.nklkarthi.ex.dataintegrityviolationexception.spring;

import org.nklkarthi.spring.config.PersistenceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("org.nklkarthi.ex.dataIntegrityviolationexception.cause2")
@Import(PersistenceConfig.class)
public class Cause2DataContextWithJavaConfig {

    public Cause2DataContextWithJavaConfig() {
        super();
    }

    // beans

}