package dev;

import java.util.ArrayList;

public class Student extends Person {
	private String branch;

	public Student(Name name, long aadhar_card, String branch) {
		super(name, aadhar_card);
		this.branch = branch;
		this.avg_marks = avg_marks;
	}

	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private double avg_marks;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public double getAvg_marks() {
		return avg_marks;
	}

	public void setAvg_marks(double avg_marks) {
		this.avg_marks = avg_marks;
	}

	public void addM(int m) {
		marks.add(m);
	}

	public void displayS() { // super.toString(); 
		System.out.print("\nBranch:"+this.branch+"\n");
		}
	
	public void calAvg() {
		double avg=0; for(int i=0;i<marks.size();i++) {
	
	     avg=avg+marks.get(i); }
		System.out.print("Average marks:" + avg / 5);
	}
}