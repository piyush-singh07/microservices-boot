package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Movie;
import com.example.demo.model.Preference;

@RestController
@RequestMapping("/rest/movie")
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{username}")
	public Movie getMovieByPrefernce(@PathVariable String username) {
		ResponseEntity<Preference> resp = restTemplate.exchange("http://UserPreferenceService/rest/preference/" + username,
				HttpMethod.GET, null, Preference.class);
		return new Movie(resp.getBody().getPreference(),getMovies(resp.getBody().getPreference()));
	}

	private List<String> getMovies(String preference) {
		if(preference.equals("comedy"))
			return Arrays.asList("A","B","C","D");
		else if(preference.equals("horror"))
			return Arrays.asList("Q","W","E");
		else
			return null;
		
	}

}
