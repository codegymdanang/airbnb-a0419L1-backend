package com.airbnb.web.validate;

import com.airbnb.web.request.UserRequest;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.lang.annotation.Target;

@Component
public class UserValidate implements Validator {
    @Override
    public boolean supports(Class<?> aClass)
    {
        return UserRequest.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserRequest userRequest =(UserRequest) target;

        String phoneNumber = userRequest.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        if (phoneNumber.length()>11 || phoneNumber.length()<10){
            errors.rejectValue("phoneNumber", "phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }

//        String email = userRequest.getEmail();
//        ValidationUtils.rejectIfEmpty(errors,"email","email.empty");
//        if(!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
//            errors.rejectValue("email","email.matches");
//        }

        String fullName = userRequest.getFullName();
        ValidationUtils.rejectIfEmpty(errors,"fullName","fullName.empty");
        if (!fullName.matches("^\\p{L}+[\\p{L}\\p{Pd}\\p{Zs}']*\\p{L}+$|^\\p{L}+$")){
            errors.rejectValue("fullName", "fullName.matches");
        }

        String userName = userRequest.getUserName();
        ValidationUtils.rejectIfEmpty(errors,"userName","userName.empty");
        if (!fullName.matches("^[a-zA-Z0-9_.-]*$")){
            errors.rejectValue("userName", "userName.matches");
        }



    }
}
