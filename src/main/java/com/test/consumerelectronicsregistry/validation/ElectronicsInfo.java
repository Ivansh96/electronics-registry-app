package com.test.consumerelectronicsregistry.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ElectronicsInfoValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ElectronicsInfo {

    String message() default "Наименование и фирма производитель должны быть заполнены!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
