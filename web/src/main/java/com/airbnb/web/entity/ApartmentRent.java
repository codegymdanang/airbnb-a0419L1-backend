package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

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
    Long rent_id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
    User user;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
    Apartment apartment;

    @Column(name = "date_checkin")
    Date checkin;

    @Column(name = "date_checkout")
    Date checkout;

    @Column(name = "apartment_rent-status")
    String status;

}
