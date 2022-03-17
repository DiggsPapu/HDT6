package junitShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shop.Shop;

class TestShop {

	@Test
	void testSendToCart() {
		Shop shop = new Shop(3);
		
		shop.sendToCart("Pets", "Dog", 3);
		shop.sendToCart("Pets", "Dog", 3);
		shop.sendToCart("Hair", "Old Spice", 3);
		shop.sendToCart("Food", "Aguacate", 5);
		shop.sendToCart("Pets", "Dog", 1);
		shop.sendToCart("Pets", "Cat", 3);
		shop.sendToCart("Food", "Water", 3);
		
		assertNotEquals(shop.getCart(), null);
	}

	@Test
	void testAddNewProduct() {
		Shop shop = new Shop(3);
		shop.addNewProduct("Pets", "Dog");
		
		
		assertNotEquals(shop.getSupply(), null);
	}

	@Test
	void testGetCategory() {
		Shop shop = new Shop(3);
		shop.addNewProduct("Pets", "Dog");
		
		
		assertNotEquals(shop.getSupply(), null);
	}

	@Test
	void testGetProductInCart() {
	Shop shop = new Shop(3);
	shop.addNewProduct("Pets", "Dog");
	
	
	shop.getProductInCart("Dog");
	}

	@Test
	void testGetCartList() {
		Shop shop = new Shop(3);
		shop.addNewProduct("Pets", "Dog");
		
		shop.getCartList();
	}

	@Test
	void testGetProductList() {
		Shop shop = new Shop(3);
		shop.addNewProduct("Pets", "Dog");
		
		shop.getProductList();
	}



}
