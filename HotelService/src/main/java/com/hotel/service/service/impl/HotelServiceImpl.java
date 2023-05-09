package com.hotel.service.service.impl;

import com.hotel.service.entitities.Hotel;
import com.hotel.service.repositiries.HotelRepository;
import com.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel getHotel(final String hotelId) {
        return hotelRepository.findByHotelId(hotelId);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel createHotel(final Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
