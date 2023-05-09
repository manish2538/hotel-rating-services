package com.rating.service.controller;


import com.rating.service.entities.Rating;
import com.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;


    @PostMapping
    public Rating rating(@RequestBody final Rating rating) {
        return ratingService.createRating(rating);
    }


    @GetMapping
    public List<Rating> ratingList() {
        return ratingService.getAllRatings();
    }

    @GetMapping("/users/{userId}")
    public List<Rating> getRatingByUserId(@PathVariable final String userId) {
        return ratingService.getRatingsByUserId(userId);
    }

    @GetMapping("/hotels/{hotelId}")
    public List<Rating> getRatingByHotelId(@PathVariable final String hotelId) {
        return ratingService.getRatingsByHotelId(hotelId);
    }

}
