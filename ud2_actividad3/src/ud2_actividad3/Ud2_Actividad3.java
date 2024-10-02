package ud2_actividad3;

import java.util.Scanner;

public class Ud2_Actividad3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);//Instancio un nuevo objeto de la clase Scanner
		
		
//		Realiza un programa que dada una cantidad de euros que el usuario introduce por
//		teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
//		alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
//		indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
//		programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
//		5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
//		número de billetes posible).
//		
		double dinero; //Declaro una variable double para almacenar el dinero que introduciremos por teclado
//		
		System.out.println("Introduzca por teclado una cantidad de dinero y el programa calculará\n"
				+ "el número menor de billetes necesarios para sumar dicha cantidad");
		
		dinero = teclado.nextDouble();
//		Realiza un programa que muestre un menú de opciones como el siguiente:
//		1. Sumar
//		2. Restar
//		3. Multiplicar
//		4. Dividir (incluir manejo de división por 0)
//		5. Salir
//		El menú debe de repetirse hasta que se escoja la opción 5 (Salir).

	}

}
