package com.rating.service.service;

import com.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(final Rating rating);

    List<Rating> getAllRatings();

    List<Rating> getRatingsByHotelId(final String hotelId);

    List<Rating> getRatingsByUserId(final String userId);

}
