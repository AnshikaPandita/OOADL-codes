package dev;

import java.util.ArrayList;

public class Country {
	private double gstc;

	public double getGstc() {
		return gstc;
	}

	public double setGstc(double gstc) {
		return this.gstc = gstc;
	}

	private ArrayList<State> state = new ArrayList<State>();

	public double gst(State s) {
		gstc = gstc + s.getGSTs();
		return this.setGstc(gstc);
	}
}