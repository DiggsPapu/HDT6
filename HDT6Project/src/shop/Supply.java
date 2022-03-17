package shop;

import dataStructures.IMap;
import dataStructures.MapFactory;

public class Supply {
	private IMap<String> inventory;
	
	public Supply(int DataStructureType){
		this.inventory = MapFactory.CreateMap(DataStructureType);
	}
	
	public IMap<String> getInventory() {
		return inventory;
	}

	public void setInventory(IMap<String> inventory) {
		this.inventory = inventory;
	}

	public void getProductSupply(){
		getInventory().ShowMapping();
	}
	
	public String getCategory(String category) {
		return getInventory().SearchKey(category);
	}
	
	public String getCategoryFromValue(String product) {
		return getInventory().getKeyFromValue(product);
	}
	
	
	
	public void addNewProduct(String key, String product) {
		getInventory().Insert(key, product);
	}
	
	public void getInventorySorted() {
		getInventory().ShowMapping2();
	}
	
	public static void main(String[] args) {
		Supply supply = new Supply(1);

		supply.addNewProduct("Food", "apples");
		supply.addNewProduct("Food", "Oranges");
		supply.addNewProduct("Food", "Almonds");
		supply.addNewProduct("Food", "Pies");
		supply.addNewProduct("Clothes", "Jeans");
		supply.addNewProduct("Clothes", "Shoes");
		supply.addNewProduct("Clothes", "Crocs");

		supply.getCategoryFromValue("apples");
//		cart.removeFromCart("Food", "apples");
//		cart.getProductList();
//		cart.getProductStats("Crocs");
//		cart.getProductStats("Almonds");
//		cart.getProductList();
//		cart.getProductStats("apples");
		
		
		
	}
}
