package dev;

import java.util.*;

public class Company {
	private ArrayList<Employee> e = new ArrayList<Employee>();

	public ArrayList<Employee> getE() {
		return e;
	}

	public void setE(ArrayList<Employee> e) {
		this.e = e;
	}

	public void add(Trainee t, SoftwareEngineer se, TeamLeader tl, ProjectLeader pl) {
		e.add(t);
		e.add(se);
		e.add(tl);
		e.add(pl);
	}

	public static void main(String[] args) {
	}
}