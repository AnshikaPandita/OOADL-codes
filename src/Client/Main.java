package Client;

import Dev.Book;
import Dev.CD;
import Dev.Library;
import Dev.Magazine;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("English", 600, 1254);
		Library l = new Library();
		l.add(b1);
		Book b2 = new Book("Hindi", 400, 1654);
		l.add(b2);
		Book b3 = new Book("Marathi", 200, 4274);
		l.add(b3);
		Book b4 = new Book("Maths", 1000, 1294);
		l.add(b4);
		Book b5 = new Book("History", 100, 1218);
		l.add(b5);
		Magazine m1 = new Magazine("a", 60, "JAN");
		l.add(m1);
		Magazine m2 = new Magazine("b", 70, "FEB");
		l.add(m2);
		Magazine m3 = new Magazine("c", 40, "MARCH");
		l.add(m3);
		Magazine m4 = new Magazine("d", 20, "APRIL");
		l.add(m4);
		CD c1 = new CD("e", 100, 2.1);
		l.add(c1);
		CD c2 = new CD("f", 200, 3.1);
		l.add(c2);
		CD c3 = new CD("g", 300, 4.1);
		l.add(c3);
		l.search(b1);
		System.out.println("\n");
		l.search(m2);
		System.out.println("\n");
		l.search(c3);
	}
}