package ar.edu.unju.fi.ejercicio5.model;
import ar.edu.unju.fi.ejercicio5.interfaces.Pago;
import java.time.LocalDate;

public class PagoEfectivo implements Pago{
	
	
	private double monto_pagado;
	private LocalDate fecha_de_pago;
	
	
	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		
		monto_pagado = monto - (monto * 10 / 100);
		
		
		
	}
	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub
		
		System.out.println("Fecha de pago: " + fecha_de_pago );
		System.out.println("Monto pagado: " + monto_pagado);
		
		
		
	} 

}
