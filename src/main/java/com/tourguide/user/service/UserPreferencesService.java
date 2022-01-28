package com.tourguide.user.service;

import java.util.Optional;
import java.util.UUID;

import com.tourguide.user.model.UserPreferences;

public interface UserPreferencesService {
	
	Optional<UserPreferences> findByUserId(UUID userId);
	
	UserPreferences saveUserPreferences(UserPreferences userPreferences);
	

}
