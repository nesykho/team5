import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POS {
	
	public static void main(String[] args) {
		
		ProductCatalogue pc = new ProductCatalogue();
		Scanner input = new Scanner(System.in);
		List<Product> order = new ArrayList<Product>();
		
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
					
					for (int i = 0; i < pc.getProducts().size(); i++) {
						if (pc.getProducts().get(i).getSKU().equalsIgnoreCase(myAddProduct.trim())) {
							String desc = pc.getProducts().get(i).getDescription();
							order.add(pc.getProducts().get(i));
							System.out.println("  Product ["  + desc + "] added to order.");
						}
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
					
					for (int i = 0; i < order.size(); i++) {
						if (order.get(i).getSKU().equalsIgnoreCase(myRemoveProduct.trim())) {
							String desc = order.get(i).getDescription();
							order.remove(i);
							System.out.println("  Product ["  + desc + "] removed from order.");
						}
					}
					break;
				case 3:
					System.out.println();
					System.out.println("==================================================");
					System.out.println("  VIEW ORDER");
					System.out.println("==================================================");
					System.out.println();
					
					for (int i = 0; i < order.size(); i++) {
						System.out.println("  " + (i+1) + ". " + order.get(i).getDescription());
					}
					break;
				case 4:
					break;
			}
			
			System.out.println();
		}
	}
}