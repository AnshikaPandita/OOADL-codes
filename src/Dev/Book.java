package Dev;

public class Book extends Library_item {
	private int ISBN;

	public Book(String title, double price, int iSBN) {
		super(title, price);
		ISBN = iSBN;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public void display() {
		System.out.println("ISBN no:" + ISBN);
	}
}