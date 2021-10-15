package ejercicios.complementarios.level2;

/*Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), 
desordenar (mezclar) el arrayList y volver a imprimir.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ejercicios.modelo.Naipe;

public class Ejercicio3 {

	public static void main(String[] args) {

		List<Naipe> maso = new ArrayList<Naipe>();
        
		maso = cargaMaso();
		
		imprimirMaso(maso, "Maso Cargado");
		
		Collections.sort(maso, Comparator.comparing(Naipe::getFigura).thenComparing(Naipe::getNumero)); 
		imprimirMaso(maso, "Orden Ascendente"); 
		
		Collections.sort(maso, Collections.reverseOrder(Comparator.comparing(Naipe::getFigura).thenComparing(Naipe::getNumero)));
		imprimirMaso(maso, "Orden Descendete"); 
		
		Collections.shuffle(maso);
		imprimirMaso(maso, "Maso desordenado"); 
	}

	/**
	 * Metodo que imprime el maso de cartas
	 * @param maso
	 */
	private static void imprimirMaso(List<Naipe> maso, String descripcion) {
		System.out.println("****************************************************");
		System.out.println("******************"+descripcion +"******************");
		System.out.println("****************************************************");
		for (Naipe naipe : maso) {
			System.out.println(naipe.getFigura() +" "+ naipe.getNumero());
		}
		System.out.println("****************************************************");
	}

	/**
	 * Metodo que carga el maso con todas las figuras y sus numeros
	 * @return El maso cargado
	 */
	public static List<Naipe> cargaMaso() {
		List<Naipe> masoCargado = new ArrayList<Naipe>();

		for (int i = 1; i <= 10; i++) {
			// Cargamos Diamantes
			Naipe diamante = new Naipe("Diamante", i);
			masoCargado.add(diamante);

			// Cargamos Trebol
			Naipe trebol = new Naipe("Trebol", i);
			masoCargado.add(trebol);

			// Cargamos Pica
			Naipe pica = new Naipe("Pica", i);
			masoCargado.add(pica);

			// Cargamos Corazon
			Naipe corazon = new Naipe("Corazon", i);
			masoCargado.add(corazon);
		}

		return masoCargado;
	}
}
