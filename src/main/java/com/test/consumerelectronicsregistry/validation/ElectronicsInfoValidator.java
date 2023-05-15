package com.test.consumerelectronicsregistry.validation;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsCreateDto;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static org.springframework.util.StringUtils.hasText;

@Component
public class ElectronicsInfoValidator implements ConstraintValidator<ElectronicsInfo, ElectronicsCreateDto> {

    @Override
    public boolean isValid(ElectronicsCreateDto value, ConstraintValidatorContext context) {
        return hasText(value.getName()) && hasText(value.getBrand());
    }
}
