package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "apartment_rent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApartmentRent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "apartment_rent_id")
    Long apartment_rent_id;

    @Column(name = "date_checkin")
    Date checkin;

    @Column(name = "date_checkout")
    Date checkout;

    @Column(name = "apartment_rent-status")
    String status;
    //done
    @ManyToOne()
    @JoinColumn(name = "user_id")
    User userRent;

    @ManyToOne()
    @JoinColumn(name = "apartment_id")
    Apartment apartmentList;
}
