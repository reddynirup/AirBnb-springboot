package com.nirup.airBnbApp.dto;

import com.nirup.airBnbApp.entity.Hotel;
import com.nirup.airBnbApp.entity.Room;
import com.nirup.airBnbApp.entity.User;
import com.nirup.airBnbApp.entity.enums.BookingStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}