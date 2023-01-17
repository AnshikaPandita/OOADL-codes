package dev;

import java.util.ArrayList;

public class State {

	ArrayList<Taxpayer> taxp = new ArrayList<>();

	public State(ArrayList<Taxpayer> taxp) {

		super();

		this.taxp = taxp;

	}

	public int state()

	{

		int taxstate = 0;

		for (int i = 0; i < taxp.size(); i++)

		{

			taxstate += taxp.get(i).tax;

		}

		return taxstate;

	}

}
