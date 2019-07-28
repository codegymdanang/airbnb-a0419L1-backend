package com.airbnb.web.convert;

import com.airbnb.web.entity.User;
import com.airbnb.web.request.UserRequest;

public class UserConveter {
    public static User convertRequestToEntity(UserRequest userRequest){
        return User.builder()
                .userName(userRequest.getUserName())
                .password(userRequest.getPassword())
                .fullName(userRequest.getFullName())
                .phoneNumber(userRequest.getPhoneNumber())
                .gender(userRequest.getGender())
//                .createAt(userRequest.getCreateAt())
                .build();
    }

    public static UserRequest convertEntityToRequest(User user){
        return UserRequest.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .password(user.getPassword())
                .fullName(user.getFullName())
                .phoneNumber(user.getPhoneNumber())
                .gender(user.getGender())
//                .createAt(user.getCreateAt())
                .build();
    }
}
