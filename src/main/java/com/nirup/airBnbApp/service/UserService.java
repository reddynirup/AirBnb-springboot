package com.nirup.airBnbApp.service;

import com.nirup.airBnbApp.dto.ProfileUpdateRequestDto;
import com.nirup.airBnbApp.dto.UserDto;
import com.nirup.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
