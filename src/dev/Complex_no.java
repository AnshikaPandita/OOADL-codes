package dev;

public class Complex_no {
	int realPart, imagPart;
	float mag;
	float arg;
	float addr, addi, subr, subi;

	public Complex_no(int realPart, int imagPart) {
		super();
		this.realPart = realPart;
		this.imagPart = imagPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public double setRealPart(int realPart) {
		return this.realPart = realPart;
	}

	public double getImagPart() {
		return imagPart;
	}

	public double setImagPart(int imagPart) {
		return this.imagPart = imagPart;
	}

	public void display() {
		if (getImagPart() > 0) {
			System.out.print(getRealPart() + "+" + (getImagPart()) + "i");
		} else
			System.out.print(getRealPart() + "" + (getImagPart()) + "i");
	}

	public double calMag() {
		mag = (float) Math.sqrt((Math.pow(this.getRealPart(), 2)) + Math.pow(this.getImagPart(), 2));
		System.out.println("\nMagnitude:" + mag);
		return mag;
	}

	public double calArg() {
		arg = (float) Math.atan(getImagPart() / getRealPart());
		System.out.println("Argument:" + arg);
		return arg;
	}

	public void add(Complex_no c1, Complex_no c2) {
		addr = (float) (c1.getRealPart() + c2.getRealPart());
		addi = (float) (c1.getImagPart() + c2.getImagPart());
		System.out.println("\nAddition of complex no is:" + addr + "+" + addi + "i");
	}

	public void sub(Complex_no c1, Complex_no c2) {
		subr = (float) (c1.getRealPart() - c2.getRealPart());
		subi = (float) (c1.getImagPart() - c2.getImagPart());
		System.out.println("Subtraction of complex no is:" + subr + "+" + subi + "i");
	}

	public void conjugate() {
		if (getImagPart() > 0) {
			System.out.println("Conjugate:" + getRealPart() + "-" + (getImagPart()) + "i");
		} else if (getImagPart() < 0) {
			System.out.println("Conjugate:" + getRealPart() + "+" + (-1) * (getImagPart()) + "i");
		}
	}
}