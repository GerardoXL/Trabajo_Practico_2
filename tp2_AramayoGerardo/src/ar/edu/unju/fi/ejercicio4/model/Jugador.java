package ar.edu.unju.fi.ejercicio4.model;
import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private Calendar fecha_de_nacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	
	public Jugador(String nombre, String apellido, Calendar fecha_de_nacimiento,
			String nacionalidad, double estatura, double peso) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Calendar getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}


	public void setFecha_de_nacimiento(Calendar fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//metodo para calcular la edad el jugador
	
	public int CalculoEdadJugador() {
		
		Calendar fechaActual = Calendar.getInstance();
		
		int edad = fechaActual.get(Calendar.YEAR) - fecha_de_nacimiento.get(Calendar.YEAR);
		
		if(fechaActual.get(Calendar.DAY_OF_MONTH) > fecha_de_nacimiento.get(Calendar.DAY_OF_MONTH)
				|| fecha_de_nacimiento.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)
				&& fecha_de_nacimiento.get(Calendar.DATE) > fechaActual.get(Calendar.DATE)) {
			
			edad--;
	
		}
		
		return edad;
	}
	
	@Override
	public String toString() {
		
          SimpleDateFormat fechaformato = new SimpleDateFormat("dd-MM-yyyy");
          return 
        		  fechaformato.format(fecha_de_nacimiento.getTime());
		
	}
	
	
	
}
