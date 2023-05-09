package com.hotel.service.repositiries;

import com.hotel.service.entitities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
    Hotel findByHotelId(final String hotelId);
}
