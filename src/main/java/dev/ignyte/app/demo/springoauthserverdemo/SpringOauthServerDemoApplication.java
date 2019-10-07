package dev.ignyte.app.demo.springoauthserverdemo;

import dev.ignyte.app.demo.springoauthserverdemo.filter.ParameterValidationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
public class SpringOauthServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauthServerDemoApplication.class, args);
    }

    @Bean(name = "aggregatorValidateFilter")
    public Filter someFilter() {
        return new ParameterValidationFilter();
    }

    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(someFilter());
        registration.addUrlPatterns("/apps/*");
        registration.setName("aggregatorValidateFilter");
        registration.setOrder(1);
        return registration;
    }
}
