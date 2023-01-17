package client;

import dev.Faculty;
import dev.Name;
import dev.Person;
import dev.Student;

public class Main {
	public static void main(String[] args) {
		System.out.println("*****Details of students******");
		Name n1 = new Name("Mansi", "Satpute");
		n1.displayN();
		Person p1 = new Person(n1, 123654);
		p1.display();
		Student s1 = new Student(n1, 123654, "IT");
		s1.addM(12);
		s1.addM(20);
		s1.addM(21);
		s1.addM(22);
		s1.addM(19);
		s1.displayS();
		s1.calAvg();
		System.out.println("\n");
		Name n2 = new Name("Riya", "Sharma");
		n2.displayN();
		Person p2 = new Person(n2, 123654);
		p2.display();
		Student s2 = new Student(n2, 123654, "IT");
		s2.addM(20);
		s2.addM(65);
		s2.addM(41);
		s2.addM(75);
		s2.addM(63);
		s2.displayS();
		s2.calAvg();
		System.out.println("\n");
		System.out.println("*****Details of teachers******");
		Name n3 = new Name("Mrunal", "Moharir");
		n3.displayN();
		Person p3 = new Person(n3, 123654);
		p3.display();
		Faculty f1 = new Faculty(n3, 123365, 5000, 1000);
		f1.calF();
		f1.displayF();
		System.out.println("\n");
		Name n4 = new Name("Namrata", "Karandekar");
		n4.displayN();
		Person p4 = new Person(n4, 123654);
		p4.display();
		Faculty f2 = new Faculty(n4, 123365, 10000, 2000);
		f2.calF();
		f2.displayF();
		System.out.println("\n");
		Name n5 = new Name("Anand", "Joshi");
		n5.displayN();
		Person p5 = new Person(n5, 123654);
		p5.display();
		Faculty f3 = new Faculty(n5, 123365, 6000, 200);
		f3.calF();
		f3.displayF();
	}
}