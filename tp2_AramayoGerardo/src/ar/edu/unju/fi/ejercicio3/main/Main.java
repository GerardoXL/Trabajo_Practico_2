package ar.edu.unju.fi.ejercicio3.main;
import ar.edu.unju.fi.ejercicio3.constantes.Provincia;


public class Main {

	public static void main(String[] args) {
		
        Provincia[] provincias = Provincia.values();
        
        for (int i = 0; i < provincias.length; i++) {
    		
			System.out.println("Provincia: " + provincias[i]);
			System.out.println("Poblacion: " + provincias[i].getCantidad_poblacion());
			System.out.println("Superficie: " + provincias[i].getSuperficie() + " km");
			System.out.println("Densidad de poblacion: " + provincias[i].CaluloDensidadPoblacion() + " hab/km2");
			System.out.println("*******************************");
		}

	}

}
