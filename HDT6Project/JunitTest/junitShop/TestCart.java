package junitShop;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import shop.Cart;

class TestCart {


	

	@Test
	void testAddToCart() {
		Cart cart = new Cart(1);

		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Oranges");
		cart.addToCart("Food", "Almonds");
		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Pies");
		cart.addToCart("Food", "apples");
		cart.addToCart("Clothes", "Jeans");
		cart.addToCart("Clothes", "Shoes");
		cart.addToCart("Clothes", "Crocs");
		assertEquals(cart.getProductStats("Pies").get(0), "Food");
		assertEquals(cart.getProductStats("Pies").get(1), "Pies");
		assertEquals(cart.getProductStats("Pies").get(2), "1");
	}

	@Test
	void testRemoveFromCart() {
		Cart cart = new Cart(1);

		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Oranges");
		cart.addToCart("Food", "Almonds");
		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Pies");
		cart.addToCart("Food", "apples");
		cart.addToCart("Clothes", "Jeans");
		cart.addToCart("Clothes", "Shoes");
		cart.addToCart("Clothes", "Crocs");

		cart.removeFromCart("Clothes", "Crocs");
		assertEquals(cart.removeFromCart("Clothes", "Crocs"), null);
		
	}

	@Test
	void testGetCategory() {
		Cart cart = new Cart(1);

		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Oranges");
		cart.addToCart("Food", "Almonds");
		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Pies");
		cart.addToCart("Food", "apples");
		cart.addToCart("Clothes", "Jeans");
		cart.addToCart("Clothes", "Shoes");
		cart.addToCart("Clothes", "Crocs");
		assertEquals(cart.getCategory("Shoes"), "Clothes");
	}

	@Test
	void testGetProductStats() {
		Cart cart = new Cart(1);

		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Oranges");
		cart.addToCart("Food", "Almonds");
		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Pies");
		cart.addToCart("Food", "apples");
		cart.addToCart("Clothes", "Jeans");
		cart.addToCart("Clothes", "Shoes");
		cart.addToCart("Clothes", "Crocs");
		

		assertEquals(cart.getProductStats("apples").get(0), "Food");
		assertEquals(cart.getProductStats("apples").get(1), "apples");
		assertEquals(cart.getProductStats("apples").get(2), "3");
	}

	@Test
	void testGetProductList() {
		Cart cart = new Cart(1);

		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Oranges");
		cart.addToCart("Food", "Almonds");
		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Pies");
		cart.addToCart("Food", "apples");
		cart.addToCart("Clothes", "Jeans");
		cart.addToCart("Clothes", "Shoes");
		cart.addToCart("Clothes", "Crocs");
		
		cart.getProductList();
	}

}
