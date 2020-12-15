package com.example.demo.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserPreferenceBean {

	private String username;
	
	private String preference;

	public UserPreferenceBean(String username, String preference) {
		super();
		this.username = username;
		this.preference = preference;
	}
	
}
