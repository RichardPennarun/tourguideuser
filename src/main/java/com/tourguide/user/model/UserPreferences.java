package com.tourguide.user.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.type.CurrencyType;
import org.javamoney.moneta.Money;

@Entity
public class UserPreferences {

	@Id
	private UUID id;
	private UUID userId;
	private CurrencyType currency;
	private int attractionProximity;
	private Money lowerPricePoint;
	private Money highPricePoint;
	private int nightsStay;
	private int numberOfAdults;
	private int numberOfChildren;
	
	public UserPreferences() {
		super();
	}

	public UserPreferences(UUID id, UUID userId, CurrencyType currency, int attractionProximity, Money lowerPricePoint,
			Money highPricePoint, int nightsStay, int numberOfAdults, int numberOfChildren) {
		super();
		this.id = id;
		this.userId = userId;
		this.currency = currency;
		this.attractionProximity = attractionProximity;
		this.lowerPricePoint = lowerPricePoint;
		this.highPricePoint = highPricePoint;
		this.nightsStay = nightsStay;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	

	public CurrencyType getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}

	public int getAttractionProximity() {
		return attractionProximity;
	}

	public void setAttractionProximity(int attractionProximity) {
		this.attractionProximity = attractionProximity;
	}

	public Money getLowerPricePoint() {
		return lowerPricePoint;
	}

	public void setLowerPricePoint(Money lowerPricePoint) {
		this.lowerPricePoint = lowerPricePoint;
	}

	public Money getHighPricePoint() {
		return highPricePoint;
	}

	public void setHighPricePoint(Money highPricePoint) {
		this.highPricePoint = highPricePoint;
	}

	public int getNightsStay() {
		return nightsStay;
	}

	public void setNightsStay(int nightsStay) {
		this.nightsStay = nightsStay;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	
	
	

}
