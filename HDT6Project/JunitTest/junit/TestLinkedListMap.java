package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dataStructures.MapLinkedListMap;

class TestLinkedListMap {
	MapLinkedListMap<String> preparationMethod() {
		//Instance a hashMap
		MapLinkedListMap<String> EjemploHash =  new MapLinkedListMap<String>();
		//Instance 4 arrayList to storage in the hashMap, with different values
		//A for cycle to add the values and to put in the DataStructure key
		ArrayList<String> arrayList1= new ArrayList<String>();
		for (int k = 0; k<10; k++) {
			arrayList1.add(Integer.toString(k));
		}
		EjemploHash.getDataStructure().put("Numbers", arrayList1);
		
		ArrayList<String> arrayList2= new ArrayList<String>();
		for (int k = 0; k<10; k++) {
			arrayList2.add("Bateria"+Integer.toString(k));
		}
		EjemploHash.getDataStructure().put("Bateria", arrayList1);
		
		ArrayList<String> arrayList3= new ArrayList<String>();
		for (int k = 0; k<10; k++) {
			arrayList3.add("ElPitufoEnrique"+Integer.toString(k));
		}
		EjemploHash.getDataStructure().put("Pitufo", arrayList3);
		
		ArrayList<String> arrayList4= new ArrayList<String>();
		for (int k = 0; k<10; k++) {
			arrayList4.add("AlBarcelonaLeMetenEnChampions"+Integer.toString(k));
		}
		EjemploHash.getDataStructure().put("Barcelona", arrayList4);
		
		return EjemploHash;
	}
	@Test
	void testGetDataStructure() {
		MapLinkedListMap<String> ex1 = preparationMethod();
		for (int k = 0; k < ex1.getDataStructure().get("Barcelona").size(); k++) {
			assertEquals(ex1.getDataStructure().get("Barcelona").get(k), "AlBarcelonaLeMetenEnChampions"+Integer.toString(k));
		}
	}

	@Test
	void testMapHashMap() {
		MapLinkedListMap<String> ex1 = preparationMethod();
		assertNotNull(ex1);
	}

	@Test
	void testInsert() {
		MapLinkedListMap<String> ex1 = preparationMethod();
		for (int k = 0; k < ex1.getDataStructure().get("Barcelona").size(); k++) {
			assertEquals(ex1.getDataStructure().get("Barcelona").get(k), "AlBarcelonaLeMetenEnChampions"+Integer.toString(k));
		}
		for (int k = 0; k < ex1.getDataStructure().get("Pitufo").size(); k++) {
			assertEquals(ex1.getDataStructure().get("Pitufo").get(k), "ElPitufoEnrique"+Integer.toString(k));
		}
		ex1.getDataStructure().put("Donald", null);
		assertEquals(ex1.getDataStructure().get("Donald"),null);
		
		
		
	}

	@Test
	void testSearch() {
		MapLinkedListMap<String> EjemploHash =  new MapLinkedListMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		
		assertEquals(null, EjemploHash.Search("Carro", "Lalaland"));
		assertEquals(EjemploHash.getDataStructure().get("Carro").get(1), EjemploHash.Search("Carro", "Toyota"));
		
		
	}
	@Test
	void testRemovin() {
		MapLinkedListMap<String> EjemploHash =  new MapLinkedListMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		
		
		EjemploHash.Removin("Carro", "Lalaland");
		
		EjemploHash.Removin("Carro", "Toyota");
		assertEquals(EjemploHash.Search("Carro", "Toyota"), null);
		
	}
}
