package dataStructures;
import java.util.HashMap;
import java.util.ArrayList;
public class HashUsingHashMap<T> extends Map<T> implements IHashTable<T>  {
	private HashMap<String, ArrayList<String>> dataStructure;
	
	public HashMap<String, ArrayList<String>> getDataStructure() {
		return dataStructure;
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
	
	
}
