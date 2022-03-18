package junitShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import shop.Supply;

class TestSupply {


	@Test
	void testGetProductSupply() {
		Supply supply = new Supply(3);
		supply.addNewProduct("Comida", "Tomates");
		supply.addNewProduct("Comida", "Champiniones");
		supply.addNewProduct("Comida", "Berenjena");
		supply.addNewProduct("Comida", "Lays");
		supply.addNewProduct("Comida", "Coca Cola");
		supply.addNewProduct("Comida", "Agua");
		supply.addNewProduct("Comida", "Pimiento");
		supply.addNewProduct("Comida", "Perejil");
		supply.addNewProduct("Comida", "Ajo");
		supply.addNewProduct("Comida", "Cebolla");
		
		supply.getProductSupply();
	}

	@Test
	void testGetCategory() {
		Supply supply = new Supply(3);
		supply.addNewProduct("Comida", "Tomates");
		supply.addNewProduct("Comida", "Champiniones");
		supply.addNewProduct("Comida", "Berenjena");
		supply.addNewProduct("Comida", "Lays");
		supply.addNewProduct("Comida", "Coca Cola");
		supply.addNewProduct("Comida", "Agua");
		supply.addNewProduct("Comida", "Pimiento");
		supply.addNewProduct("Comida", "Perejil");
		supply.addNewProduct("Comida", "Ajo");
		supply.addNewProduct("Comida", "Cebolla");
		
		assertEquals(supply.getCategoryFromValue("Agua"), "Comida");
		System.out.print(supply.getCategoryFromValue("Agua"));
	
	}

	@Test
	void testAddNewProduct() {
		Supply supply = new Supply(3);
		supply.addNewProduct("Comida", "Tomates");
		supply.addNewProduct("Comida", "Champiniones");
		supply.addNewProduct("Comida", "Berenjena");
		supply.addNewProduct("Comida", "Lays");
		supply.addNewProduct("Comida", "Coca Cola");
		supply.addNewProduct("Comida", "Agua");
		supply.addNewProduct("Comida", "Pimiento");
		supply.addNewProduct("Comida", "Perejil");
		supply.addNewProduct("Comida", "Ajo");
		supply.addNewProduct("Comida", "Cebolla");
		
		assertEquals(supply.getCategory("Agua"), null);
		assertEquals(supply.getCategory("Comida"), supply.getCategoryFromValue("Champiniones"));
		
		
	}

}
