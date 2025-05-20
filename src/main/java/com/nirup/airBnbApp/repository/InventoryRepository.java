package com.nirup.airBnbApp.repository;

import com.nirup.airBnbApp.entity.Inventory;
import com.nirup.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
