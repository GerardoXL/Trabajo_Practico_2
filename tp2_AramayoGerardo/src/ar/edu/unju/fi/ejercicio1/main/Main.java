package ar.edu.unju.fi.ejercicio1.main;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.Origen_Fabricacion;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Producto> productos = new ArrayList<>();
		int opcion;
		
		do {
			System.out.println("----Menu----");
			System.out.println("1 - Crear Producto ");
			System.out.println("2 - Mostrar Productos ");
			System.out.println("3 - Modificar producto ");
			System.out.println("4 - Salir ");
			 opcion = entrada.nextInt();
			
			
		    switch (opcion) {
			case 1:
				
				System.out.println("ingresar codigo del prodcuto: ");
				String codigo = entrada.nextLine();
				entrada.nextLine();
				
				System.out.println("ingresar descripcion del producto: ");
				String descripcion = entrada.nextLine();
				
				System.out.println("ingresar precio unitario del producto: ");
				double precio_unitario = entrada.nextDouble();
				
				System.out.println("ingresar origen de fabricacion: 1. ARGENTINA, 2. CHINA, 3. BRASIL, 4. URUGUAY ");
				int origen_fabricacion = entrada.nextInt();
				
				entrada.nextLine();
				
				System.out.println("ingresar categoria del producto: 1. TELEFONIA, 2. INFORMATICA, 3. ELECTRO HOGAR, 4. HERRAMIENTAS ");
				int categoria = entrada.nextInt();
				
				entrada.nextLine();
				
				
				Producto.Categoria ProductoCategoria = Producto.Categoria.values()[categoria -1];
				Producto.Origen_Fabricacion productoOrigen = Producto.Origen_Fabricacion.values()[origen_fabricacion -1];
				
				productos.add(new Producto(codigo, descripcion, precio_unitario, productoOrigen, ProductoCategoria));
				
				
			break;

			case 2:
				
				for (Producto producto : productos) {
					
					System.out.println("Codigo : " + producto.getCodigo());
					System.out.println("Descripcion: " + producto.getDescripcion());
					System.out.println("Precio Unitario: " + producto.getPrecio_unitario() + "$");
					System.out.println("Origen de Fabricacion: " + producto.getOrigen_fabricacion());
					System.out.println("Categoria: " + producto.getCategoria());
					System.out.println("................");
					
					}
				
				break;
				
			case 3:
				
				
				System.out.println("ingresar el codigo del producto a modificar: ");
				entrada.nextLine();
				
				String ModifiCodigo = entrada.nextLine();
				
				for(Producto producto : productos) {
					
					if(producto.getCodigo().equals(ModifiCodigo)) {
						
						
					System.out.println("ingresar la nueva descripcion del producto: ");
					
					String DescripcionNueva = entrada.nextLine();
					
					producto.setDescripcion(DescripcionNueva);
					
					System.out.println("ingresar nuevo precio unitario del producto: ");
					double NuevoPrecio = entrada.nextDouble();
					
					entrada.nextLine();
					
					System.out.println("elegir el nuevo origen de fabricacion 1. ARGENTINA, 2. CHINA, 3. BRASIL, 4:URUGUAY: ");
					
					int OrigenNuevo = entrada.nextInt();
					
					entrada.nextLine();
					
					Producto.Origen_Fabricacion nuevoOrigen_Fabricacion = Producto.Origen_Fabricacion.values()[OrigenNuevo -1];
					
					producto.setOrigen_fabricacion(nuevoOrigen_Fabricacion);
					
					System.out.println("elegir la nueva categoria del producto: 1. TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS: ");
					
					int CategoriaNueva = entrada.nextInt();
					entrada.nextLine();
					
					Producto.Categoria nuevCategoria = Producto.Categoria.values()[CategoriaNueva -1];
					
						
					}
					
					
					
				}
		
		    
		      break;
		      
			case 4:
				
				System.out.println("Salir....");
				
				break;
				
				default:
				
				System.out.println("Opcion invalida. eliga una opcion del menu.");
			
		    }
		    
		} while(opcion !=4);
		
		
		entrada.close();
		
		
	}
}
