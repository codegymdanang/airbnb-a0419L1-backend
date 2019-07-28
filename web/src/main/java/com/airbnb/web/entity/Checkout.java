package com.airbnb.web.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "checkout")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "checkout_id")
    Long checkin_id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
//    User user;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
//    Apartment apartment;

    @Column(name = "create_at")
    Date createAt;
}
