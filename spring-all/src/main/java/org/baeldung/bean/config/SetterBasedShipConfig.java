package org.nklkarthi.bean.config;

import org.nklkarthi.bean.injection.Helm;
import org.nklkarthi.bean.injection.Ship;
import org.springframework.context.annotation.Bean;

public class SetterBasedShipConfig {

    @Bean
    public Ship ship() {
        return new Ship();
    }

    @Bean
    public Helm helm() {
        return new Helm();
    }
}
