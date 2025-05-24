package com.nirup.airBnbApp.dto;

import com.nirup.airBnbApp.entity.User;
import com.nirup.airBnbApp.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
