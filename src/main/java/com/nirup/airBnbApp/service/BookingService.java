package com.nirup.airBnbApp.service;

import com.nirup.airBnbApp.dto.BookingDto;
import com.nirup.airBnbApp.dto.BookingRequest;
import com.nirup.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}