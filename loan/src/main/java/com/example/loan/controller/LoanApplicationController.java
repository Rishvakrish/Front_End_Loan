package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.LoanApplication;
import com.example.loan.service.LoanApplicationService;


@RestController
public class LoanApplicationController {

	@Autowired
	LoanApplicationService l;
	
		@GetMapping("/getLoanDetails")
		public List<LoanApplication> getLoanDetails()
		{
			return l.getLoanDetails();
		}
		
		@PostMapping(value="/postLoanDetails")
		public LoanApplication postLoanDetails(@RequestBody LoanApplication m)
		{
			return l.postLoanDetails(m);
		}
		
		@PutMapping(value="/putApplication/{rno}")
		public LoanApplication putApplication(@RequestBody LoanApplication s,@PathVariable int loanid)
		{
			return l.putApplication(s,loanid);
		}

		@DeleteMapping(value="/deleteApplication/{loanid}")
		public void deleteApplication(@PathVariable int loanid)
		{
			l.deleteApplication(loanid);
		}
}
