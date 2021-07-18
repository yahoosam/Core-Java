package com.demo.objectstreams;

import java.io.Serializable;

public class CreditCardCust implements Serializable {

	String nameOnCard;
	String apartmentNo;
	String street;
	String city;
	String state;
	int zip;
	String cardType;
	transient String cardNo;
	transient String expiryDate;
	transient int cvv;

	public CreditCardCust(String nameOnCard, String apartmentNo, String street, String city, String state, int zip,
			String cardType, String cardNo, String expiryDate, int cvv) {
		this.nameOnCard = nameOnCard;
		this.apartmentNo = apartmentNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CreditCardCust [nameOnCard=" + nameOnCard + ", apartmentNo=" + apartmentNo + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", cardType=" + cardType + ", cardNo="
				+ cardNo + ", expiryDate=" + expiryDate + ", cvv=" + cvv + "]";
	}

}
