package com.nklkarthi.constructordi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nklkarthi.constructordi.domain.Engine;
import com.nklkarthi.constructordi.domain.Transmission;

@Configuration
@ComponentScan("com.nklkarthi.constructordi")
public class Config {

    @Bean
    public Engine engine() {
        return new Engine("v8", 5);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("sliding");
    }
}
