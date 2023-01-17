package dev;

public class ProjectLeader extends Employee {
	private double da;
	private double cta = 30 / 100;
	private double speciall;
	Employee em;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ProjectLeader(int eid, String name, double bpay, double speciall) {
		super(eid, name, bpay);
		this.da = da;
		this.cta = cta;
		this.speciall = speciall;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getCta() {
		return cta;
	}
	
	public void setCta(double cta) { this.cta = cta; }
	
	public double getSpeciall() {
		return speciall;
	}

	public void setSpeciall(double speciall) {
		this.speciall = speciall;
	}

	public void displayPL() {
		System.out.println("Employee Id of Project leader is: " + this.getEid());
		System.out.println("Name of Project leader is: " + this.getName());
		System.out.println("Salary of Project leader is: " + this.getBpay());
		System.out.println("Special allownace is: " + speciall);
		System.out.println("Salary after Calculation: " + salary);
	}
	public double salary() { 
		double cta1=this.getBpay()*0.3; 
		double da=this.getBpay()*0.2;
		salary=this.getBpay()+da+cta1+speciall;
		return 0; }
	}