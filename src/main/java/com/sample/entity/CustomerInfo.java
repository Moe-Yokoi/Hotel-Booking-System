package com.sample.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class CustomerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name ="customerInfo_seq")
	private long bookingNumber;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone; 
	private String roomType;
	private String checkIn;
	private String checkOut;
	private int guest;
	
	
	public CustomerInfo() {
		
	}
	public CustomerInfo(String firstName, String lastName, String email, String phone, String roomType, String checkIn, String checkOut, int guest) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.roomType = roomType;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guest = guest;
		
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
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}

}
