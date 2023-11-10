package com.kipper.emailservice.infra.ses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsyncClientBuilder;
import com.amazonaws.regions.Regions;

@Configuration
public class AwsSesConfig {

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceAsyncClientBuilder.standard()
                .withRegion(Regions.US_EAST_1) // Substitua pelo código da sua região desejada
                .build();
    }
}
