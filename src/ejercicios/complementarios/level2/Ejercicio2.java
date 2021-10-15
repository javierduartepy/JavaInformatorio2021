package ejercicios.complementarios.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crear un ArrayList, agregar 5 n�meros enteros. Luego, agregar un n�mero entero al principio de 
//la lista y otro al final. Por �ltimo, iterar e imprimir los elementos de la 
//lista y el tama�o de la misma (antes y despu�s de agregar a en la primera y �ltima posici�n).

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		Scanner ingreso = new Scanner(System.in);
		
		imprimirLista(numeros);
		
        int contador = 1;
        while (contador <= 5 ) {
        	System.out.print("Ingrese un numero: ");
            Integer numero = ingreso.nextInt();
        	numeros.add(numero);
        	contador++;
        }
        
        imprimirLista(numeros);
        
        System.out.print("Ingrese un numero para el principio de la lista: ");
        Integer numero = ingreso.nextInt();
    	numeros.add(0, numero);
    	imprimirLista(numeros);
    	
    	System.out.print("Ingrese un numero para el final de la lista: ");
        numero = ingreso.nextInt();
    	numeros.add(numero);
    	imprimirLista(numeros);
        
        ingreso.close();
	}
	
	public static void imprimirLista(List<Integer> lista) {
		System.out.println("Total de Elementos: "+ lista.size());
		for (Integer item : lista) {
			System.out.println(item);
		}
		
	}

}
