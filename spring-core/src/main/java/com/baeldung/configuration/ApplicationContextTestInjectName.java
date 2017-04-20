package com.nklkarthi.configuration;

import com.nklkarthi.dependency.ArbitraryDependency;
import com.nklkarthi.dependency.YetAnotherArbitraryDependency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectName {

    @Bean
    public ArbitraryDependency yetAnotherFieldInjectDependency() {
        ArbitraryDependency yetAnotherFieldInjectDependency = new YetAnotherArbitraryDependency();
        return yetAnotherFieldInjectDependency;
    }
}
