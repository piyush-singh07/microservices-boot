package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.UserPreference;
import com.example.demo.services.PreferenceService;
import com.example.demo.util.UserPreferenceBean;

@RestController
@RequestMapping("/rest/preference")
public class PreferernceController {

	@Autowired
	private PreferenceService preferenceService;

	@GetMapping("/{username}")
	public UserPreferenceBean getUserPrefer(@PathVariable String username) {
		UserPreference upf = preferenceService.getUserPrefer(username);
		return new UserPreferenceBean(upf.getUsername(), upf.getPreference());
	}

	@PostMapping("/post")
	public UserPreferenceBean saveUserPreference(@RequestBody UserPreferenceBean userPrefer) {
		UserPreference pref = preferenceService
				.savePreference(new UserPreference(userPrefer.getUsername(), userPrefer.getPreference()));
		return new UserPreferenceBean(pref.getUsername(), pref.getPreference());
	}

}
