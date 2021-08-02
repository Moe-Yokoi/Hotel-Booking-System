package com.sample.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingNumber;
	
	private String firstName;
	private String lastName;
	private String email;
	private String roomType;
	private String date;
	
	
	public CustomerInfo() {
		
	}
	public CustomerInfo(String firstName, String lastName, String email, String roomType, String date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roomType = roomType;
		this.date = date;
		
	}
	public long getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
