package dev;

public class SoftwareEngineer extends Employee {
	Employee em;
	ProjectLeader p;
	private double hra;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SoftwareEngineer(int eid, String name, double bpay) {
		super(eid, name, bpay);
		this.hra = hra;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public void displaySE() {
		System.out.println("Employee Id of Software Engineer is: " + this.getEid());
		System.out.println("Name of Software Engineer is: " + this.getName());
		System.out.println("Salary of Software Engineer is: " + this.getBpay());
		System.out.println("HRA is: " + hra);
		System.out.println("Salary after Calculation: " + salary);
	}

	public double salary() { // hra=(this.getBpay()+p.getDa())*0.5; salary=this.getBpay()+hra;
		return salary;
	}
}