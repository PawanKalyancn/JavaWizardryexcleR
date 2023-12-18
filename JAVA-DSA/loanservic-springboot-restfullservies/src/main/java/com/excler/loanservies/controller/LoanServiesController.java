package com.excler.loanservies.controller;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excler.loanservies.Entity.LoanApplication;
import com.excler.loanservies.Expection.LoanApplicationAlreadyExistsException;
import com.excler.loanservies.Expection.LoanApplicationNotFoundException;
import com.excler.loanservies.Service.LoanApplicationServies;
	

	public class LoanServiesController {
		


		@RestController
		@RequestMapping("/api/v1")
		public class LoanApplicationController {

		    @Autowired
		    private LoanApplicationServies loanApplicationService;

		    @PostMapping("/applyloan")
		    public ResponseEntity<LoanApplication> applyLoan(@RequestBody LoanApplication loanApplication) {
		        try {
		            LoanApplication savedLoan = loanApplicationService.saveLoanApplication(loanApplication);
		            return new ResponseEntity<>(savedLoan, HttpStatus.CREATED);
		        } catch (LoanApplicationAlreadyExistsException e) {
		            return new ResponseEntity<>(HttpStatus.CONFLICT);
		        }
		    }

		    @PostMapping("/approveloan/{loanId}")
		    public ResponseEntity<LoanApplication> approveLoanApplication(@PathVariable int loanId) {
		        try {
		            LoanApplication approvedLoan = loanApplicationService.approveLoanApplication(loanId);
		            return new ResponseEntity<>(approvedLoan, HttpStatus.OK);
		        } catch (LoanApplicationNotFoundException e) {
		            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		        }
		    }

		    @PostMapping("/rejectloan/{loanId}")
		    public ResponseEntity<LoanApplication> rejectLoanApplication(@PathVariable int loanId) {
		        try {
		            LoanApplication rejectedLoan = loanApplicationService.rejectLoanApplication(loanId);
		            return new ResponseEntity<>(rejectedLoan, HttpStatus.OK);
		        } catch (LoanApplicationNotFoundException e) {
		            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		        }
		    }
		}

	}
