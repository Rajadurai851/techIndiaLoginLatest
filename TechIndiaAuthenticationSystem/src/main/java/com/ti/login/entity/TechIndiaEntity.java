package com.ti.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="TechIndiaAuth")
public class TechIndiaEntity {

	@Id
	@GeneratedValue
	
	@Column(name="Id")
	int Id;
	
	@Column(name="username")
	String userName;
	
	@Column(name="password")
	String password;
	
}
