package dev;

public class Purchase {
	private int date;
	private int amt;
	private int paybackPt = 0;

	public Purchase(int amt, int payback, int date) {
		this.amt = amt;
		this.paybackPt = payback;
		this.date = date;
	}

	public int calc(Purchase p) {
		int pts = 0;
		if (p.amt <= 10000) {
			pts = p.paybackPt + (1 * p.amt / 200);
			return pts;
		} else if (10000 < p.amt && p.amt < 15000) {
			pts = p.paybackPt + (1 * p.amt / 150);
			return pts;
		} else if (15001 < p.amt && p.amt < 20000) {
			pts = p.paybackPt + (1 * p.amt / 100);
			return pts;
		} else {
			pts = p.paybackPt + (1 * p.amt / 80);
			return pts;
		}
	}
}