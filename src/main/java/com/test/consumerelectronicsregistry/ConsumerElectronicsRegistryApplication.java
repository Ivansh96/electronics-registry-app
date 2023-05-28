package com.test.consumerelectronicsregistry;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerElectronicsRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerElectronicsRegistryApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
