package com.nirup.airBnbApp.service;

import com.nirup.airBnbApp.dto.HotelDto;
import com.nirup.airBnbApp.dto.HotelSearchRequest;
import com.nirup.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
