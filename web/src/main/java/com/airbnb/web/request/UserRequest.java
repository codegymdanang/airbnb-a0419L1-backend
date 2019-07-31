package com.airbnb.web.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    Long id;

    String fullName;

    String userName;

    String password;

    public UserRequest(String fullName, String userName, String password, String phoneNumber) {

        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }

    String phoneNumber;

    Integer gender;
//
//    Date createAt;
}
