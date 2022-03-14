package shop;

import dataStructures.IMap;
import dataStructures.MapFactory;

public class Cart {
	private IMap<String> cart;
	
	Cart(int DataStructureType){
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
		System.out.print(value+" was added to the cart");
	}
	public String removeFromCart(String key, String product) {
		System.out.print(product+ "was removed from the cart");
		return getCart().Removin(key, product);
	}
	public void getCategory(String product) {
		System.out.print("");
	
	}
	public void getProductStats(String product) {
		
	}
	public void getProductList() {
		
	}
}
