package org.dnyanyog.dto;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Component
public class CustomerRequest {

	

    @NotNull(message="First name is mendatory")
    @NotBlank(message="First name should not be blank")
	private String firstName;
    
    @NotNull(message="Last name is mendatory")
    @NotBlank(message="Last name should not be blank")
	private String lastName;
    
    @NotNull(message="middle name is mendatory")
    @NotBlank(message="middle name should not be blank")
	private String middleName;
    
    
	private String dateOfBirth;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String zip;
	
	private String city;
	
	private String state;
	
	private String country;
	

	@Min(value = 10,message = "Minimum digits should be 10")
	@Max(value = 12,message = "Minimum digits should be 12")
	private String mobilePhone;
	

	@Min(value = 10,message = "Minimum digits should be 10")
	@Max(value = 12,message = "Minimum digits should be 12")
	private String homePhone;
	

	@Min(value = 10,message = "Minimum digits should be 10")
	@Max(value = 12,message = "Minimum digits should be 12")
	private String workPhone;
	

	@NotNull(message="email id is mendatory")
	@NotBlank(message="Email id should not be blank")
	@Email(message="Invalid email format")
	private String emailID;
	
	private long customerId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNaame) {
		this.lastName = lastNaame;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

}