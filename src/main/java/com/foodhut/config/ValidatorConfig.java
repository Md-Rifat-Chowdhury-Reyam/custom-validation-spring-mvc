package com.foodhut.config;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidatorConfig implements ConstraintValidator<Address, String>
{
    @Override
    public boolean isValid(String address, ConstraintValidatorContext context)
    {
        if(address == null)
        {
            return false;
        }
        return address.toLowerCase().contains("bangladesh");

    }
}
