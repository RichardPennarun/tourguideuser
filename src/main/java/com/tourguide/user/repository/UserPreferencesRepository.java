package com.tourguide.user.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourguide.user.model.UserPreferences;

@Repository
public interface UserPreferencesRepository extends JpaRepository<UserPreferences, UUID>{
	
	Optional<UserPreferences> findByUserId(UUID userId);

}
