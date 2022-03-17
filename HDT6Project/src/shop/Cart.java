package shop;

import java.util.ArrayList;

import dataStructures.IMap;
import dataStructures.MapFactory;

public class Cart {
	private IMap<String> cart;
	/**
	 * It is the constructor, it needs the type of DataStructure to be instantiated
	 * @param DataStructureType
	 */
	public Cart(int DataStructureType){
		this.cart = MapFactory.CreateMap(DataStructureType);
	}
	/**
	 * It is to get to the cart
	 * @return
	 */
	public IMap<String> getCart() {
		return cart;
	}
	/**
	 * It is to set the cart
	 * @param cart
	 */
	public void setCart(IMap<String> cart) {
		this.cart = cart;
	}
	/**
	 * This method is void and just adds the products to the cart
	 * @param key, to know where to add the product
	 * @param value, to know what product to add
	 */
	public void addToCart(String key, String value) {
		getCart().Insert(key, value);
//		System.out.print(value+" was added to the cart\n");
	}
	/**
	 * This method returns the removed product, aso prints which was removed
	 * @param key, to know where to remove the product
	 * @param product, to know what product to remove
	 * @return String with the removed product
	 */
	public String removeFromCart(String key, String product) {
//		System.out.print(product+ " was removed from the cart\n");
		return getCart().Removin(key, product);
	}
	/**
	 * This method returns the name of the category of a product, based on the product existence
	 * @param product, the product which will be used to find it's category
	 * @return String with the Category of the product
	 */
	public String getCategory(String product) {
		return getCart().getKeyFromValue(product);
	
	}
	/**
	 * This method prints the stats of the product and returns those stats in a ArrayList<String>
	 * @param product
	 * @return ArrayList<String> with the product stats: category, product name and number of items
	 */
	public ArrayList<String> getProductStats(String product) {
		if (getCart().getKeyFromValue(product)!=null) {
			ArrayList<String> productStats = new ArrayList<String>();
			System.out.print("Category: " + getCart().getKeyFromValue(product) + "Product: " + getCart().SearchValue(product) + " Number of items: " + getCart().countValues(product) + "\n");		
			productStats.add(getCart().getKeyFromValue(product));
			productStats.add(getCart().SearchValue(product));
			productStats.add(Integer.toString(getCart().countValues(product)));
			return productStats;
		}
		return null;
		
	}
	
	/**
	 * Prints the list of products in the cart
	 * @param Nothing it does not require arguments
	 * @return Nothing, it is void
	 */
	public void getProductList() {
		getCart().ShowMapping();
	}
	public void getProductSortedList() {
		getCart().ShowMapping2();
	}
	
	public static void main(String[] args) {
		Cart cart = new Cart(3);

		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Oranges");
		cart.addToCart("Food", "Almonds");
		cart.addToCart("Food", "apples");
		cart.addToCart("Food", "Pies");
		cart.addToCart("Food", "apples");
		cart.addToCart("Clothes", "Jeans");
		cart.addToCart("Clothes", "Shoes");
		cart.addToCart("Clothes", "Crocs");
		cart.addToCart("Yo", "Jeans");
		cart.addToCart("Ddew", "Shoes");
		cart.addToCart("iow", "Crocs");

		cart.getProductStats("apples");
		cart.removeFromCart("Food", "apples");
		cart.getProductList();
		cart.getProductStats("Crocs");
		cart.getProductStats("Almonds");
		cart.getProductList();
		cart.getProductStats("apples");
		
		cart.getProductSortedList();
		
	}
		
}
