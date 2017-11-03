import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class test {

	@Test
	public void testAddProductOneProduct() {
		/*		products.add(new Product("SKU00001RE", "Agile T-Shirt - Red", 19.90));
		products.add(new Product("SKU00001WH", "Agile T-Shirt - White", 19.90));
		 */
		
	//	POS pos = new POS();
	//	pos.add("SKU00001RE");
		
		
		/*double finalAmt = de.tabulatePrice(itemList);
		//assertTrue(discountPrice<nonDiscountPrice);
		assertEquals(14,finalAmt,0.001);
*/
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testAddProductMultipleProduct() {
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveOneProduct(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveMultipleProduct(){
		fail("Not yet implemented");
	}

	@Test
	public void testListProduct(){
		fail("Not yet implemented");
	}

	@Test
	public void testComputeWithOneProductNoDiscount(){
		/*
		 * 
		 * 
		 * 	public Product(String sKU, String description, double price) {
		super();
		SKU = sKU;
		this.description = description;
		this.price = price;
	}*/

		ArrayList listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","TESTINE RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(10,  e.calculateItemDiscounts(listOfProduct),0.01);
		 
		 
	
		fail("Not yet implemented");
	}

	@Test
	public void testComputeWithTwoProductNoDiscount(){
		fail("Not yet implemented");
	}

	@Test
	public void testComputeWithTwoProductOneDiscount(){
		fail("Not yet implemented");
	}

	@Test
	public void testComputeWithFiveProductOneDiscount(){
		fail("Not yet implemented");
	}

	@Test
	public void testComputeWithFiveProductTwoDiscount(){
		fail("Not yet implemented");
	}

}
