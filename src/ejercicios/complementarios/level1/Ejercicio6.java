package ejercicios.complementarios.level1;

import java.util.Scanner;

//Se desea una aplicaci�n que solicite 2 n�meros enteros y realice la operaci�n de potencia 
//(sin uso de librer�as).

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		System.out.println( "Ingrese un numero entero: ");
		Integer num1 = ingreso.nextInt();
		System.out.println( "Ingrese un numero para potencia: ");
		Integer num2 = ingreso.nextInt();
		ingreso.close();		
		int potencia = 1; //si empieza con 0 todo dara cero;
		for (int i = 1; i <= num2; i++) {
			potencia *= num1;
	}
		System.out.println(num1 + " elevado a la " + num2 + " = " + potencia);
}
}