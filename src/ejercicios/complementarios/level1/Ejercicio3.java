package ejercicios.complementarios.level1;

import java.util.Scanner;

//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1)

public class Ejercicio3 {

	public static void main(String[] args) {
		 Scanner numero = new Scanner(System.in);
	        System.out.print("Introduzca un numero entero de cinco cifras: ");
	        Integer num = numero.nextInt();    
	        String acumulador = "";
	        for (int i = 1; i <= num; i++) {
	        	acumulador = acumulador + String.valueOf(i); 
				System.out.println(acumulador);
			}
	        numero.close();

	}

}

