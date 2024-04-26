package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	
	private String codigo;
	private String descripcion;
	private double precio_unitario;
	private String origen_fabricacion;
	private String categoria;
	
	
	public enum Origen_Fabricacion{
		
		ARGENTINA, CHINA, BRASIL, URUGUAY
		
		
	}
	
	public enum Categoria{
		
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
		
	}
	
	
	

}
