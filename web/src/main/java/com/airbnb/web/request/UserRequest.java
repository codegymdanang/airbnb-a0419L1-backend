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

    String phoneNumber;

    String gender;

    Date createAt;
}
