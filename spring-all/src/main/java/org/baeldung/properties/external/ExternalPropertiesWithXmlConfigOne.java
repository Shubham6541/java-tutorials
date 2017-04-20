package org.nklkarthi.properties.external;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:configForPropertiesOne.xml")
@ComponentScan("org.nklkarthi.core")
public class ExternalPropertiesWithXmlConfigOne {

    public ExternalPropertiesWithXmlConfigOne() {
        super();
    }

}