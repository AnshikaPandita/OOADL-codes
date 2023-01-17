package dev;

public class Trainee extends Employee {
	Employee em;
	private double callowance;
	private int days;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Trainee(int eid, String name, double bpay, double callowance, int days) {
		super(eid, name, bpay);
		this.callowance = callowance;
		this.days = days;
	}
	
	public double getCallowance() { return callowance; }

	public void setCallowance(double callowance) {
		this.callowance = callowance;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void displayT() {
		System.out.println("Employee Id of Trainee is: " + this.getEid());
		System.out.println("Name of Trainee is: " + this.getName());
		System.out.println("Salary of Trainee is: " + this.getBpay());
		System.out.println("Canteen Allowance is: " + callowance);
		System.out.println("No of days are: " + days);
		System.out.println("Salary after Calculation: " + salary);
	}

	public double salary() {
		salary = this.getBpay() + callowance * days;
		return salary;
	}
}