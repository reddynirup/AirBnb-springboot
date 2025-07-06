package com.nirup.airBnbApp.dto;

import com.nirup.airBnbApp.entity.User;
import com.nirup.airBnbApp.entity.enums.Gender;
import lombok.Data;
import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
