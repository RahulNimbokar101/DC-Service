package com.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.me.entity.IncomeDetails;
import com.me.service.IncomeDetaislService;

@RestController
public class IncomeDetailsController {
	@Autowired
	private IncomeDetaislService service;
	
	@PostMapping("/incomeDetais")
	public ResponseEntity<String> incomeDetaislServiceSave(@RequestBody  IncomeDetails details){
		String saveIncome = service.saveIncome(details);
		return new ResponseEntity<String>(saveIncome, HttpStatus.CREATED);
		
	}

}
