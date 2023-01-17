package dev;

public abstract class Employee {
	private int eid;
	private String name;
	private double bpay;

	public Employee(int eid, String name, double bpay) { 
		super();
		this.eid = eid; 
		this.name = name; 
		this.bpay = bpay; 
		}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBpay() {
		return bpay;
	}

	public void setBpay(double bpay) {
		this.bpay = bpay;
	}

	public abstract double salary();
}