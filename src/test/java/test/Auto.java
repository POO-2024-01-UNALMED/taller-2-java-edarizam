package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados;
	
	//Corregido
	public int cantidadAsientos() {
		int contadorAsientos = 0;
		for(Asiento asiento:asientos) {
			if (asiento instanceof Asiento) {
				contadorAsientos++;
			}
		}
		return contadorAsientos;
	}
	
	//Malo
	public String verificarIntegridad() {
		
		String mensajeValidacion = null;
		
		for(Asiento asiento:asientos) {
			if (asiento instanceof Asiento) {
				mensajeValidacion = (asiento.registro == this.registro && this.registro == motor.registro)? "Auto original" : "Las piezas no son originales";
				if (mensajeValidacion == "Las piezas no son originales") {
					break;
				}
			}
		}
		
		return mensajeValidacion;
	}	
}
