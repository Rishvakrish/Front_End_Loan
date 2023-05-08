package com.example.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.model.Admin;
import com.example.loan.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository df;
	
	//(1)getAll
	public List<Admin> getAdminDetails()
	{
		return df.findAll();
	}
	
	//(2)post
	public Admin postAdminDetails(Admin m)
	{
		return df.save(m);
	}
}
