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
		 
	}

	@Test
	public void testComputeWithTwoProductNoDiscount(){
		ArrayList <Product> listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","Item 1 RE",10.0));
		listOfProduct.add(new Product("SKU00002-RE","Item 2 RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(20,  e.calculateItemDiscounts(listOfProduct),0.01);
		
	}

	@Test
	public void testComputeWithTwoProductOneDiscount(){
		fail("Not yet implemented");
		
		ArrayList listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","TESTINE RE",10.0));
		listOfProduct.add(new Product("SKU00001-RE","TESTINE RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(20*0.7,  e.calculateItemDiscounts(listOfProduct),0.01);
		 
	}

	@Test
	public void testComputeWithFiveProductOneDiscount(){
		ArrayList <Product> listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","Item 1 RE",10.0));
		listOfProduct.add(new Product("SKU00002-RE","Item 2 RE",10.0));
		listOfProduct.add(new Product("SKU00001-RE","Item 1 RE",10.0));
		listOfProduct.add(new Product("SKU00003-RE","Item 3 RE",10.0));
		listOfProduct.add(new Product("SKU00004-RE","Item 4 RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(20*0.7+30,  e.calculateItemDiscounts(listOfProduct),0.01);

	}

	@Test
	public void testComputeWithFiveProductTwoDiscount(){
		ArrayList <Product> listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","Item 1 RE",10.0));
		listOfProduct.add(new Product("SKU00002-RE","Item 2 RE",10.0));
		listOfProduct.add(new Product("SKU00001-RE","Item 1 RE",10.0));
		listOfProduct.add(new Product("SKU00003-RE","Item 3 RE",10.0));
		listOfProduct.add(new Product("SKU00002-RE","Item 2 RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(40*0.7+10,  e.calculateItemDiscounts(listOfProduct),0.01);
	}

}
