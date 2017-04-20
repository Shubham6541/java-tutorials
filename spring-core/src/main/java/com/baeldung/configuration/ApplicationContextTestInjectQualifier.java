package com.nklkarthi.configuration;

import com.nklkarthi.dependency.AnotherArbitraryDependency;
import com.nklkarthi.dependency.ArbitraryDependency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectQualifier {

    @Bean
    public ArbitraryDependency defaultFile() {
        ArbitraryDependency defaultFile = new ArbitraryDependency();
        return defaultFile;
    }

    @Bean
    public ArbitraryDependency namedFile() {
        ArbitraryDependency namedFile = new AnotherArbitraryDependency();
        return namedFile;
    }
}
