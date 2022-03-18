package dataStructures;

public class MapFactory {
	/**
	 * Creates a Map based on the option given, returns null if not acceptable
	 * @param selectedMap
	 * @return MapHashMap<String>, MapLinkedListMap<String>, MapTreeMap<String>
	 * @exception null
	 */
	public static IMap<String> CreateMap(int selectedMap) {
		switch(selectedMap) {
		case 1:{
			//HashMap
			return new MapHashMap<>();
		}
		case 2:{
			//LinkedHashMap
			return new MapLinkedListMap<>();
		}
		case 3:{
			//TreeMap
			return new MapTreeMap<>();
		}
		default:{
			return null;
		}
		}
		
	}
	
}
