package ejercicios.complementarios.level1;

import java.util.Scanner;

//Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje �HOLA {USUARIO}!!!�

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println( "Introduce nombre de usuario: ");
		String usuario = scan.nextLine();

		System.out.println("HOLA " + usuario + "!!!");
		scan.close();
	}

}
