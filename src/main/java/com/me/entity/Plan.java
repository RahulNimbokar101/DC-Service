package com.me.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Plan_Details")
public class Plan {
	@Id
	@GeneratedValue
	
	private Integer pid;
	private String PlaneName;

}
