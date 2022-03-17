package shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	private static Shop addInventory(Shop shop) {
		try {
			
			
			BufferedReader read= new BufferedReader(new FileReader("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT6\\src\\ListadoProducto.txt"));
			System.out.print(2.1+"\n");
			String line;
			
			while( (line = read.readLine() ) != null) {
			    System.out.printf(line+"\n");
			    
			    String [] temp = line.split("\\|");
			    System.out.println(temp[0].trim()+" "+temp[1].trim()+"\n");
			    shop.addNewProduct(temp[0].trim(),temp[1].trim());
			    
			}

		    shop.getProductList();
			
			return shop;
			}
		
		
		catch (Exception e) {
			System.out.print("El archivo no es posible de ordenar dado que no solo posee numeros\n");

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
			System.out.print(1);
			Shop shop = new Shop(NumStructure);
			System.out.print(2);
			shop = addInventory(shop);
			System.out.print(3);
			
			shop.getProductList();
//			while (true) {
//				System.out.print("Seleccione entre las siguientes opciones:\n1. Agregar producto al carrito.\n2. Mostrar la categoria del producto.\n3. Mostrar los datos del producto dentro de su carrito.\n4. Mostrar los datos de todos los productos dentro del carrito.\n6. Mostrar el producto y la categoria del el inventario.\n");
//				try {
//					int option = Integer.parseInt(scanner.nextLine());
//					switch (option){
//					
//					
//					
//					}
//						
//						
//				}
//				catch(Exception e) {
//					System.out.print("No selecciono una opcion valida, vuelva a intentar.\n");
//				}
//			
//			}
//		
//			
			
		}catch (Exception e) {
			System.out.print("The selected option is not valid");
		}
		
	scanner.close();	
		

	}
}
