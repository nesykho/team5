import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class test {


	@Test
	public void testComputeWithOneProductNoDiscount(){


		ArrayList <Product> listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","TESTINE RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(0.0,  e.calculateItemDiscounts(listOfProduct),0.01);
		 
	}

	@Test
	public void testComputeWithTwoProductNoDiscount(){
		ArrayList <Product> listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","Item 1 RE",10.0));
		listOfProduct.add(new Product("SKU00002-RE","Item 2 RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 
		 assertEquals(0.0,e.calculateItemDiscounts(listOfProduct) ,0.01);
		
	}

	@Test
	public void testComputeWithTwoProductOneDiscount(){
		ArrayList <Product> listOfProduct = new ArrayList();
		listOfProduct.add(new Product("SKU00001-RE","TESTINE RE",10.0));
		listOfProduct.add(new Product("SKU00001-RE","TESTINE RE",10.0));
		
		DiscountEngine e = new DiscountEngine();
		 e.calculateItemDiscounts(listOfProduct);
		 
		 assertEquals(10*0.3,  e.calculateItemDiscounts(listOfProduct),0.01);
		 
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
		 
		 assertEquals(10*0.3,  e.calculateItemDiscounts(listOfProduct),0.01);
		 //test
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
		 
		 assertEquals(20*0.3,  e.calculateItemDiscounts(listOfProduct),0.01);
	}

}
