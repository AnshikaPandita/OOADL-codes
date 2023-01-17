package dev;

import java.util.*;

public class Current_acc extends Account {
	double bal;

	public Current_acc(long acc_no, double balance, Account_holder acc_holder) {
		super(acc_no, balance, acc_holder);
	}

	public double deposit(double amt) {
		bal = this.getBalance() + amt;
		return bal;
	}

	public double withdraw(double amt) {
		bal = this.getBalance() - amt;
		return this.setBalance(bal);
	}

	public void transfer(Account acc, double amt) {
		bal = this.withdraw(amt);
		amt = acc.deposit(amt);
		System.out.println("Balance in" + this.getAcc_holder().getName() + "'s account is:" + amt);
		System.out.println("Balance in" + this.getAcc_holder().getName() + "'s account is:" + bal);
	}
}