package dev;

public class Name {
	private String firstn, lastn;

	public Name(String firstn, String lastn) {
		super();
		this.firstn = firstn;
		this.lastn = lastn;
	}

	public String getFirstn() {
		return firstn;
	}

	public void setFirstn(String firstn) {
		this.firstn = firstn;
	}

	public String getLastn() {
		return lastn;
	}

	public void setLastn(String lastn) {
		this.lastn = lastn;
	}

	public void displayN() {
		System.out.println("Name:" + this.getFirstn() + " " + this.getLastn());
	}
}