package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

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

}
