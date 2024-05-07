package ar.edu.unju.fi.ejercicio4.main;
import ar.edu.unju.fi.ejercicio4.model.Jugador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;


public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Jugador> jugador = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		int numJugador;
		
		do {
			
			System.out.println("1- Alta de jugador: ");
			System.out.println("2- Mostrar todos los jugadores: ");
			System.out.println("3- Modificar Posicion del jugador: ");
			System.out.println("4- Eliminar un jugador: ");
			System.out.println("5- Salir: ");
			
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.print("ingrese nombre del jugador: ");
				String nombre = entrada.next();
				
				System.out.print("ingrese apellido del jugador: ");
				String apellido = entrada.next();
				
				Date fechaNacimientoDate = null;
				
				do {
				
				System.out.print("ingrese la fecha de nacimiento: ");
			    String fecha_de_nacimiento = entrada.next();
			    
			    SimpleDateFormat fechaformato = new SimpleDateFormat ("dd-MM-yyyy");
				
				    try {
				
			            fechaNacimientoDate = fechaformato.parse(fecha_de_nacimiento);
			    
				    } catch (ParseException e) {
					
					System.out.println("formato incorrecto, ingrese de nuevo. ");
				     }
				
				} while(fechaNacimientoDate == null);
				
				 Calendar FechaNacimiento = Calendar.getInstance();
			     FechaNacimiento.setTime(fechaNacimientoDate);
			     
			     System.out.print("ingrese nacionalidad del jugador: ");
			     String nacionalidad = entrada.next();
			     
			     System.out.print("ingrese estatura del jugador: ");
			     double estatura = entrada.nextDouble();
			     
			     System.out.print("ingrese peso del jugador: ");
			     double peso = entrada.nextDouble();
			     entrada.nextLine();
			     
			     Posicion posicion = null;
			     
			     do {
			     
			     System.out.print("ingrese posicion del jugador (DELANTERO, MEDIO, DEFENSA, ARQUERO): ");
			     String posicionStr = entrada.next().toUpperCase();
			     
			      try {
			     posicion = Posicion.valueOf(posicionStr);
			     
			      }catch (IllegalArgumentException e) {
			    	  
			    	  System.out.println("posicion no valida. intente de nuevo." );
			      }
			     
			     }  while(posicion == null);
			     Jugador nuevojugador = new Jugador(nombre, apellido, FechaNacimiento, nacionalidad, estatura, peso);
			     
			     nuevojugador.setPosicion(posicion);
			     
			     jugador.add(nuevojugador);
			     
				
			     
			    break;
			    
			case 2:
				
				for (int i = 0; i < jugador.size(); i++) {
					
					System.out.println("jugador " + (i+1) + ":");
					System.out.println("***************************************");
					System.out.println("Nombre: " + jugador.get(i).getNombre());
					System.out.println("Apellido: " + jugador.get(i).getApellido());
					
					SimpleDateFormat fechaformato = new SimpleDateFormat ("dd-MM-yyyy");
					System.out.println("Fecha de Nacimiento: " + jugador.get(i).toString()); 
					System.out.println("Nacionalida: " + jugador.get(i).getNacionalidad());
					System.out.println("Estatura: " + jugador.get(i).getEstatura() + " m");
					System.out.println("Peso: " + jugador.get(i).getPeso() + " kilos");
					System.out.println("Edad: " + jugador.get(i).CalculoEdadJugador() + " años");
					System.out.println("Posicion: " + jugador.get(i).getPosicion());
					System.out.println("***************************************");
					
				}
				
				
			 break;
			 
			case 3:
				
				System.out.print("ingrese nombre del jugador a modificar: ");
				String ModificarNombre = entrada.next();
				
				System.out.print("ingrese apellido del jugador a modificar: ");
				String ModificarApellido = entrada.next();
				
				for (int i = 0; i < jugador.size(); i++) {
					
					Jugador j = jugador.get(i);
					
					if (j.getNombre().equals(ModificarNombre) && j.getApellido().equals(ModificarApellido)) {
						
						System.out.print("ingresar nueva posicion del jugador (DELANTERO, MEDIO, DEFENSA, ARQUERO): ");
						String nuevaPosicionStr = entrada.next().toUpperCase();
						
						Posicion NuevaPosicion = Posicion.valueOf(nuevaPosicionStr);
						
						j.setPosicion(NuevaPosicion);
						
						System.out.print("Posicion del jugador modificada: ");
						
						
						
						
					}
					
				
				}
				
				break;
			
			case 4:
				
				System.out.print("ingresar nombre del jugador a eliminar: ");
				String EliminarNombre = entrada.next();
				
				System.out.print("ingresar apellido del jugador a eliminar: ");
				String EliminarApellido = entrada.next();
				
				for (int i = 0; i < jugador.size(); i++) {
					
					Jugador j = jugador.get(i);
					
					if (j.getNombre().equals(EliminarNombre) && j.getApellido().equals(EliminarApellido)) {
						
						jugador.remove(i);
						
						System.out.println("Jugador eliminado.");
						
						
						
					}
					
				}
				
				break;
				
			case 5:
				
				System.out.println("se salio del menu...");
				
				break;
				
				default:
					
					System.out.println("opcion invalida. ");
					
					break;
				
			}
			
			
			
		} while(opcion !=5);
		
		
		entrada.close();
		

	}

}
