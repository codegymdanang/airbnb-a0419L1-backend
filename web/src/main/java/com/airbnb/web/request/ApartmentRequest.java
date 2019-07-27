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
public class ApartmentRequest {
    Long id;

    String apartmentName;

    String content;

    String street;

    Float price;

    String type;

    Date createAt;

}
