package shop;

import java.util.ArrayList;

import dataStructures.IMap;
import dataStructures.MapFactory;

public class Cart {
	private IMap<String> cart;
	
	public Cart(int DataStructureType){
		this.cart = MapFactory.CreateMap(DataStructureType);
	}

	public IMap<String> getCart() {
		return cart;
	}

	public void setCart(IMap<String> cart) {
		this.cart = cart;
	}
	
	public void addToCart(String key, String value) {
		getCart().Insert(key, value);
		System.out.print(value+" was added to the cart\n");
	}
	public String removeFromCart(String key, String product) {
		System.out.print(product+ " was removed from the cart\n");
		return getCart().Removin(key, product);
	}
	public String getCategory(String product) {
		return getCart().getKeyFromValue(product);
	
	}
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
	public void getProductList() {
		getCart().ShowMapping();
	}
	public static void main(String[] args) {
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

		cart.getProductStats("apples");
		cart.removeFromCart("Food", "apples");
		cart.getProductList();
		cart.getProductStats("Crocs");
		cart.getProductStats("Almonds");
		cart.getProductList();
		cart.getProductStats("apples");
		
		
		
	}
		
}
