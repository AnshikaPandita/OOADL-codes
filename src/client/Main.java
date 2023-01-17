package client;

import java.util.Scanner;
import dev.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Polynomial p = new Polynomial();
		System.out.println("\nEnter the value of x to calculate the value of polynomial:");
		int x = sc.nextInt();
		System.out.println("The value of the polynomial is:" + p.calculate(x));
		System.out.println("The highest power of the polynomial is:" + p.getmaxval());
		p.sort();
		p.displaypoly();
	}
}
