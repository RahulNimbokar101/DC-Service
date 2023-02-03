package com.me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.entity.Kids;
import com.me.repo.KidsRepo;
import com.me.service.KidService;

@Service
public class KidServiceImpl implements KidService{
@Autowired
private KidsRepo kidsRepo;
	
	@Override
	public String saveKids(Kids kids) {
		Kids kid = kidsRepo.save(kids);
		return "kids saved..";
	}

}
