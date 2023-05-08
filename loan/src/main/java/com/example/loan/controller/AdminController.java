package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.Admin;
import com.example.loan.service.AdminService;


@RestController
public class AdminController {

	@Autowired
	AdminService k;
	
	        //(1) getAll
			@GetMapping("/getAdminDetails")
			public List<Admin> getAdminDetails()
			{
				return k.getAdminDetails();
			}
			
			//(2)post
			@PostMapping(value="/postAdminDetails")
			public Admin postAdminDetails(@RequestBody Admin m)
			{
				return k.postAdminDetails(m);
			}

}
