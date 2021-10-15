package ejercicios.complementarios.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos 
(3 arrayList) e imprimir dichos cursos.*/

public class Ejercicio4 {

	public static void main(String[] args) {
		List<String> alumnos = new ArrayList<String>();
		alumnos.add("Ruben" + " " + "Diaz");
		alumnos.add("Julio" + " " + "Duarte");
		alumnos.add("Maria" + " " + "Dumont");
		alumnos.add("Luz" + " " + "Lugo");
		alumnos.add("Javier" + " " + "Pellegrini");
		alumnos.add("Ruben" + " " + "Cambiazo");
		alumnos.add("Lautaro" + " " + "Kohan");
		alumnos.add("Julian" + " " + "Vendone");
		alumnos.add("Julieta" + " " + "Schull");
		alumnos.add("Milagros" + " " + "Bengolea");
		alumnos.add("Pilar" + " " + "Duarte");
		alumnos.add("Martin" + " " + "Irigoyen");
		Collections.shuffle(alumnos);	
		System.out.println(alumnos);
		
		List<String> curso1 = new ArrayList<String>();
		curso1 = alumnos.subList(0,4);
		System.out.println("Alumnos del 1er Curso: " + curso1);
		
		List<String> curso2 = new ArrayList<String>();
		curso2 = alumnos.subList(4,8);
		System.out.println("Alumnos del 2do Curso: " + curso2);
		
		List<String> curso3 = new ArrayList<String>();
		curso3 = alumnos.subList(8,12);
		System.out.println("Alumnos del 3er Curso: " + curso3);
	}
	
}


