package ejercicios.complementarios.level1;

import java.util.Scanner;

/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

public class Ejercicio8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ingreso = new Scanner (System.in);
		
		System.out.println( "Ingrese Nombre: ");
		String nombre = ingreso.nextLine();

		System.out.println( "Ingrese Apellido: ");
		String apellido = ingreso.nextLine();

		System.out.println( "Ingrese Edad: ");
		String edad = ingreso.nextLine();
		while (!(isNumeric(edad))) {
			System.out.println( "Ingrese Edad válida: ");
			edad = ingreso.nextLine();
		}
		System.out.println( "Ingrese Direccion: ");
		String direccion = ingreso.nextLine();
				
		System.out.println( "Ingrese Ciudad: ");
		String ciudad = ingreso.nextLine();
		
		System.out.println("-------------------------------------------------------|" );
		System.out.println( ciudad + " - " + direccion + " - " + edad +  " - " + nombre + " " + apellido );
		System.out.println("-------------------------------------------------------|" );
	}

	private static boolean isNumeric(String edad) {
		if (edad == null) {
		return false;
		}
		try {
			@SuppressWarnings("unused")
			Integer numero = Integer.parseInt(edad);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
