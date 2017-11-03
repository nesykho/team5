import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DiscountEngine {

	public static final double DISCOUNT_PCT_30 = 30;
	
	public double calculateItemDiscounts(List<Product> products) {
		DiscountEngine engine = new DiscountEngine();
		Map<String, List<Product>> buckets = engine.bucketItemsBySKU(products);
		
		// Calculate product discounts
		double totalDiscount = engine.processProductDiscounts(buckets);
		
		// DEBUG: Print item after bucketing
//		engine.printItemBucketInfo(buckets);
		
		return totalDiscount;
	}
	
	private double processProductDiscounts(Map<String, List<Product>> buckets) {
		double totalDiscount = 0;
		
		Iterator<String> itr1 = buckets.keySet().iterator();
		while(itr1.hasNext()) {
			String productBaseSKU = itr1.next();
			List<Product> skuProducts = buckets.get(productBaseSKU);
			
			for(int i=0;i<skuProducts.size();i++) {
				Product skuProduct = skuProducts.get(i);
				if(i%2!=0) {
					totalDiscount+=skuProduct.getPrice()*DISCOUNT_PCT_30;
				}
			}
		}
		
		return totalDiscount;
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
