package com.me.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Serializable>{

}
