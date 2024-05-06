package ar.edu.unju.fi.ejercicio3.constantes;

	public enum Provincia{
		
		JUJUY (811611, 53219),
		SALTA (1441351, 155488),
		TUCUMAN (1731820, 22524),
		CATAMARCA (429562, 102602),
		LA_RIOJA (383865, 89680),
		SANTIAGO_DEL_ESTERO (1060906, 136351);
		
	    
	   private int cantidad_poblacion;
	   private float superficie;
		
		
		 Provincia(int cantidad_poblacion, float superficie) {
			
			this.cantidad_poblacion = cantidad_poblacion;
			this.superficie = superficie;

        }


		public int getCantidad_poblacion() {
			return cantidad_poblacion;
		}


		public void setCantidad_poblacion(int cantidad_poblacion) {
			this.cantidad_poblacion = cantidad_poblacion;
		}


		public double getSuperficie() {
			return superficie;
		}


		public void setSuperficie(float superficie) {
			this.superficie = superficie;
		}
		 
		 
		//metodo para calcular densidad poblacional
		
		 public float CaluloDensidadPoblacion(){
			 
			 float DensidadPoblacion = cantidad_poblacion / superficie;
			 
			 return DensidadPoblacion;
					 
		 }
		 
		 
		 

	}