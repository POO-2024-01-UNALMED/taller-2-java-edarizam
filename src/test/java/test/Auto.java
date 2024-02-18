package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	
	public String verificarIntegridad() {
		
		String mensajeValidacion = null;
		
		for(Asiento asiento:asientos) {
			mensajeValidacion = (asiento.registro == this.registro && this.registro == motor.registro)? "Auto original" : "Las piezas no son originales";
			if (mensajeValidacion == "Las piezas no son originales") {
				break;
			}
		}
		
		return mensajeValidacion;
	}	
}
