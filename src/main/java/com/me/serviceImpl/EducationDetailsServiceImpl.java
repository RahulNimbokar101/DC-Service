package com.me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.entity.EducationDetails;
import com.me.repo.EducationDetailsRepo;
import com.me.repo.PlanRepo;
import com.me.service.EducationDetailsService;

@Service
public class EducationDetailsServiceImpl implements EducationDetailsService{

	@Autowired
	private EducationDetailsRepo educationDetailsRepo;
	
	@Autowired
	private PlanRepo planRepo;
	@Override
	public String saveEducationDetails(EducationDetails educationDetails) {
		
		EducationDetails education = educationDetailsRepo.save(educationDetails);
		return "Education Details saved..";
	}

}
