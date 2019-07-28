package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long country_id;

    @Column(name = "country_name")
    String country;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
//    List<Apartment> apartmentList;

    @OneToMany(mappedBy = "country")
    List<City> cities;
}
