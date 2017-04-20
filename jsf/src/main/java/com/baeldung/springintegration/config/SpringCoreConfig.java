package com.nklkarthi.springintegration.config;

import com.nklkarthi.springintegration.dao.UserManagementDAO;
import com.nklkarthi.springintegration.dao.UserManagementDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreConfig {

    @Bean
    public UserManagementDAO userManagementDAO() {
        return new UserManagementDAOImpl();
    }
}
