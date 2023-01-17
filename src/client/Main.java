package client;

import java.util.*;

import dev.Complex_no;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Complex_no c1 = new Complex_no(5, 4);
		Complex_no c2 = new Complex_no(1, -1);
		System.out.println("First complex Number is:");
		c1.display();
		c1.calMag();
		c1.calArg();
		c1.conjugate();
		System.out.println("\nSecond complex Number is:");
		c2.display();
		c2.calMag();
		c2.calArg();
		c2.conjugate();
		c1.add(c1, c2);
		c1.sub(c1, c2);
	}
}