package ejercicios.complementarios.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking

public class Ejercicio1 {

	public static void main(String[] args) {
		
		List<String> ciudades = new ArrayList<String>();
		Scanner ingreso = new Scanner(System.in);
        System.out.print("Introduzca su/s ciudad/es. Presione dos veces ENTER para salir: ");
        String ciudad = null;
        while (!(ciudad = ingreso.nextLine()).isEmpty()) {
        	ciudades.add(ciudad);
        }
                
        int ranking = 0;
        for (String laCiudad : ciudades) {
        	ranking ++;
        	System.out.println("#" + ranking + " - " + laCiudad);
        }
		
		ingreso.close();
	}
		
}
