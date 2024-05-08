package ar.edu.unju.fi.ejercicio5.model;
import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class PagoTarjeta implements Pago {
	
	private String numero_de_tarjeta;
	private LocalDate fecha_de_pago;
	private double monto_pagado;
	
	
	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		
		monto_pagado = monto + (monto * 15 /100);
		
		
		
	}
	
	
	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Numero de tarjeta: " + numero_de_tarjeta);
		
		System.out.println("Fecha de pago: " + fecha_de_pago);
		
		System.out.println("Monto pagado: " + df.format(monto_pagado));
		
		
		
	}
	
	
	

}
