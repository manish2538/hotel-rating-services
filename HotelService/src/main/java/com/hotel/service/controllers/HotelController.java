package com.hotel.service.controllers;

import com.hotel.service.entitities.Hotel;
import com.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("v1/hotels")
@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public Hotel CreateHotel(@RequestBody final Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @GetMapping("/{hotelId}")
    public Hotel GetHotel(@PathVariable("hotelId") final String hotelid) {
        return hotelService.getHotel(hotelid);
    }

    @GetMapping
    public List<Hotel> GetHotels() {
        return hotelService.getAllHotels();
    }
}
