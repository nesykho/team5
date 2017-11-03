import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountEngine {

	public double calculateItemDiscounts(List<Product> products) {
		DiscountEngine engine = new DiscountEngine();
		Map<String, List<Product>> buckets = engine.bucketItemsBySKU(products);
		
		// Calculate item discounts
		
		// DEBUG: Print item after bucketing
//		engine.printItemBucketInfo(buckets);
		
		return 0;
	}
	
	private Map<String, List<Product>> bucketItemsBySKU(List<Product> products) {
		Map<String, List<Product>> buckets = new HashMap<String, List<Product>>();
		for(Product product : products) {
			String productBaseSKU = product.getBaseSKU();
			if(productBaseSKU==null) continue;
			
			List<Product> skuProducts = buckets.get(productBaseSKU);
			if(skuProducts==null) {
				skuProducts = new ArrayList<Product>();
				skuProducts.add(product);
				buckets.put(productBaseSKU, skuProducts);
			}
			else {
				skuProducts.add(product);
			}
		}
		return buckets;
	}
}
