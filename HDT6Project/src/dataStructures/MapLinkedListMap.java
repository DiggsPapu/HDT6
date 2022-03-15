package dataStructures;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MapLinkedListMap<T> implements IMap<T> {
	
	private LinkedHashMap<String, ArrayList<String>> dataStructure;
	
	public LinkedHashMap<String, ArrayList<String>> getDataStructure() {
		return dataStructure;
	}

	public void setDataStructure(LinkedHashMap<String, ArrayList<String>> dataStructure) {
		this.dataStructure = dataStructure;
	}

	public MapLinkedListMap() {
		dataStructure = new LinkedHashMap<String, ArrayList<String>>();
	}
	/**
	 * It inserts the value inside the hashMap in the arrayList inside the hashmap
	 * @return void
	 */
	@Override
	public void Insert(T key, T value) {
		// TODO Auto-generated method stub
		
		//We will work it on arrayLists inside the keys.
		//If the key exists
		if (getDataStructure().containsKey(key)) {
			//We append the value at the end
			getDataStructure().get(key).add((String)value);
		//If the key doesn't exist
		}else {
			//We create a new array
			ArrayList<String> array = new ArrayList<String>();
			//We storage it in the key
			getDataStructure().put((String)key,array);
			//We append the value at the end
			getDataStructure().get(key).add((String)value);
			
		}
		
	}
	/**
	 * It returns a string with the value inside the arrayList.
	 * @param key,value
	 * @return String
	 */
	@Override
	public String SearchValue(T key, String value) {
		// TODO Auto-generated method stub
		// a for to move between the array objects
		for (int k = 0; k<getDataStructure().get(key).size(); k++) {
			//If we found the value in the array we return the value and print found
			if (getDataStructure().get(key).get(k)==value) {
				System.out.print("Found "+getDataStructure().get(key).get(k)+"\n") ;
				return getDataStructure().get(key).get(k);
			}
		}
		//If the value is not found we return null and print that was not found
		System.out.print(value+" was not found\n");
		return null;
		
	}
	/**
	 * Removes the value from the array inside the hash map
	 * Asks 4 a key and the value 2 be removed
	 * @param key, value
	 * @return String
	 */
	@Override
	public String Removin(T key, String value) {
		// TODO Auto-generated method stub
		//A for to move between the array objects
		for (int k = 0; k<getDataStructure().get(key).size(); k++) {
			//If we found the value in the array we remove the value, return the value
			//and print that it was removed
			if (getDataStructure().get(key).get(k)==value) {
				System.out.print(getDataStructure().get(key).get(k)+" was removed\n") ;
				return getDataStructure().get(key).remove(k);
			}
		}
		//If the value is not found we return null and print that it could not be removed
		System.out.print(value+" could not be removed\n");
		return null;
		
	}
	/**
	 * This method search the key if exists, and if so it returns the key in a string format
	 * @param key, the key that want to be founded
	 * @return String, string with the key that wanted to be found
	 */
	@Override
	public String SearchKey(T key) {
		// TODO Auto-generated method stub
		Object[] keySet = getDataStructure().keySet().toArray();
		for (int k = 0; k < keySet.length; k++) {
			if ((String) keySet[k] == (String) key) {
				return (String) keySet[k];
			}
		}
		return null;
	}
	/**
	 * It is to print the entry with its value, in a key value pair
	 * @param nothing
	 * @return nothing it is void
	 */
	@Override
	public void ShowMapping() {
		// TODO Auto-generated method stub
		Object[] keySet = getDataStructure().keySet().toArray();
		for (int k = 0; k < keySet.length; k++) {
			for (int l = 0; l < getDataStructure().get(keySet[k]).size() ; l ++) {
				System.out.print("Category: "+keySet[k]+" Value: " + getDataStructure().get(keySet[k]).get(l)+"\n");
			}
		}
	}
	/**
	 * This method searches the key based on a value given
	 * @param value, the value used to find the key
	 * @return String, the string of the key where the value is at
	 */
	@Override
	public String getKeyFromValue(T value) {
		// TODO Auto-generated method stub
		Object[] keySet = getDataStructure().keySet().toArray();
		for (int k = 0; k < keySet.length; k++) {
			for (int l = 0; l < getDataStructure().get(keySet[k]).size() ; l ++) {
				if (getDataStructure().get(keySet[k]).get(l)==value) {
					System.out.print("The category of " + value + " is "+ keySet[k]+"\n");
					return (String) keySet[k];
					
				}
			}
		}
		return null;
	}
}
