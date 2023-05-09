package com.rating.service.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ratings")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rating extends Base {

    private String ratingId;
    private String hotelId;
    private Integer rating;
    private String feedback;
    private String userId;

    @PrePersist
    @Override
    public void prePersist(){
        super.prePersist();
        setRatingId(getExternalId());
    }
}
