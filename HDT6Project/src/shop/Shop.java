package shop;

public class Shop {
	private Cart cart;
	private Supply supply;
	
	/**
	 * It instantiates the cart and the supply in the shop
	 * @param DataStructure, the type of dataStructure 2 be implemented
	 */
	public Shop(int DataStructure) {
		cart = new Cart(DataStructure);
		supply = new Supply(DataStructure);
	}
	
	/**
	 * To get the cart type
	 * @return the cart object
	 */
	public Cart getCart() {
		return cart;
	}

/**
 * To set the cart object if it was already created
 * @param cart
 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/**
	 * To get the supply atrribute
	 * @return the supply object
	 */
	public Supply getSupply() {
		return supply;
	}



/**
 * To set the Supply object if it was already created
 * @param supply
 */
	public void setSupply(Supply supply) {
		this.supply = supply;
	}


/**
 * To add to the  cart
 * @param key, in which category will be added
 * @param productName, what product will be added
 * @param amount, the amount of product to add
 */
	public void sendToCart(String key, String productName, int amount) {
		
		for (int k = 0 ; k < amount ; k ++ ) {
			getCart().addToCart(key, productName);
		}
	}
	/**
	 * If they want to develop new product 2 their inventory
	 * @param key, to set in which category
	 * @param product, to add what
	 */
	public void addNewProduct(String key, String product) {
		getSupply().addNewProduct(key, product);
	}
	/**
	 * To get the category if they get the product
	 * @param product
	 * @return String with the category type
	 */
	public String getCategoryFromValue(String product) {
		return getSupply().getCategoryFromValue(product);
	}
	
	/**
	 * To check how many of a product there is in the cart
	 * @param product
	 */
	public void getProductInCart(String product){
		getCart().getProductStats(product);
	}
/**
 * To print the list of what will be bought
 */
	public void getCartList() {
		getCart().getProductList();
	}
	/**
	 * To print the list of available items
	 */
	public void getProductList() {
		getSupply().getProductSupply();
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop(1);
		System.out.print(shop.getCart().getCart().toString());
	}
}
