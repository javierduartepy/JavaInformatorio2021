package ejercicios.complementarios.level1;

import java.util.Scanner;

//Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.

public class Ejercicio9 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner ingreso = new Scanner(System.in);
        String texto;
        String caracter;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = ingreso.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = ingreso.nextLine();
        numeroDeVeces = contarCaracteres(texto.toLowerCase(), caracter.toLowerCase());
        System.out.println("-----------------------------------|" );
        System.out.println("El caracter " + "'" + caracter + "'" + " aparece " + numeroDeVeces + " veces");
        System.out.println("-----------------------------------|" );
    }

    
    public static int contarCaracteres(String cadena, String caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++;          
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
}
