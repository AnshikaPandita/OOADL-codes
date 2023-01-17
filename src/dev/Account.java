package dev;

import java.util.*;

public abstract class Account {
	private long acc_no;
	private double balance;
	private Account_holder acc_holder;

	public Account(long acc_no, double balance, Account_holder acc_holder) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
		this.acc_holder = acc_holder;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

	public Account_holder getAcc_holder() {
		return acc_holder;
	}

	public void setAcc_holder(Account_holder acc_holder) {
		this.acc_holder = acc_holder;
	}

	abstract double deposit(double amt);

	abstract double withdraw(double amt);

	abstract void transfer(Account acc, double amt);
}