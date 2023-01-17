package dev;

import java.util.ArrayList;
import java.util.Scanner;

public class Polynomial {
	Scanner sc = new Scanner(System.in);
	int i, j;
	private int power, max;
	private double mul;
	double val = 0.0;
	private ArrayList<Term> ter = new ArrayList<Term>();

	public Polynomial() {
		System.out.println("Enter the number of terms of the polynomial:");
		int n = sc.nextInt();
		for (i = 0, j = 1; i < n; i++) {
			System.out.println("Enter the multiplier of " + j + " term:");
			mul = sc.nextInt();
			System.out.println("Enter the power of " + j + " term:");
			power = sc.nextInt();
			Term t = new Term(mul, power, j);
			ter.add(t);
			j++;
		}
	}

	public Scanner getSc() {
		return sc;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getMul() {
		return mul;
	}

	public void setMul(double mul) {
		this.mul = mul;
	}

	public ArrayList<Term> getTer() {
		return ter;
	}

	public void setTer(ArrayList<Term> ter) {
		this.ter = ter;
	}

	public void displaypoly() {
		for (int j = 0; j < ter.size(); j++) {
			ter.get(j).displayterm();
			if (j != ter.size() - 1) {
				System.out.print("+");
			}
		}
	}

	public double calculate(int x) {
		for (int i = 0; i < ter.size(); i++) {
			val = val + (ter.get(i).getMul()) * Math.pow(x, ter.get(i).getPower());
		}
		return val;
	}

	public int getmaxval() {
		max = ter.get(0).getPower();
		for (int i = 0; i < ter.size(); i++) {
			if (ter.get(i).getPower() > max) {
				max = ter.get(i).getPower();
			}
		}
		return max;
	}

	public ArrayList<Term> sort() {
		ArrayList<Term> sorting = new ArrayList<Term>();
		Term max = ter.get(0);
		int maxp = ter.get(0).getPower();
		for (int i = 0; i < ter.size(); i++) {
			for (int j = 0; j < ter.size(); j++) {
				if (ter.get(j).getPower() > maxp) {
					maxp = ter.get(j).getPower();
					max = ter.get(i);
					sorting.add(max);
					ter.remove(max);
				}
			}
		}
		dsort(sorting);
		return sorting;
	}

	public void dsort(ArrayList sort) {
		for (int j = 0; j < sort.size(); j++) {
			System.out.println(sort.get(j));
		}
	}
}