package com.cg.drycleaning.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

/*******************************
 *          @author         D. Manoj Kumar Reddy
 *          Description     It is an entity class that has various data members
 *         	Version         1.0
 *         	Created Date    23 MARCH 2021
 *******************************/
@Entity
public class Booking {
	@Id
	private long bookingId;
	private LocalDate bookingDate;
	@JsonFormat(pattern = "hh:mm:ss a")
	private LocalTime bookingTime;
	private String serviceType;
	@OneToOne
	private Customer customerDetails;

	public Booking() {
		super();
	}

	public Booking(long bookingId, LocalDate bookingDate, LocalTime bookingTime, String serviceType,
			Customer customerDetails) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.serviceType = serviceType;
		this.customerDetails = customerDetails;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@JsonIgnore
	public Customer getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", bookingTime=" + bookingTime
				+ ", serviceType=" + serviceType + ", customerDetails=" + customerDetails + "]";
	}

}
