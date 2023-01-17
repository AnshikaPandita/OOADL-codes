package dev;

import java.util.*;
import java.lang.Math;

public class Term {
	Scanner sc = new Scanner(System.in);
	int i, n, j;
	private double mul;
	private int power;

	Term(double mul, int power, int j) {
		this.mul = mul;
		this.power = power;
		this.j = j;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getN() {
		return n;
	}

	public double getMul() {
		return mul;
	}

	public void setMul(double mul) {
		this.mul = mul;
	}

	void displayterm() {
		System.out.print(mul + "x^" + power);
	}
}