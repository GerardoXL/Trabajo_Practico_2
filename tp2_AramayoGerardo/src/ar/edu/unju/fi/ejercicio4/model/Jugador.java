package ar.edu.unju.fi.ejercicio4.model;
import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private int fecha_de_nacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	
	public Jugador(String nombre, String apellido, int fecha_de_nacimiento,
			String nacionalidad, double estatura, double peso) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		
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


	public int getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}


	public void setFecha_de_nacimiento(int fecha_de_nacimiento) {
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
	
	
	
	
	
	
}
