package com.wipro.microservice.hm.bookingservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.microservice.hm.bookingservice.entities.Booking;
public interface BookingRepository extends JpaRepository<Booking,Long> {

}
