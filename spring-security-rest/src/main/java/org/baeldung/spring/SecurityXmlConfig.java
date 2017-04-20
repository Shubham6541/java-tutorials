package org.nklkarthi.spring;

import org.springframework.context.annotation.ComponentScan;

// @Configuration
// @ImportResource({ "classpath:webSecurityConfig.xml" })
@ComponentScan("org.nklkarthi.security")
public class SecurityXmlConfig {

    public SecurityXmlConfig() {
        super();
    }

}
