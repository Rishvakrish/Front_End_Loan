package com.example.loan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.model.User;
import com.example.loan.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	UserRepository userRep;
	
	public List<User> getUserDetails()
	{
		return userRep.findAll();
	}
	
	public User postUserDetails(User m)
	{
		return userRep.save(m);
	}
	
	public User putUser(User s,int rno) {
		Optional<User> optional = userRep.findById(rno);
		User obj = null;
		if(optional.isPresent())
		{
			obj=optional.get();
			userRep.save(s);
		}
		return obj;
	}

	public void deleteUser(int regno)
	{
		 userRep.deleteById(regno);
	}
	
	@Transactional
	public int deleteByEmail(String email){
		return userRep.deleteUserByEmail(email);
	}

	@Transactional
	public int updateByEmail(String pass,String name,String phoneno,String role,String email){
		return userRep.updateUserByEmail(pass,name,phoneno,role,email);
	}
}
