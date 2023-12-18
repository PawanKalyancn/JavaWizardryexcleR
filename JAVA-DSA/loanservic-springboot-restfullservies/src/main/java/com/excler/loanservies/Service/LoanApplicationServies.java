package com.excler.loanservies.Service;

	import com.excler.loanservies.Entity.LoanApplication;
import com.excler.loanservies.Expection.LoanApplicationAlreadyExistsException;
import com.excler.loanservies.Expection.LoanApplicationNotFoundException;

	public interface LoanApplicationServies {
  
	LoanApplication saveLoanApplication(LoanApplication loanApplication) throws LoanApplicationAlreadyExistsException;

	    LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException;

	    LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException;
	}


