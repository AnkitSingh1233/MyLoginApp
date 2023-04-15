package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PublicRegister;
import com.nt.repository.IPublicRegisterRepo;


@Service
public class PublicRegisterImpl implements IPublicRegisterService {

	@Autowired
	private IPublicRegisterRepo repo;
	
	
	@Override
	public Long savePublicCredentials(PublicRegister user) {
		
		
		return repo.save(user).getId();
	
	}

}
