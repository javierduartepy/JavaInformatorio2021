package ejercicios.complementarios.level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {

	public static void main(String[] args) {
		List<String> test1 = fizzBuzzFuncion(1, 6);
		System.out.println(test1);
		List<String> test2 = fizzBuzzFuncion(1, 8);
		System.out.println(test2);
	}

	public static List<String> fizzBuzzFuncion(int inicio, int fin) {
		List<String> fizzBuzz = new ArrayList<String>();
		for (int i = inicio; i < fin; i++) {
			if(i != fin) {
				if(i == inicio) {
					fizzBuzz.add(String.valueOf(i));				
				} else {
					if( i % 2 == 0 && i % 3 == 0) {
						fizzBuzz.add("FizzBuzz");
					} else if( i % 2 == 0) {
						fizzBuzz.add("Fizz");
					} else if( i % 3 == 0) {
						fizzBuzz.add("Buzz");
					} else {
						fizzBuzz.add(String.valueOf(i));
					}
				}
			}

		}

		return fizzBuzz;
	}

}
