package ar.edu.unju.fi.ejercicio4.main;
import ar.edu.unju.fi.ejercicio4.model.Jugador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;


public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Jugador> persona = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		int numJugador;
		
		do {
			
			System.out.println("Alta de jugador: ");
			System.out.println("Mostrar todos los jugadores: ");
			System.out.println("Modificar Posicion del jugador: ");
			System.out.println("Eliminar un jugador: ");
			System.out.println("Salir: ");
			
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("ingrese nombre del jugador: ");
				String nombre = entrada.nextLine();
				
				System.out.println("ingrese la fecha de nacimiento: ");
				String fecha_de_nacimiento = entrada.nextLine();
				
				SimpleDateFormat fechaformato = new SimpleDateFormat ("dd-MM-yyyy");
				
				Date fechaNacimientoDate = null;
				
				try {
					
					fechaNacimientoDate = fechaformato.parse(fecha_de_nacimiento);
					
					
				} catch (Exception e) {
					
					System.out.println("formato de fecha incorrecto.");
					System.exit(0);
				}
			
			
			
			
			
			}
			
			
		} while(opcion !=5);
		
		
		entrada.close();
		

	}

}
