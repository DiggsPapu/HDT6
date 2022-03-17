package shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import java.math.*;

public class Main {

	private static Shop addInventory(Shop shop) {
		try {
			
			
			BufferedReader read= new BufferedReader(new FileReader("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT6\\src\\ListadoProducto.txt"));
			
			String contenido = read.readLine();
			String[] tempArray= contenido.split("|");
			read.close();

			
			for (int k = 0; k < tempArray.length ; k++) {
				boolean result = false;
				
				if ( result = (k%2) == 0) {
					//Adds the product
					shop.addNewProduct(tempArray[k-1].trim(), tempArray[k].trim());
				}
			}

			return shop;
			}
		
		
		catch (Exception e) {
			System.out.print("El archivo no es posible de ordenar dado que no solo posee numeros\n");
			String[] tempArray= null;

			return shop;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		
		
		System.out.print("Seleccione el numero para el tipo de estructura de dato a utilizar:\n1.HashMap\n2.ListMap\n3.TreeMap\n");
		String dataStructureType = scanner.nextLine();
		try {
			int NumStructure = Integer.parseInt(dataStructureType);
			Shop shop = new Shop(NumStructure);
			while (true) {
				System.out.print("Seleccione entre las siguientes opciones:\n1. Agregar producto al carrito.\n2. Mostrar la categoria del producto.\n3. Mostrar los datos del producto dentro de su carrito.\n4. Mostrar los datos de todos los productos dentro del carrito.\n6. Mostrar el producto y la categoria del el inventario.\n");
				try {
					int option = Integer.parseInt(scanner.nextLine());
					switch (option){
					
					
					
					}
						
						
				}
				catch(Exception e) {
					System.out.print("No selecciono una opcion valida, vuelva a intentar.\n");
				}
			
			}
		
			
			
		}catch (Exception e) {
			System.out.print("The selected option is not valid");
		}
		
		
		

	}
}
