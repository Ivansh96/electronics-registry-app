package com.test.consumerelectronicsregistry.intergration.annotation;

import com.test.consumerelectronicsregistry.ConsumerElectronicsRegistryApplicationTests;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ActiveProfiles("test")
@SpringBootTest(classes = ConsumerElectronicsRegistryApplicationTests.class)
public @interface IT {
}
