package client;

import dev.Country;
import dev.Merchant;
import dev.Product;
import dev.State;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("Back Pack", 1500, 12);
		Merchant m1 = new Merchant(p1, 30);
		Product p2 = new Product("Pen", 350, 5);
		Merchant m2 = new Merchant(p2, 45);
		Product p3 = new Product("Table", 4500, 18);
		Merchant m3 = new Merchant(p3, 10);
		Product p4 = new Product("Pencil", 10, 5);
		Merchant m4 = new Merchant(p4, 100);
		Product p5 = new Product("Bottle", 200, 12);
		Merchant m5 = new Merchant(p5, 500);
		State s1 = new State("Zarkhand");
		s1.calgsts(m1);
		s1.calgsts(m2);
		s1.calgsts(m3);
		s1.calgsts(m4);
		double gsts = s1.calgsts(m5);
		System.out.println("Total GST of Zarkhand:" + gsts);
		System.out.println("\n");
		Product p6 = new Product("Umbrella", 350, 12);
		Merchant m6 = new Merchant(p6, 120);
		Product p7 = new Product("Painting", 600, 5);
		Merchant m7 = new Merchant(p7, 67);
		Product p8 = new Product("Wood Decor", 2400, 18);
		Merchant m8 = new Merchant(p8, 12);
		Product p9 = new Product("Yardage", 500, 5);
		Merchant m9 = new Merchant(p9, 76);
		State s2 = new State("Orissa");
		s2.calgsts(m6);
		s2.calgsts(m7);
		s2.calgsts(m8);
		gsts = s2.calgsts(m9);
		System.out.println("Total GST of Orissa:" + gsts);
		System.out.println("\n");
		Product p10 = new Product("Bamboo Rack", 2000, 18);
		Merchant m10 = new Merchant(p10, 120);
		Product p11 = new Product("Clay Plot", 280, 5);
		Merchant m11 = new Merchant(p11, 80);
		Product p12 = new Product("Bamboo Sofa", 18000, 18);
		Merchant m12 = new Merchant(p12, 7);
		State s3 = new State("Aassam");
		s3.calgsts(m10);
		s3.calgsts(m11);
		gsts = s3.calgsts(m12);
		System.out.println("Total GST of Aassam:" + gsts);
		System.out.println("\n");
		Country c = new Country();
		c.gst(s1);
		c.gst(s2);
		double gstc = c.gst(s3);
		System.out.println("Total GST by country:" + gstc);
	}
}
