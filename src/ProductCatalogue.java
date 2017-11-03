import java.util.ArrayList;
import java.util.List;

public class ProductCatalogue {

	private List<Product> products;
	
	public ProductCatalogue() {
		products = new ArrayList<Product>();
		populateProducts();
	}
	
	// SKU format: SKUXXXXX-XX
	
	public void populateProducts() {
		products.add(new Product("SKU00001-RE", "Agile T-Shirt - Red", 19.90));
		products.add(new Product("SKU00001-WH", "Agile T-Shirt - White", 19.90));
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
}