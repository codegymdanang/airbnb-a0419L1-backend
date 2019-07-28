package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "apartment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "apartment_id")
    Long apartment_id;

    @Column(name = "apartment_name")
    String apartmentName;

    @Column(name = "content")
    String content;

    @Column(name = "street")
    String street;

    @Column(name = "price_perdate")
    Float price;

    @Column(name = "apartment_type")
    String type;

    @Column(name = "create_at")
    Date create_at;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    User user;

    @OneToMany(mappedBy = "apartmentList")
    List<ApartmentRent> apartmentRents;
    @ManyToOne()
    @JoinColumn(name = "city_id")
    City cities;
}
