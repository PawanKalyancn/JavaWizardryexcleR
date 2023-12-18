package com.excler.loanservies.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excler.loanservies.Entity.LoanApplication;
import com.excler.loanservies.Expection.LoanApplicationAlreadyExistsException;
import com.excler.loanservies.Expection.LoanApplicationNotFoundException;
import com.excler.loanservies.Repostory.LoanApplicationRepository;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationServies {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    @Override
    public LoanApplication saveLoanApplication(LoanApplication loanApplication)
            throws LoanApplicationAlreadyExistsException {
        // Check if the application already exists
        if (loanApplicationRepository.existsById(loanApplication.getId())) {
            throw new LoanApplicationAlreadyExistsException(
                    "Loan application already exists with ID: " + loanApplication.getId());
        }

        // Implement the logic to save the loan application
        // Save the application using loanApplicationRepository
        return loanApplicationRepository.save(loanApplication);
    }

    @Override
    public LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException {
        // Implement the logic to approve the loan application
        // Check if the application exists, and throw an exception if not found
        Optional<LoanApplication> optionalLoanApplication = loanApplicationRepository.findById((long) loanId);
        if (optionalLoanApplication.isPresent()) {
            LoanApplication existingApplication = optionalLoanApplication.get();
            // Update the status of the application to "approved"
            existingApplication.setStatus("approved");
            // Save the updated application
            return loanApplicationRepository.save(existingApplication);
        } else {
            throw new LoanApplicationNotFoundException("Loan application not found with ID: " + loanId);
        }
    }

    @Override
    public LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException {
        // Implement the logic to reject the loan application
        // Check if the application exists, and throw an exception if not found
        Optional<LoanApplication> optionalLoanApplication = loanApplicationRepository.findById((long) loanId);
        if (optionalLoanApplication.isPresent()) {
            LoanApplication existingApplication = optionalLoanApplication.get();
            // Update the status of the application to "rejected"
            existingApplication.setStatus("rejected");
            // Save the updated application
            return loanApplicationRepository.save(existingApplication);
        } else {
            throw new LoanApplicationNotFoundException("Loan application not found with ID: " + loanId);
        }
    }
}
