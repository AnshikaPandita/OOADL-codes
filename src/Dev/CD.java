package Dev;

public class CD extends Library_item {
	private double duration;

	public CD(String title, double price, double duration) {
		super(title, price);
		this.duration = duration;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void display() {
		System.out.println("Duration:" + duration);
	}
}