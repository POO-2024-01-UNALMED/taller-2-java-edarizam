package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	//Corregido
	public void cambiarColor(String color) {
		
		boolean validarColor = (color.equalsIgnoreCase("rojo") ||color.equalsIgnoreCase("amarillo") || color.equalsIgnoreCase("verde") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco"))? true : false;
		if (validarColor){
			System.out.println("El color ha sido cambiado a: " + color);
		}else{
			System.out.println("El color no puede ser cambiado a: " + color);
			color = null;
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

