package com.demo.registry.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.registry.entity.Rating;
import com.demo.registry.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
    RatingRepository ratingRepo;
    
	@Override
	public Rating create(Rating rating) {
		
		String randomRatingId = UUID.randomUUID().toString();
		rating.setRatingId(randomRatingId);
		return (Rating)ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
	
		return (List<Rating>) ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(int userId) {
		
		return ratingRepo.findByUserId(userId);
    }
	

	@Override
	public List<Rating> getRatingByHotelId(int hotelId) {
		
		return ratingRepo.findByHotelId(hotelId);
	}
}
