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
		
		products.add(new Product("SKU00002-BK", "Agile Shorts - Black", 26.00));
		products.add(new Product("SKU00002-BL", "Agile Shorts - Blue", 26.00));
		
		products.add(new Product("SKU00003-WH", "Agile Shoes - White", 100.00));
		products.add(new Product("SKU00003-PK", "Agile Shoes - Pink", 100.00));
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
}