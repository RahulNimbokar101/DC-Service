package com.me.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.entity.EducationDetails;

public interface EducationDetailsRepo extends JpaRepository<EducationDetails, Serializable>{

}
