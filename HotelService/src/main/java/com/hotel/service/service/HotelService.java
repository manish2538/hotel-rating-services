package com.hotel.service.service;

import com.hotel.service.entitities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel getHotel(final String hotelId);

    List<Hotel> getAllHotels();

    Hotel createHotel(final Hotel hotel);


}
