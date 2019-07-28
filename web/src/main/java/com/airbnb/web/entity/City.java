package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.jmx.export.annotation.ManagedNotification;

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

    @ManyToOne()
    @JoinColumn(name = "country_id")
    Country country;
    @OneToMany(mappedBy = "cities")
    List<Apartment> apartmentCity;
}
