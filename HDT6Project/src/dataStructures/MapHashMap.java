package dataStructures;
import java.util.HashMap;
import java.util.ArrayList;
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
		this.dataStructure = new HashMap<String, ArrayList<String>>();
	}
	/**
	 * Gets the product and then it searches it to get the product Key
	 * @param product
	 * @return the key from the product
	 */
	public String getKeyFromValue(T value) {
		//The key set is saved as an array
		Object[] keySet = getDataStructure().keySet().toArray();
		//Searched in the array with the set of keys
		for (int k = 0; k < keySet.length; k++) {
			//If the key is the one we are lookin 4 we return it and show a message that it was found
			for (int l = 0; l < getDataStructure().get(keySet[k]).size(); l++) {
				if (getDataStructure().get(keySet[k]).get(l)==value) {
					System.out.print("The key for "+value+" is "+keySet[k]+"\n");
					return (String) keySet[k];
				}
			}
		}
		System.out.print(value+" value was not found");
		return null;
	}
	/**
	 * It returns a string with the value inside the arrayList.
	 * @param key,value
	 * @return String
	 */
	public String SearchValue(T key, String value) {
		// TODO Auto-generated method stub
		// a for to move between the array objects
		for (int k = 0; k<getDataStructure().get(key).size(); k++) {
			//If we found the value in the array we return the value and print found
			if (getDataStructure().get(key).get(k)==value) {
				System.out.print("Found value "+getDataStructure().get(key).get(k)+"\n") ;
				return getDataStructure().get(key).get(k);
			}
		}
		//If the value is not found we return null and print that was not found
		System.out.print(value+" value was not found\n");
		return null;
		
	}
	/**
	 * Removes the value from the array inside the hash map
	 * Asks 4 a key and the value 2 be removed
	 * @param key, value
	 * @return String
	 */
	public String RemovinValue(T key, String value) {
		// TODO Auto-generated method stub
		//A for to move between the array objects
		for (int k = 0; k<getDataStructure().get(key).size(); k++) {
			//If we found the value in the array we remove the value, return the value
			//and print that it was removed
			if (getDataStructure().get(key).get(k)==value) {
				System.out.print(getDataStructure().get(key).get(k)+" value was removed\n") ;
				return getDataStructure().get(key).remove(k);
			}
		}
		//If the value is not found we return null and print that it could not be removed
		System.out.print(value+" value could not be removed\n");
		return null;
		
	}
	
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
	
	
	/**
	 * It inserts the value inside the hashMap in the arrayList inside the HashMap
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
			System.out.print(value + " value was inserted in " + key + "\n");
		//If the key doesn't exist
		}else {
			//We create a new array
			ArrayList<String> array = new ArrayList<String>();
			//We storage it in the key
			getDataStructure().put((String)key,array);
			System.out.print(key+ " key was created\n");
			//We append the value at the end
			getDataStructure().get(key).add((String)value);
			System.out.print(value + " value was inserted in "+ key + "\n");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<T> Search(T key) {
		// TODO Auto-generated method stub
		return (ArrayList<T>) getDataStructure().get(key);
	}
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<T> Remove(T key, String value) {
		// TODO Auto-generated method stub
		return (ArrayList<T>) getDataStructure().get(key);
	}
	
	public static void main(String[] args) {
		MapHashMap<String> EjemploHash =  new MapHashMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		for (int k = 0; k<EjemploHash.getDataStructure().get("Carro").size(); k++) {
			System.out.print(EjemploHash.getDataStructure().get("Carro").get(k)+"\n");
		}
		
		EjemploHash.SearchValue("Carro", "Lalaland");
		for (int l = 0; l<EjemploHash.getDataStructure().get("Carro").size(); l++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(l)+"\n");
		}
		EjemploHash.SearchValue("Carro", "Toyota");
		for (int n = 0; n<EjemploHash.getDataStructure().get("Carro").size(); n++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(n)+"\n");
		}
		
		EjemploHash.RemovinValue("Carro", "Lalaland");
		for (int j = 0; j<EjemploHash.getDataStructure().get("Carro").size(); j++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(j)+"\n");
		}
		EjemploHash.RemovinValue("Carro", "Toyota");
		for (int j = 0; j<EjemploHash.getDataStructure().get("Carro").size(); j++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(j)+"\n");
		}
		EjemploHash.SearchKey("Carro");
		EjemploHash.SearchKey("Raulito");
		EjemploHash.getKeyFromValue("Lambo");
		EjemploHash.Insert("Carro", "Ferrari");
		EjemploHash.Insert("Carro", "Mitsubishi");
		EjemploHash.getKeyFromValue("Ferrari");
		System.out.println(	EjemploHash.getDataStructure());
		EjemploHash.Remove(null, null)
	}
}
