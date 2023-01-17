package client;

import java.util.*;

import dev.ProjectLeader;
import dev.SoftwareEngineer;
import dev.TeamLeader;
import dev.Trainee;

public class Main1 {
	public static void main(String[] args) {
		SoftwareEngineer se = new SoftwareEngineer(2345, "Employee SE", 5000);
		Trainee t = new Trainee(2908, "Employee T", 10000, 100, 30);
		TeamLeader tl = new TeamLeader(29128, "Employee TL", 30000, 5000, 2000);
		ProjectLeader pl = new ProjectLeader(29898, "Employee PL", 50000, 800);
		pl.salary();
		se.salary();
		t.salary();
		tl.salary();
		System.out.println("\n**FOR SOFTWARE ENGINEER**\n");
		se.displaySE();
		System.out.println("\n**FOR TRAINEE**\n");
		t.displayT();
		System.out.println("\n**FOR TEAM LEADER**\n");
		tl.displayTL();
		System.out.println("\n**FOR PROJECT LEADER\n**");
		pl.displayPL();
		double totalamount = (5 * t.salary()) + (2 * se.salary()) + (2 * tl.getSalary()) + (1 * pl.getSalary());
		System.out.println("\n\nTotal Amount which Company needs to pay to all employee in month: " + totalamount);
	}
}