package com.hotel.service.entitities;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "hotel_service")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hotel extends Base {

    private String hotelId;
    private String name;
    private String location;


    @PrePersist
    @Override
    public void prePersist() {
        super.prePersist();
        setHotelId(getExternalId());
    }

}
