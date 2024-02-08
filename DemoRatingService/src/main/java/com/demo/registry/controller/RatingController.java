package com.demo.registry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.registry.entity.Rating;
import com.demo.registry.service.RatingService;



@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	@PostMapping
	public ResponseEntity<Rating>createRating(@RequestBody Rating  rating)
	{
		Rating rating1 = ratingService.create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>>getAllRatings(){
		
		List<Rating>ratingAll = ratingService.getAllRating();
		
		return ResponseEntity.ok(ratingAll);
		
		
		
	}
	@GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    //get all of hotels
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable int hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
	
}
