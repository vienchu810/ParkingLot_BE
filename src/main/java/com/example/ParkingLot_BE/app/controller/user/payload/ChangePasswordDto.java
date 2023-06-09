package com.example.ParkingLot_BE.app.controller.user.payload;

import lombok.Data;

@Data
public class ChangePasswordDto {
    private long userId;

    private String newPassword;
}
