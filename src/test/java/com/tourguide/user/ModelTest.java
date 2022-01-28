package com.tourguide.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Currency;
import java.util.Locale;
import java.util.UUID;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import org.hibernate.type.CurrencyType;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourguide.user.model.User;
import com.tourguide.user.model.UserPreferences;

@SpringBootTest
public class ModelTest {


	@Test
	public void getUserTest() {
		User u = new User();
		final UUID uuid = UUID.randomUUID();
		u.setId(uuid);
		u.setUserName("adam");
		u.setPhoneNumber("06-00000000");
		u.setEmailAddress("adam@mail.com");
		assertThat(u.getId()).isEqualTo(uuid);
		assertThat(u.getUserName()).isEqualTo("adam");
		assertThat(u.getPhoneNumber()).isEqualTo("06-00000000");
		assertThat(u.getEmailAddress()).isEqualTo("adam@mail.com");
	}
	
	@Test
	public void setUserTest() {
		final UUID id = UUID.randomUUID();
		
		User user = new User(id, "adam", "06-00000000", "adam@mail.com");
		assertThat(user.getId()).isEqualTo(id);
		assertThat(user.getUserName()).isEqualTo("adam");
		assertThat(user.getPhoneNumber()).isEqualTo("06-00000000");
		assertThat(user.getEmailAddress()).isEqualTo("adam@mail.com");
	}
	@Test
	public void getUserPreferencesTest() {
		UserPreferences up = new UserPreferences();
		final UUID uuid = UUID.randomUUID();
		up.setUserId(uuid);
		up.setCurrency(null);
		up.setAttractionProximity(550);
		up.setLowerPricePoint(null);
		up.setHighPricePoint(null);
		up.setNightsStay(4);
		up.setNumberOfAdults(2);
		up.setNumberOfChildren(2);
		assertThat(up.getUserId()).isEqualTo(uuid);
		assertThat(up.getCurrency()).isEqualTo(null);
		assertThat(up.getAttractionProximity()).isEqualTo(550);
		assertThat(up.getLowerPricePoint()).isEqualTo(null);
		assertThat(up.getHighPricePoint()).isEqualTo(null);
		assertThat(up.getNightsStay()).isEqualTo(4);
		assertThat(up.getNumberOfAdults()).isEqualTo(2);
		assertThat(up.getNumberOfChildren()).isEqualTo(2);
	}
	
	@Test
	public void setUserPreferencesTest() {
		final UUID id = UUID.randomUUID();
		final UUID uuid = UUID.randomUUID();
		final CurrencyType currency = null;
		final int attractionProximity = 1500;
		final Money lowerPricePoint = null;
		final Money highPricePoint = null;
		final int nightsStay = 4;
		final int numberOfAdults = 2;
		final int numberOfChildren = 2;
		
		UserPreferences userPreferences = new UserPreferences(id, uuid, currency, attractionProximity, lowerPricePoint,
				highPricePoint, nightsStay, numberOfAdults, numberOfChildren);
		assertThat(userPreferences.getId()).isEqualTo(id);
		assertThat(userPreferences.getUserId()).isEqualTo(uuid);
		assertThat(userPreferences.getCurrency()).isEqualTo(currency);
		assertThat(userPreferences.getAttractionProximity()).isEqualTo(attractionProximity);
		assertThat(userPreferences.getLowerPricePoint()).isEqualTo(lowerPricePoint);
		assertThat(userPreferences.getHighPricePoint()).isEqualTo(highPricePoint);
		assertThat(userPreferences.getNightsStay()).isEqualTo(nightsStay);
		assertThat(userPreferences.getNumberOfAdults()).isEqualTo(numberOfAdults);
		assertThat(userPreferences.getNumberOfChildren()).isEqualTo(numberOfChildren);
	}
}
