package com.airbnb.web.convert;

import com.airbnb.web.entity.Apartment;
import com.airbnb.web.request.ApartmentRequest;

public class ApartmentConverter {
    public static Apartment convertRequestToEntity(ApartmentRequest apartmentRequest){
        return Apartment.builder()
                .apartmentName(apartmentRequest.getApartmentName())
                .content(apartmentRequest.getContent())
                .street(apartmentRequest.getStreet())
                .price(apartmentRequest.getPrice())
                .type(apartmentRequest.getType())
                .create_at(apartmentRequest.getCreateAt())
                .build();
    }
    public static ApartmentRequest convertEntityToRequest(Apartment apartment){
        return ApartmentRequest.builder()
                .id(apartment.getApartment_id())
                .apartmentName(apartment.getApartmentName())
                .content(apartment.getContent())
                .street(apartment.getStreet())
                .price(apartment.getPrice())
                .type(apartment.getType())
                .createAt(apartment.getCreate_at())
                .build();
    }
}
