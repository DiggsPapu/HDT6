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
	public String getCategory(String product) {
		return getInventory().SearchKey(product);
	}
	
	public void addNewProduct(String key, String product) {
		getInventory().Insert(key, product);
	}
}
