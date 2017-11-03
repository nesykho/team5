public class Product {

	private String SKU;
	private String description;
	private double price;
	
	public Product(String sKU, String description, double price) {
		super();
		SKU = sKU;
		this.description = description;
		this.price = price;
	}
	
	public String getSKU() {
		return SKU;
	}
	
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}