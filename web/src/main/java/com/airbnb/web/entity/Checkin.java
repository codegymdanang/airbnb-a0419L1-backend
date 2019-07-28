//package com.airbnb.web.entity;
//
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "checkin")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class Checkin {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "checkin_id")
//    Long checkin_id;
//
//    @ManyToOne()
//    @JoinColumn(name = "user_id")
//    User users;
//
//    @ManyToOne()
//    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id",nullable = false)
//    Apartment apartment;
//
//    @Column(name = "create_at")
//    Date createAt;
//}
