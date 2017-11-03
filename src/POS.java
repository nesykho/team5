public class POS {
	
	public static void main(String[] args) {
		
		ProductCatalogue pc = new ProductCatalogue();
		
		System.out.println("Welcome to POS System");
		System.out.println("=====================");
		System.out.println();
		
		System.out.println("This are the list of items:");
		
		for (int i = 0; i < pc.getProducts().size(); i++) {
			System.out.println(pc.getProducts().get(i).getDescription());
		}
		
	}
	
}
