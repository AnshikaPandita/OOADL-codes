package dev;
import java.util.ArrayList;
public class Merchant {
	private Product product;
	private ArrayList<Product> product1 = new ArrayList<Product>();
	private int prospm;
	private double gstm1;
	private double gstm;

	public Merchant(Product product, int prospm) {
		super();
		this.product = product;
		this.prospm = prospm;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProspm() {
		return prospm;
	}

	public void setProspm(int prospm) {
		this.prospm = prospm;
	}

	public double getGstm() {
		return gstm;
	}

	public double setGstm(double gstm) {
		return this.gstm = gstm;
	}

	public double calgstm() {
		System.out.println("Product Name:" + this.product.getProduct_name());
		System.out.println("Product Price:" + this.product.getProduct_price());
		System.out.println("No of product sold:" + prospm);
		System.out.println("GST Rate:" + this.product.getGstrate() + "%");
		gstm = prospm * this.getProduct().getProduct_price() * this.getProduct().getGstrate();
		System.out.println("GST paid by merchand:" + gstm);
		System.out.println("\n");
		return this.setGstm(gstm);
	}
}