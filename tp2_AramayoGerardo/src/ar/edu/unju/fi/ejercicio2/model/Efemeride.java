package ar.edu.unju.fi.ejercicio2.model;
import ar.edu.unju.fi.ejercicio2.constantes.Mes;

public class Efemeride {
	
	private String codigo;
	private int dia;
	private String detalle;
	private Mes mes;
	
	
    public Efemeride() {
    	
    	
    	
    }
		
	
	
	public Efemeride(String codigo, int dia, String detalle, Mes mes) {
		
		this.codigo=codigo;
		this.dia=dia;
		this.detalle=detalle;
		this.mes=mes;
		
		
		
		
	}


    public int ObtenerDiasDelMes() {
    	
    	if(mes == Mes.ENERO || mes == Mes.MARZO || mes ==  Mes.MAYO || mes == Mes.JULIO || mes == Mes.AGOSTO || mes == Mes.OCTUBRE || mes == Mes.DICIEMBRE) {
    		
           return 31;
    		
    	}else if(mes == Mes.ABRIL || mes == Mes.JUNIO || mes == Mes.SEPTIEMBRE || mes == Mes.NOVIEMBRE) {
    		
    		return 30;
    		
    	}else if (mes == Mes.FEBRERO) {
    		
    	   return 28;
    	   
    	}else {
    		return 0;
    		
    	}
    	
    	
    	
    	
    }



	public String getCodigo() {
		return codigo;
	}






	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}






	public int getDia() {
		return dia;
	}






	public void setDia(int dia) {
		this.dia = dia;
	}






	public String getDetalle() {
		return detalle;
	}






	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}






	public Mes getMes() {
		return mes;
	}






	public void setMes(Mes mes) {
		this.mes = mes;
	}
	
	
	
	

}
