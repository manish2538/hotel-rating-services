package com.rating.service.repositry;

import com.rating.service.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepostry extends JpaRepository<Rating, String> {

    List<Rating> findByHotelId(final String hotelId);

    List<Rating> findByUserId(final String userId);
}
