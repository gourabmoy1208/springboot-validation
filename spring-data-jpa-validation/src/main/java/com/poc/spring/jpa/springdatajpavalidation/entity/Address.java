package com.poc.spring.jpa.springdatajpavalidation.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverrides({ 
	@AttributeOverride(name = "addressLine1", 
			column = @Column(name = "address_line_1")),
	@AttributeOverride(name = "addressLine2", 
			column = @Column(name = "address_line_2")),
	@AttributeOverride(name = "pin", 
			column = @Column(name = "pin"))

})
public class Address {

	private String addressLine1;
	private String addressLine2;
	private String pin;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
