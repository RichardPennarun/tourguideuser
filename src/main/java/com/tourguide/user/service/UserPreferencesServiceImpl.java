package com.tourguide.user.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourguide.user.model.UserPreferences;
import com.tourguide.user.repository.UserPreferencesRepository;

@Service("userPreferencesService")
public class UserPreferencesServiceImpl implements UserPreferencesService {
	
	@Autowired
	private UserPreferencesRepository userPreferencesRepository;
	
	public UserPreferences saveUserPreferences(UserPreferences userPreferences) {
		UserPreferences savedUserPreferences = userPreferencesRepository.save(userPreferences);
		return savedUserPreferences;
	}

	@Override
	public Optional<UserPreferences> findByUserId(UUID userId) {
		Optional<UserPreferences> userPreferences = userPreferencesRepository.findByUserId(userId);
		return userPreferences;
	}

}
