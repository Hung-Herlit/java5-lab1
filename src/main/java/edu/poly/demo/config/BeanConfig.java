package edu.poly.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.poly.demo.service.CompanyService;

@Configuration
public class BeanConfig {
    @Bean
    public CompanyService companyService() {
        return new CompanyService();
    }
}
