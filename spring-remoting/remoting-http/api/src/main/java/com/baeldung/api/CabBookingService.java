package com.nklkarthi.api;

public interface CabBookingService {
    Booking bookRide(String pickUpLocation) throws BookingException;
}
