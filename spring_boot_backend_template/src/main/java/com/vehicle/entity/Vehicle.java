package com.vehicle.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="vehicles")
@Setter
@Getter
@ToString

public class Vehicle extends BaseEntity{
	
	@Column(name="vname")
	private String vehicleName;
	
	@Enumerated
	@Column(name="company")
	private CompanyName companyName;
	
	@Column(name="v_num")
	private String vehicleNumber;
	
	@Column(name="v_type")
	private String vehicleType;
	
	@Column(name="purchase_date")
	private LocalDate purchaseDate;
	
	@ManyToOne
	@JoinColumn(name="user_id_fk")
	private User user;
	
	
	
	
	
	

}
