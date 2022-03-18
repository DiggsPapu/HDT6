package dataStructures;
import java.util.HashMap;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class MapHashMap<T> implements IMap<T>  {
	//The HashMap is private, has string 4 the keys and arrayList<String> 2 storage values
	private HashMap<String, ArrayList<String>> dataStructure;
	
	/**
	 * It gets the dataStructure (HashMap) in the implementation
	 * @return dataStructure
	 */
	public HashMap<String, ArrayList<String>> getDataStructure() {
		return dataStructure;
	}
	/**
	 * Constructor, creating the dataStructure as a HashMap, does not return anything
	 * @return none
	 */
	public MapHashMap() {
		// the dataStructure as a HashMap
		dataStructure = new HashMap<String, ArrayList<String>>();
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
			if (getDataStructure().get(key).get(k).equals(value)) {
//				System.out.print("Found "+getDataStructure().get(key).get(k)+"\n") ;
				return getDataStructure().get(key).get(k);
			}
		}
		//If the value is not found we return null and print that was not found
//		System.out.print(value+" was not found\n");
		return null;
		
	}
	/**
	 * It searches across all the arrays inside the hash to find the value
	 * @param value, to be found
	 * @return String, with the value
	 */
	@Override
	public String SearchValue(String value) {
		
		Object[] keySet = getDataStructure().keySet().toArray();
		for (int k = 0; k < keySet.length; k++) {
			for (int l = 0; l < getDataStructure().get(keySet[k]).size() ; l ++) {
				if (getDataStructure().get(keySet[k]).get(l).equals(value)) {
					return getDataStructure().get(keySet[k]).get(l);
				}
				
			}
		}
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
			if (getDataStructure().get(key).get(k).equals(value)) {
//				System.out.print(getDataStructure().get(key).get(k)+" was removed\n") ;
				return getDataStructure().get(key).remove(k);
			}
		}
		//If the value is not found we return null and print that it could not be removed
//		System.out.print(value+" could not be removed\n");
		return null;
		
	}
	
	
	/**
	 * It is to print the entry with its value, in a key value pair
	 * @param nothing
	 * @return nothing it is void
	 */
	@Override
	public void ShowMapping(){
		//Creates the set of keys
		Object[] keySet = getDataStructure().keySet().toArray();
		//To run in the set
		for (int k = 0; k < keySet.length; k++) {
			///Creates a temp Array to compare already printed objects
			ArrayList<String> tempArray = new ArrayList<String>();
			for (int l = 0; l < getDataStructure().get(keySet[k]).size() ; l ++) {
				//In case the object have not been printed we print it
				if (!tempArray.contains(getDataStructure().get(keySet[k]).get(l))){
					System.out.print("Category: " + keySet[k] + " || Product: " + getDataStructure().get(keySet[k]).get(l) + " || Number: " + Collections.frequency(getDataStructure().get(keySet[k]),getDataStructure().get(keySet[k]).get(l)) + "\n");
				}
				//We add the object
				tempArray.add(getDataStructure().get(keySet[k]).get(l));
				
			}
		}
		//Garbage collector throws out the temp array
	}
	
	
	/**
	 * This mapping is to show the Sorted way, in the category.
	 * 
	 */
	@Override
	public void ShowMapping2() {
		//Get a set with keys
		Object[] keySet = getDataStructure().keySet().toArray();
		//Creates a temporal array to storage the keys
		ArrayList<String> array = new ArrayList<String>();
		for (int l = 0; l < keySet.length ; l++) {
			array.add((String) keySet[l]);
		}
		//Sorts the keys in alphabetical
		Collections.sort(array);
		//To move in the array
		for (int k = 0; k < array.size(); k++) {
			///Creates a temp Array to compare already printed objects
			ArrayList<String> tempArray = new ArrayList<String>();
			for (int l = 0; l < getDataStructure().get(array.get(k)).size() ; l ++) {
				//In case the object have not been printed we print it
				if (!tempArray.contains(getDataStructure().get(array.get(k)).get(l))){
					System.out.print("Category: " + array.get(k) + " || Product: " + getDataStructure().get(array.get(k)).get(l) + " || Number: " + Collections.frequency(getDataStructure().get(array.get(k)),getDataStructure().get(array.get(k)).get(l)) + "\n");
				}
				//We add the object
				tempArray.add(getDataStructure().get(array.get(k)).get(l));
				
			}
		}
		//Garbage collector throws out the temp array and the temporal array
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
				if (getDataStructure().get(keySet[k]).get(l).equals(value)) {
//					System.out.print("The category of " + value + " is "+ keySet[k]+"\n");
					return (String) keySet[k];
					
				}
			}
		}
		return null;
	}
	
	
	
	/**
	 * This method will get the number of items for a specific value
	 * @param value
	 * @return Integer, returns the amount of items for an specific value
	 */
	@Override
	public int countValues(T value) {
		Object[] keySet = getDataStructure().keySet().toArray();
		int counter = 0;
		for (int k = 0; k < keySet.length; k++) {
			for (int l = 0; l < getDataStructure().get(keySet[k]).size() ; l ++) {
				if (getDataStructure().get(keySet[k]).get(l).equals(value)) {
					counter++;
				}
				
			}
		}
		return counter;
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
//		System.out.print(key.toString()+"______\n");
		for (int k = 0; k < keySet.length; k++) {
//			System.out.print(keySet[k]+"\n");
			
			if (key.equals(keySet[k])) {
//				System.out.print("Categoria: " + (String) keySet[k]+"\n");
				return (String) keySet[k];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		MapHashMap<String> EjemploHash =  new MapHashMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");

		EjemploHash.ShowMapping();
		EjemploHash.getKeyFromValue("Insectos");
		EjemploHash.SearchValue("Carro", "Lalaland");
		for (int l = 0; l<EjemploHash.getDataStructure().get("Carro").size(); l++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(l)+"\n");
		}
		EjemploHash.SearchValue("Carro", "Toyota");
		for (int n = 0; n<EjemploHash.getDataStructure().get("Carro").size(); n++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(n)+"\n");
		}
		
		EjemploHash.Removin("Carro", "Lalaland");
		for (int j = 0; j<EjemploHash.getDataStructure().get("Carro").size(); j++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(j)+"\n");
		}
		EjemploHash.Removin("Carro", "Toyota");
		for (int j = 0; j<EjemploHash.getDataStructure().get("Carro").size(); j++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(j)+"\n");
		}
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Lambo");
		System.out.print(EjemploHash.SearchValue("Insectos")+"\n");;
		System.out.print(EjemploHash.countValues("Lambo")+"\n");
		EjemploHash.ShowMapping();

		EjemploHash.Insert("Carro", "Mitsubishi");
		EjemploHash.Insert("Carro", "Mitsubishi");
		EjemploHash.Insert("Carro", "Toyota");
		System.out.print("\n");
		EjemploHash.ShowMapping();
		EjemploHash.getKeyFromValue("Toyota");
		System.out.print(EjemploHash.SearchKey("Carro"));
		Scanner scanner = new Scanner(System.in);
		String coso =scanner.nextLine();
		System.out.print(coso);
		System.out.print(EjemploHash.SearchKey(coso));
		String coso1 =scanner.nextLine();
		String coso2 =scanner.nextLine();
		EjemploHash.Removin(coso1, coso2);
		EjemploHash.ShowMapping();
		EjemploHash.SearchKey(coso1);
		EjemploHash.ShowMapping2();
	}
}
