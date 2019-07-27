package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    String gender;

    @Column(name = "create_at")
    Date createAt;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
    List<Apartment> apartmentList;
    @ManyToMany(mappedBy="users")
    private List<Apartment> students = new ArrayList<Apartment>();

}
