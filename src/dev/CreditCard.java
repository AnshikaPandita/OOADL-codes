package dev;

import java.util.ArrayList;

public class CreditCard {
	private int ccNo;
	ArrayList<Purchase> purchases = new ArrayList<>();

	public void addPurchase(Purchase p) {
		purchases.add(p);
	}

	public int calcPts(CreditCard c) {
		int pts = 0;
		int n = purchases.size();
		for (int i = 0; i < n; i++) {
			pts = pts + purchases.get(i).calc(purchases.get(i));
		}
		return pts;
	}
}