/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.validator;

import com.lemon.spring.domain.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","required","Field is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastName","required","Field is required.");
    }
}
