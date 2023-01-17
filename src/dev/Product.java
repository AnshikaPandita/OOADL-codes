package dev;

public class Product {
	private String product_name;
	private double product_price;
	private int gstrate;

	public Product(String product_name, double product_price, int gstrate) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.gstrate = gstrate;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public double setProduct_price(int product_price) {
		return this.product_price = product_price;
	}

	public int getGstrate() {
		return gstrate;
	}

	public void setGstrate(int gstrate) {
		this.gstrate = gstrate;
	}
}