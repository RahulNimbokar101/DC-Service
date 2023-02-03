package com.me.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.entity.Plan;
import com.me.repo.PlanRepo;
import com.me.service.PlanService;
@Service
public class PlanServiceImpl implements PlanService{

	@Autowired
	private PlanRepo planRepo;
	
	@Override
	public String getPlan() {
		List<Plan> plans = planRepo.findAll();
		return "sucess";
	}

}
