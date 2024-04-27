package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	
	private String codigo;
	private String descripcion;
	private double precio_unitario;
	private Origen_Fabricacion origen_fabricacion ;
	private  Categoria categoria;
	
	public Producto(String codigo, String descripcion, 
		double precio_unitario, Origen_Fabricacion origen_fabricacion, Categoria categoria) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio_unitario = precio_unitario;
		this.origen_fabricacion = origen_fabricacion;
		this.categoria = categoria;
		}
	
	
	public enum Origen_Fabricacion{
		
		ARGENTINA, CHINA, BRASIL, URUGUAY
		
		
	}
	
	public enum Categoria{
		
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
		
		
		//getters y setters
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Origen_Fabricacion getOrigen_fabricacion() {
		return origen_fabricacion;
	}

	public void setOrigen_fabricacion(Origen_Fabricacion origen_fabricacion) {
		this.origen_fabricacion = origen_fabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
	
	

}
