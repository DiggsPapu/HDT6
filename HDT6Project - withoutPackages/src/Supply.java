package shop;

import dataStructures.IMap;
import dataStructures.MapFactory;

public class Supply {
	private IMap<String> inventory;
	/**
	 * Constructor, it requires the type of map to factory it.
	 * @param DataStructureType
	 */
	public Supply(int DataStructureType){
		this.inventory = MapFactory.CreateMap(DataStructureType);
	}
	/**
	 * The getter to inventory
	 * @return The inventory of the supply
	 */
	public IMap<String> getInventory() {
		return inventory;
	}
	/**
	 * It sets the inventory and it requires a map type
	 * @param inventory
	 * @return void, nothing
	 */
	public void setInventory(IMap<String> inventory) {
		this.inventory = inventory;
	}
	/**
	 * It prints the product supply not sorted
	 */
	public void getProductSupply(){
		getInventory().ShowMapping();
	}
	/**
	 * It gets if there is a category named after some value written by someone
	 * @param category
	 * @return the category if it exists
	 */
	public String getCategory(String category) {
		return getInventory().SearchKey(category);
	}
	/**
	 * Getting the category based on a value.
	 * @param product
	 * @return the pair category from the product
	 */
	public String getCategoryFromValue(String product) {
		return getInventory().getKeyFromValue(product);
	}
	/**
	 * It adds a new product to the supply, like if we were expanding our merchandising	
	 * @param key
	 * @param product
	 * @return none just inserts in the inventory
	 */
	public void addNewProduct(String key, String product) {
		getInventory().Insert(key, product);
	}
	/**
	 * It returns the inventory sorted, if it is a tree map, it does not require this
	 */
	public void getInventorySorted() {
		getInventory().ShowMapping2();
	}
	
//	public static void main(String[] args) {
//		Supply supply = new Supply(1);
//
//		supply.addNewProduct("Food", "apples");
//		supply.addNewProduct("Food", "Oranges");
//		supply.addNewProduct("Food", "Almonds");
//		supply.addNewProduct("Food", "Pies");
//		supply.addNewProduct("Clothes", "Jeans");
//		supply.addNewProduct("Clothes", "Shoes");
//		supply.addNewProduct("Clothes", "Crocs");
//
//		supply.getCategoryFromValue("apples");
//		cart.removeFromCart("Food", "apples");
//		cart.getProductList();
//		cart.getProductStats("Crocs");
//		cart.getProductStats("Almonds");
//		cart.getProductList();
//		cart.getProductStats("apples");	
//	}
}
