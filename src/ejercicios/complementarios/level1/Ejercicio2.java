package ejercicios.complementarios.level1;

import java.util.Scanner;

//Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir
//el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

public class Ejercicio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ingreso = new Scanner (System.in);
		System.out.println( "Ingrese un numero entero: ");
		Integer num1 = ingreso.nextInt();
		System.out.println( "Ingrese otro numero entero: ");
		Integer num2 = ingreso.nextInt();
		Integer suma = num1 + num2;
		Integer producto = num1 * num2;
		Integer resta = num1 - num2;
		Integer cociente = num1 / num2;
		Integer modulo = num1 % num2;
		System.out.println(num1 + " + " + num2 + " = " + suma);
		System.out.println(num1 + " - " + num2 + " = " + resta);
		System.out.println(num1 + " * " + num2 + " = " + producto);
		System.out.println(num1 + " / " + num2 + " = " + cociente);
		System.out.println(num1 + " % " + num2 + " = " + modulo);
				
		

	}

}
