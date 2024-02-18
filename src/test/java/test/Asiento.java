package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	//Corregido
	public void cambiarColor(String color) {
		
		boolean validarColor = (color.equalsIgnoreCase("rojo") ||color.equalsIgnoreCase("amarillo") || color.equalsIgnoreCase("verde") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco"))? true : false;
		if (validarColor){
			this.color = color;
		}

		/*
		switch(color) {
		case "rojo":
			break;
		case "verde":
			break;
		case "amarillo":
			break;
		case "negro":
			break;
		case "blanco":
			break;
		default:
			color = null;
		*/
		}
	}

