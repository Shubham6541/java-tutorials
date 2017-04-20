package org.nklkarthi.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// @Configuration
@EnableTransactionManagement
@ComponentScan({ "org.nklkarthi.persistence.dao", "org.nklkarthi.persistence.service" })
@ImportResource({ "classpath:persistenceConfig.xml" })
public class PersistenceXmlConfig {

    public PersistenceXmlConfig() {
        super();
    }

}