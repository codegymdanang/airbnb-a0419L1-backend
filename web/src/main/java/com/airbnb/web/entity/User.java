package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long id;

    @Column(name = "username")
    String userName;

    @Column(name = "password_user")
    String password;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "gender")
    Integer gender;

    @Column(name = "create_at")
    Date createAt;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
//    List<Apartment> apartmentList;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    List<Apartment> apartments;

    @OneToMany(mappedBy = "userRent",fetch = FetchType.LAZY)
    List<ApartmentRent> apartmentRent;
}
