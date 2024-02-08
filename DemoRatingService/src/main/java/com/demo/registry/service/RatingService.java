package com.demo.registry.service;

import java.util.List;

import com.demo.registry.entity.Rating;



public interface RatingService {

	Rating create(Rating rating);
	
	List<Rating>getAllRating();
	
    List<Rating> getRatingByUserId(int userId);

   
    List<Rating> getRatingByHotelId(int hotelId);
	
}
