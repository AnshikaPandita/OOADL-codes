package dev;

import java.util.*;

public class Person {
	private Name name;
	private long aadhar_card;

	public Person(Name name, long aadhar_card) {
		super();
		this.name = name;
		this.aadhar_card = aadhar_card;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public long getAadhar_card() {
		return aadhar_card;
	}

	public void setAadhar_card(long aadhar_card) {
		this.aadhar_card = aadhar_card;
	}

	public void display() {
		System.out.print(toString());
	}

	@Override
	public String toString() {
		return "Person [name=" + name.getFirstn() + " " + name.getLastn() + ", aadhar_card=" + aadhar_card + "]";
	}
}