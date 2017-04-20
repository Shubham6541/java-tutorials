package com.nklkarthi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nklkarthi.beaninjection.AnotherSampleDAOBean;
import com.nklkarthi.beaninjection.ExampleDAOBean;
import com.nklkarthi.beaninjection.ExampleServiceBean;
import com.nklkarthi.beaninjection.IAnotherSampleDAO;
import com.nklkarthi.beaninjection.IExampleDAO;
import com.nklkarthi.beaninjection.IExampleService;

@Configuration
@ComponentScan(basePackages = { "com.nklkarthi.beaninjection" })
public class ApplicationContextTestBeanInjectionTypes {

    @Bean
    public IExampleDAO exampleDAO() {
        return new ExampleDAOBean("Mandatory DAO Property X");
    }

    @Bean
    public IExampleService exampleServiceBean() {
        ExampleServiceBean serviceBean = new ExampleServiceBean(exampleDAO());
        serviceBean.setAnotherSampleDAO(anotherSampleDAO());
        serviceBean.setPropertyX("Some Service Property X");
        return serviceBean;
    }

    @Bean
    public IAnotherSampleDAO anotherSampleDAO() {
        return new AnotherSampleDAOBean("Mandatory DAO Property Y");
    }

}
