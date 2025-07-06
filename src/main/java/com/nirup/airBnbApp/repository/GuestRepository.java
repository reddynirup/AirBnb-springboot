package com.nirup.airBnbApp.repository;

import com.nirup.airBnbApp.entity.Guest;
import com.nirup.airBnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}