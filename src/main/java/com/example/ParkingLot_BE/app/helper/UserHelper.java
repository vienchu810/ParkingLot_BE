package com.example.ParkingLot_BE.app.helper;


import com.example.ParkingLot_BE.app.controller.auth.payload.RegisterRequest;
import com.example.ParkingLot_BE.app.mess.Message;
import com.example.ParkingLot_BE.app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@RequiredArgsConstructor
public class UserHelper {

    private final UserService userService;

    public String checkRegisterUserRequest(RegisterRequest request) {
        if (userService.findByUsername(request.getUsername()) != null) {
            return Message.USERNAME_TON_TAI;
        }

        if (!StringUtils.isEmpty(request.getEmail()) && userService.findByEmail(request.getEmail()) != null) {
            return Message.EMAIL_TON_TAI;
        }

        if (!StringUtils.isEmpty(request.getPhone()) && userService.findByPhone(request.getPhone()) != null) {
            return Message.PHONE_TON_TAI;
        }

        return "";
    }
}
