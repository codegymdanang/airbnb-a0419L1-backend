//package com.airbnb.web.entity;
//
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "review")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class Review {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "review_id")
//    Long id;
//
//    @Column(name = "content")
//    String content;
//
//    @Column(name = "rating")
//    String rating;
//
//    @Column(name = "create_at")
//    Date create_at;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
//    User user;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name ="apartment_id",referencedColumnName = "apartment_id",nullable = false)
//    Apartment apartment;
//
//
//
//}
