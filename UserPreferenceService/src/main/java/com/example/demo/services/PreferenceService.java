package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserPreference;
import com.example.demo.repositories.PreferenceDao;

@Service
public class PreferenceService {
	
	@Autowired
	private PreferenceDao preferenceDao;
	
	public UserPreference savePreference(UserPreference userPreference)
	{
		return preferenceDao.save(userPreference);
	}
	
	public UserPreference getUserPrefer(String userName)
	{
		return preferenceDao.findByUsername(userName);
	}
	

}
