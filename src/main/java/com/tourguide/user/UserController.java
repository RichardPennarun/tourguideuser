package com.tourguide.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tourguide.user.model.UserPreferences;
import com.tourguide.user.service.UserPreferencesServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserPreferencesServiceImpl userPreferencesServiceImpl;

    /*
	 * Read - Get user preferences
	 * @param Id The user id
	 * @return An object UserPreferences
	 */
	@GetMapping("getUserPreferences/{userId}")
	public Optional<UserPreferences> getUserPreferences(@PathVariable("userId") final UUID userId) {
		Optional<UserPreferences> userPreferences = userPreferencesServiceImpl.findByUserId(userId);
		return userPreferences;
	}

    /*
	 * Save - Save user preferences
	 * @param An object UserPreferences
	 * @return The object UserPreferences that has bean saved
	 */
	@PostMapping("/UserPreferences")
	public UserPreferences savePreferences(@RequestBody UserPreferences userPreferences) {
		UserPreferences savedUserPreferences = userPreferencesServiceImpl.saveUserPreferences(userPreferences);
		return savedUserPreferences;
	}

	
}
