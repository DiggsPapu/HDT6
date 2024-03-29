package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dataStructures.MapHashMap;

class TestHashMap {
	MapHashMap<String> preparationMethod() {
		//Instance a hashMap
		MapHashMap<String> EjemploHash =  new MapHashMap<String>();
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
	void testInsert() {
		MapHashMap<String> ex1 = preparationMethod();
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
	void testSearchValue() {
		MapHashMap<String> EjemploHash =  new MapHashMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		
		assertEquals(null, EjemploHash.SearchValue("Carro", "Lalaland"));
		assertEquals(EjemploHash.getDataStructure().get("Carro").get(1), EjemploHash.SearchValue("Carro", "Toyota"));
		
		
	}
	@Test
	void testRemovin() {
		MapHashMap<String> EjemploHash =  new MapHashMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		
		
		EjemploHash.Removin("Carro", "Lalaland");
		
		EjemploHash.Removin("Carro", "Toyota");
		assertEquals(EjemploHash.SearchValue("Carro", "Toyota"), null);
	}
	
	@Test
	void testSearchKey() {
		MapHashMap<String> ExHash = preparationMethod();
		assertEquals(ExHash.SearchKey("Carro"), null);
		assertEquals(ExHash.SearchKey("Numbers"), "Numbers");
	}

	@Test
	void testShowMapping() {
		MapHashMap<String> ExHash = preparationMethod();
		ExHash.ShowMapping();
	}

	@Test
	void testGetKeyFromValue() {
		MapHashMap<String> EjemploHash =  new MapHashMap<String>();
		EjemploHash.Insert("Carro", "Lambo");
		EjemploHash.Insert("Carro", "Toyota");
		EjemploHash.Insert("Comida", "Insectos");
		
		assertEquals(EjemploHash.getKeyFromValue("Lalalnd"), null);
		assertEquals(EjemploHash.getKeyFromValue("Toyota"), "Carro");
	}

}
