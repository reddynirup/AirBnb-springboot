package com.nirup.airBnbApp.service;

import com.nirup.airBnbApp.dto.HotelPriceDto;
import com.nirup.airBnbApp.dto.HotelSearchRequest;
import com.nirup.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
