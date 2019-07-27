package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id")
    Long city_id;

    @Column(name = "city_name")
    String city;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id",referencedColumnName = "coutry_id",nullable = false)
    Country country;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
    List<Apartment> apartmentList;

}
