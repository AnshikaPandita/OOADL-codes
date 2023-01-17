package Dev;

public class Magazine extends Library_item {
	private String moi;

	public Magazine(String title, double price, String moi) {
		super(title, price);
		this.moi = moi;
	}

	public String getMoi() {
		return moi;
	}

	public void setMoi(String moi) {
		this.moi = moi;
	}

	public void display() {
		System.out.println("Month of issue:" + moi);
	}
}