package ejercicios.complementarios.level1;

import java.util.Scanner;

/*Realizar un programa que dado un String de entrada en min�sculas lo convierta por completo a may�sculas. 
Sin uso de m�todos o librer�as que realicen toUppercase().*/

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		System.out.println( "Ingrese una palabra: ");
		String palabra = ingreso.nextLine();
		String palabraUpper = "";
		for (int i=0; i<palabra.length(); i++) {
			char letra = myUpper(palabra.charAt(i));
			palabraUpper += letra;
			
		}
		System.out.println(palabraUpper);
		ingreso.close();
	}
	public static char myUpper(char palabra){
		    if (palabra >= 'a' || palabra <= 'z'){
		        palabra = (char) (palabra - ('a' - 'A'));
		    }
		        return palabra;
		}

	}


