package com.tourguide.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import java.util.UUID;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourguide.user.model.UserPreferences;
import com.tourguide.user.repository.UserPreferencesRepository;
import com.tourguide.user.service.UserPreferencesServiceImpl;


@SpringBootTest
public class ServiceTest {
	
	@Autowired
	UserPreferencesRepository userPreferencesRepository;
		
	
	@Test
	public void saveUserPreferencesTest() {

		UserPreferences up = new UserPreferences();
		final UUID id = UUID.randomUUID();
		final UUID uuid = UUID.randomUUID();
		up.setId(id);
		up.setUserId(uuid);
		up.setCurrency(null);
		up.setAttractionProximity(550);
		up.setLowerPricePoint(null);
		up.setHighPricePoint(null);
		up.setNightsStay(4);
		up.setNumberOfAdults(2);
		up.setNumberOfChildren(2);
		
		//userPreferencesServiceImpl = new UserPreferencesServiceImpl();
		//UserPreferencesServiceImpl userPreferencesServiceImpl2 = new UserPreferencesServiceImpl();
		UserPreferences savedUserPreferences = userPreferencesRepository.save(up);
		
		Optional<UserPreferences> userPreferences = userPreferencesRepository.findByUserId(uuid);
		//Optional<UserPreferences> userPreferences = userPreferencesServiceImpl.findByUserId(savedUserPreferences.getUserId());

		assertThat(savedUserPreferences.getUserId()).isEqualTo(uuid);
		assertThat(userPreferences).isPresent();
		
			
		
		
		
	}

}
