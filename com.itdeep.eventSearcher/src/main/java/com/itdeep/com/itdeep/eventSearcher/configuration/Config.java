package com.itdeep.com.itdeep.eventSearcher.configuration;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author EXG503
 */
@Configuration
public class Config {

    @Autowired
    CamelContext camelContext;

    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Bean
    CamelContextConfiguration contextConfiguration() {
        return new CamelContextConfiguration() {
            @Override
            public void beforeApplicationStart(CamelContext context) {
                System.out.println("Befor Camel Starting");
            }

            @Override
            public void afterApplicationStart(CamelContext camelContext) {
                System.out.println("After Starting Camel ");
            }
        };
    }

}
