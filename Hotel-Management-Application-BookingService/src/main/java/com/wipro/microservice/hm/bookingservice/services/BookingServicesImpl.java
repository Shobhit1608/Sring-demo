package com.wipro.microservice.hm.bookingservice.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.wipro.microservice.hm.bookingservice.entities.Booking;
import com.wipro.microservice.hm.bookingservice.entities.BookingRequest;
import com.wipro.microservice.hm.bookingservice.entities.BookingStatus;
import com.wipro.microservice.hm.bookingservice.repositories.BookingRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BookingServicesImpl implements BookingServices {
	
    private final BookingRepository bookingRepository;


	@Override
	public Booking createBooking(BookingRequest bookingRequest) {
		Booking booking = new Booking();
        booking.setUserId(bookingRequest.getUserId());
        booking.setHotelId(bookingRequest.getHotelId());
        booking.setRoomId(bookingRequest.getRoomId());
        booking.setCheckInDate(bookingRequest.getCheckInDate());
        booking.setCheckOutDate(bookingRequest.getCheckOutDate());
        booking.setBookingDate(LocalDate.now());
        booking.setStatus(BookingStatus.PENDING);
        booking.setTotalPrice(40000.0);
        return bookingRepository.save(booking);
	}

}
