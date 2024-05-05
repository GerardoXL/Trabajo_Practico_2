package ar.edu.unju.fi.ejercicio2.main;
import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Efemeride> efemeride = new ArrayList<>();	
	
	
		Scanner entrada = new Scanner(System.in);
		
		
		int opcion;
		int NumEfemeride;
		
		
		do {
			
			System.out.println("Menu: ");
			System.out.println("1- Crear efemeride ");
			System.out.println("2- Mostrar efemeride ");
			System.out.println("3- Eliminar efemeride");
			System.out.println("4- Modificar efemeride");
			System.out.println("5- Salir ");
			
			opcion = entrada.nextInt();
			
		   if(efemeride.isEmpty() && opcion !=1 && opcion != 5) {
				
				System.out.println("debe crear una efemeride para usar las otras opciones");
				
			} else 
			
			switch (opcion) {
			
			case 1:
			         
				 Efemeride efemerides = new Efemeride();
				
				System.out.print("ingrese codigo: ");
				String codigo = entrada.next();
								
				efemerides.setCodigo(codigo);
				
				int NumMes;
				Mes mes;
				
				while(true) {
				System.out.print("ingrese numero de mes: ");
				
				 NumMes = entrada.nextInt();
				 entrada.nextLine();
			
				 if(NumMes >= 1 && NumMes <=12){
					
					 mes = Mes.values()[NumMes-1];
				
				     efemerides.setMes(mes);
				  break;
				  
				 } else { System.out.println("por favor ingrese un numero del 1 - 12: ");  
				 
				 }
				}
				
				
				
				int DiaDelMes = efemerides.ObtenerDiasDelMes();
				
				  while(true) {
					System.out.print("ingrese dia del mes de " + mes + ": ");
					
					int dia = entrada.nextInt();
					entrada.nextLine();
					
					if(dia >=1 && dia <=DiaDelMes) {
					
					efemerides.setDia(dia);
					
					break;
					} else { 
						
						    System.out.println("por favor ingresar un dia valido del mes " + mes + ": ");
					}
				  }
					System.out.print("ingrese detalles o sucesos de la fecha: ");
					String detalle = entrada.nextLine();
					efemerides.setDetalle(detalle);
					
					efemeride.add(efemerides);
					
					System.out.println("Se creo la efemeride ");
					
				  
			    break;
			case 2:
				
				
				
				for (int i = 0; i < efemeride.size(); i++) {
					
					Efemeride ef = efemeride.get(i);
					System.out.println((i+1) +  ".Efemeride");
					System.out.println("Codigo: " + ef.getCodigo());
					System.out.println("Mes: " + ef.getMes());
					System.out.println("Dia: " + ef.getDia());
					System.out.println("Detalles: " + ef.getDetalle());
					
				
					}
				
						
			break;
			
			case 3:
				
				System.out.println("ingresar numero de efemeride a eliminar");
				
				int BorrarEfemeride = entrada.nextInt();
				
				if(BorrarEfemeride >=1 && BorrarEfemeride <= efemeride.size()){
					
					efemeride.remove(BorrarEfemeride-1);
					
					System.out.println("Efemeride borrada. ");
					
				} else { System.out.println("la cantidad de efemeride que ingreso excede de 1 - " + efemeride.size());
					
				}
				
				break;
				
			case 4:
				
				System.out.println("ingresar el numero de efemeride que desea modificar: ");
				int ModificarEfemeride = entrada.nextInt();
				
				if(ModificarEfemeride >=1 && ModificarEfemeride <= efemeride.size()){
				
					Efemeride Modificar = efemeride.get(ModificarEfemeride -1) ;
					
					System.out.println("ingrese nuevo codigo: ");
					String nuevocodigo = entrada.next();
					
					Modificar.setCodigo(nuevocodigo);
					
					int NuevoMes;
					Mes meses;
					
					while(true) {
					
					System.out.print("ingrese nuevo mes: ");
					NuevoMes = entrada.nextInt();
					entrada.nextLine();
					
					if(NuevoMes >= 1 && NuevoMes <=12){
					
					meses = Mes.values()[NuevoMes-1];
					
					Modificar.setMes(meses);
					
					break;
					
					} else{
						
						System.out.print("por favor ingrese un numero del 1 - 12: ");
					      }	
					}
					
					int NuevoDiaDelMes = Modificar.ObtenerDiasDelMes();
					
					while(true) {
					
					System.out.println("ingrese nuevo dia del mes de " + meses + ": " );
					int NuevoDia = entrada.nextInt();
					entrada.nextLine();
					
					if(NuevoDia >=1 && NuevoDia <= NuevoDiaDelMes) {
					
					Modificar.setDia(NuevoDia);
					
					break;
					
					   } else { 
						      System.out.print("por favor ingresar un dia valido del mes " + meses + ": ");
					          }
						
					}

					System.out.print("ingrese nuevo detalle de la fecha: ");
					String nuevodetalle = entrada.nextLine();
					
					Modificar.setDetalle(nuevodetalle);
					
					
					
						
				} else {
						
						    System.out.println("la cantidad de efemeride que ingreso excede de 1 - " + efemeride.size());
					}
				
				break;
						
				
				
			case 5:
				
				System.out.println("Se salio del menu: ");
				
				break;
				
				default:
					
					System.out.println("opcion erronea. seleccione una opcion del menu. ");
					
					break;
				
			}
			
			
			
		} while (opcion !=5);
		
		
		entrada.close();
		
	
	
	}
		
		
	

}
