package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructures.IMap;
import dataStructures.MapFactory;
import dataStructures.MapHashMap;
import dataStructures.MapLinkedListMap;
import dataStructures.MapTreeMap;

class TestMapFactory {

	@Test
	void testCreateMap1() {
	//If HashMap is selected
		MapHashMap<String> newMap = (MapHashMap<String>) MapFactory.CreateMap(1);
		newMap.Insert("LeoDicaprio", "Es el mejor actor");
		assertEquals(newMap.Search("LeoDicaprio", "Es el mejor actor"), "Es el mejor actor");
	}
	@Test
	void testCreateMap2() {
	//If LinkedHashMap is selected
		MapLinkedListMap<String> newMap = (MapLinkedListMap<String>) MapFactory.CreateMap(2);
		newMap.Insert("LeoDicaprio", "Es el mejor actor");
		assertEquals(newMap.Search("LeoDicaprio", "Es el mejor actor"), "Es el mejor actor");
	}
	@Test
	void testCreateMap3() {
	//If TreeMap is selected
		MapTreeMap<String> newMap = (MapTreeMap<String>) MapFactory.CreateMap(3);
		newMap.Insert("LeoDicaprio", "Es el mejor actor");
		assertEquals(newMap.Search("LeoDicaprio", "Es el mejor actor"), "Es el mejor actor");
	}
	@Test
	void testCreateMap4() {
	//If Default
		assertEquals(MapFactory.CreateMap(58), null);
	}

}
