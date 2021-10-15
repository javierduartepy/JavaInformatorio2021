package ejercicios.complementarios.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		List<Integer> cargasHorarias = new ArrayList<Integer>();
		List<Integer> valoresPorHora = new ArrayList<Integer>();
		List<Integer> totalesDiario = new ArrayList<Integer>();
		cargasHorarias = cargaHorasTrabajadas();
		valoresPorHora = cargaValoresPorHora();
		totalesDiario = totalesDiarios(cargasHorarias, valoresPorHora);
		
		
		System.out.println("*******************************************************************");
		System.out.println("Total ganado en la semana: $ "+ sumaDeTotales(totalesDiario));
		System.out.println("*******************************************************************");
	}

	public static List<Integer> totalesDiarios(List<Integer> cargasHorarias, List<Integer> valoresPorHora) {
		List<Integer> totalesDiario = new ArrayList<Integer>();
		for (int i = 0; i < cargasHorarias.size(); i++) {
			int resultado = cargasHorarias.get(i) * valoresPorHora.get(i);
			totalesDiario.add(resultado);
			System.out.println("*******************************************************************");
			System.out.println("Total ganado por el dia: $ "+ resultado);
		}
		return totalesDiario;
	}

	public static int sumaDeTotales(List<Integer> totalesDiario) {
		int suma = 0;
		for (Integer ganadoPorDia : totalesDiario) {
			suma += ganadoPorDia;
		}
	return suma;
	}

	public static List<Integer> cargaHorasTrabajadas() {
		List<Integer> cargasHorarias = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner ingreso = new Scanner(System.in);
		int contador = 0;
        while (contador <= 4 ) {
        	System.out.print("Ingrese las horas trabajadas por cada dia: ");
            Integer horasDiarias = ingreso.nextInt();
        	cargasHorarias.add(horasDiarias);
        	contador++;
        }
	return cargasHorarias;
	}
	
	public static List<Integer> cargaValoresPorHora() {
		List<Integer> valoresPorHora = new ArrayList<Integer>();
		 @SuppressWarnings("resource")
		Scanner ingreso2 = new Scanner(System.in);
	        int contador2 = 0;
	        while (contador2 <= 4 ) {
	        	System.out.print("Ingrese ganancia por horas trabajadas a diario: $ ");
	            Integer valorHora = ingreso2.nextInt();
	        	valoresPorHora.add(valorHora);
	        	contador2++;
	        }
	return valoresPorHora;
	
	}
}