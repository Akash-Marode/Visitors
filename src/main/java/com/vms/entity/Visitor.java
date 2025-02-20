package com.vms.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visitor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; // id
	
	@Column(name = "Date", nullable = false)
	private LocalDate date; // date
	
	@Column(name = "In_Time", nullable = false)
	private LocalTime intime; // in time
	
	@Column(name = "Name", nullable = false)
	private String firstname; // name
	
	@Column(name = "Surname", nullable = false)
	private String lastname; // surname
	
	@Column(name = "Contact", nullable = false)
	private Long mobile; // contact
	
	@Column(name = "Vehicle_no")
	private String vehicle_no; // vehicle number on plate
	
	@Column(name = "Person_to_meet")
	private String meet_with; // person to meet
	
	@Column(name = "Reason", nullable = false)
	private String purpose; // reason for visit
	
	@Column(name = "Out_Time", nullable = false)
	private LocalTime outTime; // out time

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getIntime() {
		return intime;
	}

	public void setIntime(LocalTime intime) {
		this.intime = intime;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getMeet_with() {
		return meet_with;
	}

	public void setMeet_with(String meet_with) {
		this.meet_with = meet_with;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalTime outTime) {
		this.outTime = outTime;
	}

	public Visitor() {
		super();
		// TODO Auto-generated constructor stub and obviously to instantiate object.
	}

	public Visitor(Integer id, LocalDate date, LocalTime intime, String firstname, String lastname, Long mobile,
			String vehicle_no, String meet_with, String purpose, LocalTime outTime) {
		super();
		this.id = id;
		this.date = date;
		this.intime = intime;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.vehicle_no = vehicle_no;
		this.meet_with = meet_with;
		this.purpose = purpose;
		this.outTime = outTime;
	}

}
