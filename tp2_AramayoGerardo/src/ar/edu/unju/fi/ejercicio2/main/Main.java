package ar.edu.unju.fi.ejercicio2.main;
import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Efemeride> efemerides = new ArrayList<>();
	
		Scanner entrada = new Scanner(System.in);
		
		
		int opcion;
		
		do {
			
			System.out.println("Menu: ");
			System.out.println("1- Crear efemeride ");
			System.out.println("2- Eliminar efemeride ");
			System.out.println("3- Eliminar efemeride");
			System.out.println("4- Modificar efemeride");
			System.out.println("5- Salir ");
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			
			case 1:
				
				System.out.println("ingrese la efemeride: ");
				String efemeride = entrada.nextLine();
				break;
			case 2:
				
				System.out.println("Efemerides: ");
				
				for(int i = 0; i < efemerides.size(); i++) {
					
					System.out.println((i+1) + ". " + efemerides.get(i));
					
				}
			break;
			
			case 3:
				
				System.out.println("ingresar numero de efemeride a eliminar");
				
				int IndiceEliminar = entrada.nextInt();
				
				if(IndiceEliminar >= 1 && IndiceEliminar <= efemerides.size()) {
					
					System.out.println("Se elimino la efemeride. ");
					
					
				} else {
					
					System.out.println("Efemeride invalida");
				}
				
				break;
				
			case 4:
				
				System.out.println("Ingresar efemeride a modificar: ");
				
				int IndiceModificar = entrada.nextInt();
				
				entrada.nextLine();
				
				if(IndiceModificar >= 1 && IndiceModificar <= efemerides.size()) {
					
					System.out.println("ingresar nueva efemeride: ");
					
					String detalleNuevaEfemeride = entrada.nextLine();
					
					Efemeride EfemerideNueva = new Efemeride();
					
					EfemerideNueva.setDetalle(detalleNuevaEfemeride);
					
					efemerides.set(IndiceModificar -1 , EfemerideNueva);
					
					System.out.println("Se modifico la efemeride. ");
					
				} else {
					
					System.out.println("Efemeride invalida ");
					
				}
				
			    break;
			    
			case 5:
				
				System.out.println("Saliendo del menu: ");
				
				break;
				
				default:
					
					System.out.println("opcion erronea. seleccione una opcion del menu. ");
					
					break;
				
			}
			
			
			
		} while (opcion !=5);
		
		
		entrada.close();

	}
	
	
		
		
	

}
