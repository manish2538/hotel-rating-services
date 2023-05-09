package com.rating.service.service.impl;

import com.rating.service.entities.Rating;
import com.rating.service.repositry.RatingRepostry;
import com.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepostry ratingRepostry;

    @Override
    public Rating createRating(final Rating rating) {
        return ratingRepostry.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepostry.findAll();
    }

    @Override
    public List<Rating> getRatingsByHotelId(final String hotelId) {
        return ratingRepostry.findByHotelId(hotelId);
    }

    @Override
    public List<Rating> getRatingsByUserId(final String userId) {
        return ratingRepostry.findByUserId(userId);
    }
}
