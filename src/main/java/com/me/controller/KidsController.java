package com.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.me.entity.Kids;
import com.me.service.KidService;

@RestController
public class KidsController {
	@Autowired
	private KidService kidService;
	
	@PostMapping("/kids")
	public ResponseEntity<String> kidsaved(@RequestBody Kids kids){
		String kid = kidService.saveKids(kids);
		return new ResponseEntity<String>(kid, HttpStatus.CREATED);
		
	}

}
