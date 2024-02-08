package com.demo.registry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Rating {

	@Id
	private String ratingId;
	private int userId;
	private int hotelId;
	private int rating;
	private String feedback;
}
