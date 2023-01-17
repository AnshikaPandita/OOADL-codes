package dev;

import java.util.*;

public class Fixed_Deposit extends Account {
	private double amtInvest, rate_FD, duration_FD;
	private double amt;

	public Fixed_Deposit(double amtInvest, double rate_FD, double duration_FD) {
		super();
		this.amtInvest = amtInvest;
		this.rate_FD = rate_FD;
		this.duration_FD = duration_FD;
	}

	public double getAmtInvest() {
		return amtInvest;
	}

	public void setAmtInvest(double amtInvest) {
		this.amtInvest = amtInvest;
	}

	public double getRate_FD() {
		return rate_FD;
	}

	public void setRate_FD(double rate_FD) {
		this.rate_FD = rate_FD;
	}

	public double getDuration_FD() {
		return duration_FD;
	}

	public void setDuration_FD(double duration_FD) {
		this.duration_FD = duration_FD;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public double Deposit() {
		amt = ((this.amtInvest * this.duration_FD * this.rate_FD) / 100);
		System.out.println(amt);
		return this.getAmt();
	}
}