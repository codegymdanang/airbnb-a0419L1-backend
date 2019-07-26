package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

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



}
