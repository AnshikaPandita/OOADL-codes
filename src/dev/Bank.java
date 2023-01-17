package dev;

import java.util.*;

public class Bank {
	ArrayList<Account> account = new ArrayList<>();

	public void Display(Name N) {
		for (int i = 0; i < account.size(); i++) {
			System.out.println();
		}
	}

	public void acnname(Name N) {
		System.out.println("name is " + N.getFirst_name() + N.getLast_name());
	}

	public void ADD(Name N) {
		account.add(null);
	}
}