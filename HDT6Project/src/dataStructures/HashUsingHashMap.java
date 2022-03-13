package dataStructures;
import java.util.HashMap;
import java.util.ArrayList;
public class HashUsingHashMap<T> extends Map<T> implements IHashTable<T>  {
	private HashMap<String, ArrayList<String>> dataStructure;
	
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

	@Override
	public T Search(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T Remove(T key) {
		// TODO Auto-generated method stub
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
	}
	
}
