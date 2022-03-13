package dataStructures;
import java.util.HashMap;
import java.util.ArrayList;
public class HashUsingHashMap<T> implements IMap<T>  {
	//The HashMap is private, has string 4 the keys and arrayList<String> 2 storage values
	private HashMap<String, ArrayList<String>> dataStructure;
	
	/**
	 * It gets the dataStructure (HashMap) in the implementation
	 * @return dataStructure
	 */
	public HashMap<String, ArrayList<String>> getDataStructure() {
		return dataStructure;
	}
	public HashUsingHashMap() {
		dataStructure = new HashMap<String, ArrayList<String>>();
	}
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
	 * 
	 */
	@Override
	public String Search(T key, String value) {
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
	public static void main(String[] args) {
		HashUsingHashMap<String> EjemploHash =  new HashUsingHashMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		for (int k = 0; k<EjemploHash.getDataStructure().get("Carro").size(); k++) {
			System.out.print(EjemploHash.getDataStructure().get("Carro").get(k)+"\n");
		}
		
		EjemploHash.Search("Carro", "Lalaland");
		for (int l = 0; l<EjemploHash.getDataStructure().get("Carro").size(); l++) {
			System.out.print("Object: "+EjemploHash.getDataStructure().get("Carro").get(l)+"\n");
		}
		EjemploHash.Search("Carro", "Toyota");
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
	}
	
}
