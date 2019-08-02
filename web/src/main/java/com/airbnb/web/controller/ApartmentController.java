package com.airbnb.web.controller;

import com.airbnb.web.convert.ApartmentConverter;
import com.airbnb.web.convert.UserConveter;
import com.airbnb.web.entity.Apartment;
import com.airbnb.web.entity.User;
import com.airbnb.web.request.ApartmentRequest;
import com.airbnb.web.request.UserRequest;
import com.airbnb.web.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/v1")
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    @PostMapping("/apartment")
    public ResponseEntity<Void> createApartment(@RequestBody ApartmentRequest apartmentRequest, UriComponentsBuilder ucBuilder) {
        Apartment apartment = ApartmentConverter.convertRequestToEntity(apartmentRequest);

        apartmentService.save(apartment);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/apartment/{id}").buildAndExpand(apartment.getApartment_id()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
