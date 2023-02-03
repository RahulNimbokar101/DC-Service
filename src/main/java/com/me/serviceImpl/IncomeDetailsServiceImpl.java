package com.me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.entity.IncomeDetails;
import com.me.repo.IncomeDetailsRepo;
import com.me.service.IncomeDetaislService;

@Service
public class IncomeDetailsServiceImpl implements IncomeDetaislService{
	@Autowired
	private IncomeDetailsRepo incomeDetailsRepo;

	@Override
	public String saveIncome(IncomeDetails details) {
		IncomeDetails income = incomeDetailsRepo.save(details);
		return "incomeDetails save sucessfully..";
	}

}
