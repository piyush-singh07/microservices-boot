package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UserPreference;

@Repository("userPreference")
public interface PreferenceDao extends JpaRepository<UserPreference, Integer> {

	public UserPreference findByUsername(String username);

}
