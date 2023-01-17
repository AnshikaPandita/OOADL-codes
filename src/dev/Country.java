package dev;

import java.util.ArrayList;

public class Country {

	ArrayList<State> taxstate = new ArrayList<>();

	public Country(ArrayList<State> taxstate) {

		super();

		this.taxstate = taxstate;

	}

	public int Country()

	{

		int taxcountry = 0;

		for (int i = 0; i < taxstate.size(); i++)

		{

			taxcountry += taxstate.get(i).state();

		}

		return taxcountry;

	}

}