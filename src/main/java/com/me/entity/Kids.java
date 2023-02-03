package com.me.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "kids_Details")
public class Kids {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer kid;
	private String Kname;
	private Integer Kage;
	private Integer pid;

}
