package dev;

import java.util.ArrayList;

public class Bank { //
	private CreditCard cc; ArrayList<CreditCard> creditCards=new ArrayList<>();
					// 
	public void addCreditCards(CreditCard c) { creditCards.add(c); }
	public void calcTotal(Bank b) {
		int pts = 0;
		int n = creditCards.size();
		for (int i = 0; i < n; i++) {
			pts = pts + creditCards.get(i).calcPts(creditCards.get(i));
		}
		System.out.println("Total points: " + pts);
	}
}