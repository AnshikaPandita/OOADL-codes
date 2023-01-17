package dev;

import java.util.ArrayList;

public class State {
	private ArrayList<Merchant> merchant = new ArrayList<Merchant>();
	private double GSTs;
	private String name;

	public State(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Merchant> getMerchant() {
		return merchant;
	}

	public void setMerchant(ArrayList<Merchant> merchant) {
		this.merchant = merchant;
	}

	public double getGSTs() {
		return GSTs;
	}

	public double setGSTs(double gSTs) {
		return GSTs = gSTs;
	}

	public double calgsts(Merchant m) {
		System.out.println("State:" + this.name);
		GSTs = GSTs + m.calgstm();
		return this.setGSTs(GSTs);
	}
}