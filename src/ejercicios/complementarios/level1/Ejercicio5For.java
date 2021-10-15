package ejercicios.complementarios.level1;

import java.util.Scanner;

//Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas 
//(sin uso de librerías)

//CON FOR

public class Ejercicio5For {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		System.out.println( "Ingrese un numero entero: ");
		Integer num1 = ingreso.nextInt();
		System.out.println( "Ingrese la cantidad de veces que sumara: ");
		Integer num2 = ingreso.nextInt();

		int suma = 0;
		for (int i = 1; i <= num2; i++) {
			suma += num1;
			
		}
		System.out.println("El resultado de sumar " + num2 + " veces " + num1 + " es: " + suma);
		
		ingreso.close();
	}

}