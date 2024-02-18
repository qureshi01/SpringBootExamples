package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.User;
import com.excelr.repo.CustomizedUserRepository;
import com.excelr.repo.UserRepo;

@Service
public class ExcelrService implements ExcelrInterface {

	@Autowired
	private UserRepo repo;
	
	
	@Override
	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		repo.save()
		return repo.findByUsername(username);
	}

}
