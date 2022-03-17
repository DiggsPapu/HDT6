package shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	private static Shop addInventory(Shop shop) {
		try {
			
			
			BufferedReader read= new BufferedReader(new FileReader("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT6\\src\\ListadoProducto.txt"));
			String line;
			
			while( (line = read.readLine() ) != null) {
			   
				String [] temp = line.split("\\|");
//			    System.out.println(temp[0].trim()+" "+temp[1].trim()+"\n");
			    shop.addNewProduct(temp[0].trim(),temp[1].trim());
			    
			}

		    System.out.print("Inventory loaded\n");
			
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
			
			Shop shop = new Shop(NumStructure);
			
			shop = addInventory(shop);
			
			shop.getProductList();
			boolean keepUsing=true;
			while (keepUsing) {
				System.out.print("Seleccione entre las siguientes opciones:\n1. Agregar producto al carrito.\n2. Mostrar la categoria del producto.\n3. Mostrar los datos del producto dentro de su carrito.\n4. Mostrar los datos de todos los productos dentro del carrito ordenado por categoria alfabeticamente.\n5. Mostrar los datos de todos los productos dentro del inventario ordenado por categoria alfabeticamente.\n6. Mostrar el producto y la categoria del inventario.\n7. Salir\n");
				try {
					int option = Integer.parseInt(scanner.nextLine());
					switch (option){
					
					case 1:{
						System.out.print("Ingrese la categoria: ");
						String category = scanner.nextLine();
						shop.getSupply().getCategory(category);
						

						if (shop.getSupply().getCategory(category)!=null) {
							System.out.print("\nIngrese el producto a aniadir: ");
							String product = scanner.nextLine();
							if (shop.getCategoryFromValue(product)!=null) {
								try {
									System.out.print("\nIngrese la cantidad de unidades de producto a aniadir: ");
									int amo = Integer.parseInt(scanner.nextLine());
									shop.sendToCart(category, product, amo);
									shop.getCartList();
								}
								catch(Exception e) {
									System.out.print("\nNo ingreso un digito valido\n");
								}
							}
							else {
								System.out.print("\nNo ingreso un producto valido\n");
							}
						}
						else {
							System.out.print("\nNo ingreso una categoria valida, intentelo de nuevo.\n");
						}
//						shop.getCart().addToCart(dataStructureType, dataStructureType);
					break;
					}
					
					case 2:{
						System.out.print("\nPor favor, ingrese el producto del que desee chequear la categoria: ");
						String producto = scanner.nextLine();
						if (shop.getCategoryFromValue(producto).equals(null)) {
							System.out.print("\nNo ingreso un producto valido.\n");
						}
						else {
							System.out.print("La categoria del producto " + producto + " es: " + shop.getCategoryFromValue(producto) + "\n");
						}
						break;
					}
					
					case 3:{
						shop.getCartList();
						break;
					}
					case 4:{
						shop.getCartListSorted();
						break;
					}
					case 5:{
						shop.getProductList();
						break;
					}
					case 6:{
						shop.getProductListSorted();
						break;
					}
					
					case 7:{
						System.out.print("\nGracias por utilizar nuestro programa.\n Feliz dia!");
						keepUsing=false;
						break;
					}
					
					
					}
						
						
				}
				catch(Exception e) {
					System.out.print("No selecciono una opcion valida, vuelva a intentar.\n");
				}
			
			}
		
			
			
		}catch (Exception e) {
			System.out.print("The selected option is not valid");
		}
		
	scanner.close();	
		

	}
}
