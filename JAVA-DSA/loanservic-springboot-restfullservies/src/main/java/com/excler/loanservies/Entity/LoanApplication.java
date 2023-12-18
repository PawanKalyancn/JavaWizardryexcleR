package com.excler.loanservies.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class LoanApplication {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String bankName;
	    private double minLoanAmount;
	    private double maxLoanAmount;
	    private double minInterestRate;
	    private int minCreditScore;
	    private int termLength;
	    private double processingFee;
	    private double rating;
	    private String status;

	    // Constructors, getters, and setters

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public double getMinLoanAmount() {
			return minLoanAmount;
		}

		public void setMinLoanAmount(double minLoanAmount) {
			this.minLoanAmount = minLoanAmount;
		}

		public double getMaxLoanAmount() {
			return maxLoanAmount;
		}

		public void setMaxLoanAmount(double maxLoanAmount) {
			this.maxLoanAmount = maxLoanAmount;
		}

		public double getMinInterestRate() {
			return minInterestRate;
		}

		public void setMinInterestRate(double minInterestRate) {
			this.minInterestRate = minInterestRate;
		}

		public int getMinCreditScore() {
			return minCreditScore;
		}

		public void setMinCreditScore(int minCreditScore) {
			this.minCreditScore = minCreditScore;
		}

		public int getTermLength() {
			return termLength;
		}

		public void setTermLength(int termLength) {
			this.termLength = termLength;
		}

		public double getProcessingFee() {
			return processingFee;
		}

		public void setProcessingFee(double processingFee) {
			this.processingFee = processingFee;
		}

		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public LoanApplication() {
	        // Default constructor for JPA
	    }

	    public LoanApplication(Long id, String bankName, double minLoanAmount, double maxLoanAmount,
				double minInterestRate, int minCreditScore, int termLength, double processingFee, double rating,
				String status) {
			super();
			this.id = id;
			this.bankName = bankName;
			this.minLoanAmount = minLoanAmount;
			this.maxLoanAmount = maxLoanAmount;
			this.minInterestRate = minInterestRate;
			this.minCreditScore = minCreditScore;
			this.termLength = termLength;
			this.processingFee = processingFee;
			this.rating = rating;
			this.status = status;
		}

		public LoanApplication(String bankName, double minLoanAmount, double maxLoanAmount, double minInterestRate,
	            int minCreditScore, int termLength, double processingFee, double rating, String status) {
	        this.bankName = bankName;
	        this.minLoanAmount = minLoanAmount;
	        this.maxLoanAmount = maxLoanAmount;
	        this.minInterestRate = minInterestRate;
	        this.minCreditScore = minCreditScore;
	        this.termLength = termLength;
	        this.processingFee = processingFee;
	        this.rating = rating;
	        this.status = status;
	    }

	    // Getters and setters...

	    // Additional methods if needed...
	}



