package dev;

public class Taxpayer {

	long income;

	int tax;

	public Taxpayer(long income, int tax) {

		super();

		this.income = income;

		this.tax = tax;

	}

	public int getTax() {

		return tax;

	}

	public void setTax(int tax) {

		this.tax = tax;

	}

	public long getIncome() {

		return income;

	}

	public void setIncome(long income) {

		this.income = income;

	}

}
