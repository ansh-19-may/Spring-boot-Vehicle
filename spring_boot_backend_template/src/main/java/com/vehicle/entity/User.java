package com.vehicle.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="users")
@Getter
@Setter
@ToString

public class User extends BaseEntity{
	
	@Column(name="user_name")
	private String userName;
	
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="city")
	private String city;
	
	@Column(name="contact_no")
	private int contactNumber;
	
	@Column(name="birth_date")
	private LocalDate birthDate;

}
