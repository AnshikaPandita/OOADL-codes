package dev;

import java.util.*;

public class Saving_acc extends Account {
	private double bal;

	public Saving_acc(long acc_no, double balance, Account_holder acc_holder) {
		super(acc_no, balance, acc_holder);
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	private double min_bal = 1000;

	public double getMin_bal() {
		return min_bal;
	}

	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}

	public double deposit(double amt) {
		System.out.println("Name:" + this.getAcc_holder().getName());
		bal = this.getBalance() + amt;
		return this.setBalance(bal);
	}

	public double withdraw(double amt) {
		System.out.println("Name:" + this.getAcc_holder().getName());
		if (bal < min_bal) {
			System.out.println("This amount cannot be withdraw!!!!");
			return bal;
		} else {
			bal = this.getBalance() - amt;
			return this.setBalance(bal);
		}
	}

	public void transfer(Account acc, double amt) {
		System.out.println("Name:" + this.getAcc_holder().getName());
		bal = this.withdraw(amt);
		amt = acc.deposit(amt);
		System.out.println("Balance in " + this.getAcc_holder().getName() + "'s account is:" + amt);
		System.out.println("Balance in " + this.getAcc_holder().getName() + "'s account is" + bal);
	}
}