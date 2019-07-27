package com.airbnb.web.validate;

import com.airbnb.web.request.ApartmentRequest;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ApartmentValidate implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return ApartmentRequest.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ApartmentRequest apartmentRequest =(ApartmentRequest)target;

        String apartmentName = apartmentRequest.getApartmentName();
        ValidationUtils.rejectIfEmpty(errors,"apartmentName","apartmentName.empty");
        if (!apartmentName.matches("^\\p{L}+[\\p{L}\\p{Pd}\\p{Zs}']*\\p{L}+$|^\\p{L}+$")){
            errors.rejectValue("apartmentName", "apartmentName.matches");
        }

        String street = apartmentRequest.getStreet();
        ValidationUtils.rejectIfEmpty(errors,"street","street.empty");
        if (!street.matches("^[a-zA-Z0-9_.-]*$")){
            errors.rejectValue("street", "street.matches");
        }

        String type = apartmentRequest.getType();
        ValidationUtils.rejectIfEmpty(errors,"type","type.empty");
        if (!type.matches("^[a-zA-Z0-9_.-]*$")){
            errors.rejectValue("type", "type.matches");
        }

    }
}
