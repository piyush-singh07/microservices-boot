package com.example.demo.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Movie {
	
	private String genre;
	
	private List<String> movies;

	public Movie(String genre, List<String> movies) {
		super();
		this.genre = genre;
		this.movies = movies;
	}

}
