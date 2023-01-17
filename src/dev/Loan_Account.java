package dev;

import java.util.*;

public class Loan_Account extends Account {
	private double loanAmt, rateLoan, durationLoan;
	private double amtLoan, emi, amtrepaid;

	public Loan_Account(double loanAmt, double rateLoan, double durationLoan) {
		super();
		this.loanAmt = loanAmt;
		this.rateLoan = rateLoan;
		this.durationLoan = durationLoan;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public double getRateLoan() {
		return rateLoan;
	}

	public void setRateLoan(double rateLoan) {
		this.rateLoan = rateLoan;
	}

	public double getDurationLoan() {
		return durationLoan;
	}

	public void setDurationLoan(double durationLoan) {
		this.durationLoan = durationLoan;
	}

	public double getAmtLoan() {
		return amtLoan;
	}

	public void setAmtLoan(double amtLoan) {
		this.amtLoan = amtLoan;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double getAmtrepaid() {
		return amtrepaid;
	}
	public void setAmtrepaid(double amtrepaid) { 
		this.amtrepaid = amtrepaid; 
		}
	public double Deposit() {
amtLoan=((this.loanAmt*this.rateLoan*this.durationLoan)/100); 
System.out.println(amtLoan); 
// TODO Auto-generated method stub
return this.getAmtLoan(); 
}public double emiCal() { 
	double t1,t2,t3,t4;
	t1=this.getLoanAmt()*this.getRateLoan()/100; 
	t2=(1+this.getRateLoan()/100); 
	t4=this.getDurationLoan();
	emi=(t1*Math.pow(t2, t4)) / (Math.pow(t2,( t4-1)) );
	System.out.println(emi); return this.getEmi();
	}
public double repaid() {
	amtrepaid=loanAmt-this.getEmi();
	System.out.println(amtrepaid); 
	return this.getAmtrepaid(); } 
}
