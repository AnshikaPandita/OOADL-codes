package dev;

public class Faculty extends Person {
	private double total_sal, base_sal, house_rent;

	public Faculty(Name name, long aadhar_card, double base_sal, double house_rent) {
		super(name, aadhar_card);
		this.total_sal = total_sal;
		this.base_sal = base_sal;
		this.house_rent = house_rent;
	}

	public double getTotal_sal() {
		return total_sal;
	}

	public void setTotal_sal(double total_sal) {
		this.total_sal = total_sal;
	}

	public double getBase_sal() {
		return base_sal;
	}

	public void setBase_sal(double base_sal) {
		this.base_sal = base_sal;
	}

	public double getHouse_rent() {
		return house_rent;
	}

	public void setHouse_rent(double house_rent) {
		this.house_rent = house_rent;
	}

	public void calF() {
		total_sal = base_sal + house_rent;
	}

	public void displayF() {
		System.out.println("\nBasic salary:" + base_sal);
		System.out.println("House rent salary:" + house_rent);
		System.out.println("Total salary:" + total_sal);
	}
}