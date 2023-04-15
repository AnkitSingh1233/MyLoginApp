package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name="Public_Register_Tab")
@AllArgsConstructor
@NoArgsConstructor
public class PublicRegister {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="mobile_no_col")
	private Long mobile;

	@Column(name="name_col",length = 20)
	private String name;

	@Column(name="email_col",length=40)
	private String email;

	@Column(name="pwd_col",length=20)
	private String password;

	//----------Association Mapping---------
	@ManyToOne
	@JoinColumn(name="typeCode_fk_col")
	private UserType userType;  //HAS-A
	
	
	
	
	
	
	

}
