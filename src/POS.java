import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POS {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ProductCatalogue pc = new ProductCatalogue();
		Scanner input = new Scanner(System.in);
		List<Product> order = new ArrayList<Product>();
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00");
		
		while(true) {
			System.out.println("==================================================");
			System.out.println("  MAIN MENU");
			System.out.println("==================================================");
			System.out.println();
		
			System.out.println("  1. Add Product to Order");
			System.out.println("  2. Remove Product from Order");
			System.out.println("  3. View Order");
			System.out.println("  4. Reset Order");
			System.out.println();
	
			System.out.print("  >> ");
			int myOption = input.nextInt();
			
			switch(myOption) {
				case 1: 
					System.out.println();
					System.out.println("==================================================");
					System.out.println("  ADD PRODUCT TO ORDER");
					System.out.println("==================================================");
					System.out.println();
					
					System.out.print("  Enter SKU >> ");
					String myAddProduct = input.next();
					boolean addFound = false;
					
					for (int i = 0; i < pc.getProducts().size(); i++) {
						if (pc.getProducts().get(i).getSKU().equalsIgnoreCase(myAddProduct.trim())) {
							String desc = pc.getProducts().get(i).getDescription();
							order.add(pc.getProducts().get(i));
							System.out.println("  Product ["  + desc + "] added to order.");
							addFound = true;
						}
					}
					
					if (!addFound) {
						System.out.println("  Invalid item.");
					}
					break;
				case 2:
					System.out.println();
					System.out.println("==================================================");
					System.out.println("  REMOVE PRODUCT FROM ORDER");
					System.out.println("==================================================");
					System.out.println();
					
					System.out.print("  Enter SKU >> ");
					String myRemoveProduct = input.next();
					boolean removeFound = false;
					
					for (int i = 0; i < order.size(); i++) {
						if (order.get(i).getSKU().equalsIgnoreCase(myRemoveProduct.trim())) {
							String desc = order.get(i).getDescription();
							order.remove(i);
							System.out.println("  Product ["  + desc + "] removed from order.");
							removeFound = true;
						}
					}
					
					if (!removeFound) {
						System.out.println("  Item not found in order.");
					}
					break;
				case 3:
					System.out.println();
					System.out.println("==================================================");
					System.out.println("  VIEW ORDER");
					System.out.println("==================================================");
					System.out.println();
					
					if (order.size() > 0) {
						for (int i = 0; i < order.size(); i++) {
							System.out.println("  " + (i+1) + ".\t[" + order.get(i).getDescription() + "] ----- $" + df.format(order.get(i).getPrice()));
						}
					}
					else {
						System.out.println("  No items in order.");
					}
					break;
				case 4:
					order.clear();
					System.out.println("  Order cleared.");
					break;
			}
			
			System.out.println();
		}
	}
}