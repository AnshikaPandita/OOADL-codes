package dev;

public class TeamLeader extends Employee {
	private double bonus;
	private double travelall;
	Employee em;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public TeamLeader(int eid, String name, double bpay, double bonus, double travelall) {
		super(eid, name, bpay);
		this.bonus = bonus;
		this.travelall = travelall;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTravelall() {
		return travelall;
	}

	public void setTravelall(double travelall) {
		this.travelall = travelall;
	}

	public void displayTL() {
		System.out.println("Employee Id of Team leader is: " + this.getEid());
		System.out.println("Name of Team leader is: " + this.getName());
		System.out.println("Salary of Team leader is: " + this.getBpay());
		System.out.println("Bonus of Team leaderis :" + bonus);
		System.out.println("Travel allownace is: " + travelall);
		System.out.println("Salary after Calculation: " + salary);
	}

	public double salary() {
		salary = this.getBpay() + bonus + travelall;
		return salary;
	}
}