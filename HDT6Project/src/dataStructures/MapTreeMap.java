package dataStructures;

import java.util.ArrayList;
import java.util.TreeMap;

public class MapTreeMap<T> implements IMap<T> {
	private TreeMap<String, ArrayList<String>> dataStructure;
	
	public MapTreeMap() {
		dataStructure = new TreeMap<String, ArrayList<String>>();
	}
	
	public TreeMap<String, ArrayList<String>> getDataStructure() {
		return dataStructure;
	}


	public void setDataStructure(TreeMap<String, ArrayList<String>> dataStructure) {
		this.dataStructure = dataStructure;
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
<<<<<<< HEAD

	/**
	 * Used to search the key
	 * @param key value that want to find
	 * @return the key value as string
	 */
	public String SearchKey(T key) {
		// TODO Auto-generated method stub
		//The key set is saved as an array
		Object[] keySet = getDataStructure().keySet().toArray();
		//Searched in the array with the set of keys
		for (int k = 0; k < keySet.length; k++) {
			//If the key is the one we are lookin 4 we return it and show a message that it was found
			if ((String) keySet[k] == (String) key) {
				System.out.print(key+" key was found\n");
				return (String) keySet[k];
			}
		}
		//If it gets out from the 4, then the value was not found so we return null and show a message that was not found
		System.out.print(key+" key was not found\n");
		return null;
	}
	

=======
	
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
>>>>>>> a9e7f46edd87a42c8ab0cfd735640ceafe635c3c
}
