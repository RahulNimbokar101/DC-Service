package com.me.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.entity.IncomeDetails;

public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Serializable> {

}
