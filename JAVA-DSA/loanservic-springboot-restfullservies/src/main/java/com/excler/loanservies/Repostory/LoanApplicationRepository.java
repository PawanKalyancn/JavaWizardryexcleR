package com.excler.loanservies.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excler.loanservies.Entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

}
