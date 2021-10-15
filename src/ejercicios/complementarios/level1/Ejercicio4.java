package ejercicios.complementarios.level1;

import java.util.Scanner;

//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.

public class Ejercicio4 {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner ingreso = new Scanner(System.in);
	        System.out.print("Introduzca un numero entero: ");
	        Integer numero = ingreso.nextInt();
	        System.out.printf("El factorial de " + numero + " es" + " " + factorial(numero));
	        
	}
	public static Integer factorial(int n) {
		Integer num = 1;
		for (int i = 1; i<=n; i++) { 
			num = num*i;
	}
		return num;
	}
		
}
