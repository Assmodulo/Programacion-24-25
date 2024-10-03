import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in); // Declaro objeto de la clase Scanner
        int numero = 0; //Declaro una variable número que veo que lo voy a necesitar en los primero ejercicios
        int resultado = 0; //Otra variable int que va a ir almacenando resultados

// 1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
// y luego muestre todos sus valores.

        System.out.println("El programa le va a solicitar que introduzca por teclado diez número naturales");
        System.out.println("Este programa va a almacenar esos números en un array y luego los mostrará por pantalla");
        
        int [] numeros = new int[10]; //Defino el array

        //Lo voy a completar con un for

        for ( int i = 0 ; i < numeros.length; i++){
            System.out.println("Introduzca un número entero por teclado");
            numeros[i] = teclado.nextInt();
        }

        //Vuelvo a escribir un for pero esta vez para mostrar el contenido del array

        for( int i = 0 ; i < numeros.length; i++){
            System.out.print("{" + numeros[i] + "}");
        }

        System.out.println("");


// 2. Crea un programa que pida diez números reales por teclado, los almacene en un array,
// y luego muestre la suma de todos los valores.

        //Voy a usar variables del ejercicio anterior

        //Creo que en un solo for voy a almacenar los valores y los voy a ir sumando

        for( int i = 0; i < numeros.length; i++){
            System.out.println("Introduzca un número por teclado");
            numeros[i] = teclado.nextInt();
            resultado += numeros[i];
        }

        System.out.println("La suma de todos los números introducidos es " + resultado);
// 3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
// y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
// 4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
// array y luego muestre por separado la suma de todos los valores positivos y negativos.
// 5. Crea un programa que pida veinte números reales por teclado, los almacene en un array
// y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
// 6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
// N, escriba M en todas sus posiciones y lo muestre por pantalla.
// 7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
// todos los valores desde P hasta Q, y lo muestre por pantalla.
// 8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
// utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
// cuántos valores del array son igual o superiores a R.
// 9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
// enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
// y mostrará en qué posiciones del array aparece N.
// 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de
// personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por
// 2
// MP_0485 - PROGRAMACIÓN
// teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas
// miden por encima y por debajo de la media.
// 11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
// el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
// del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
// 12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
// con distintas opciones:
// a. Mostrar valores.
// b. Introducir valor.
// c. Salir.
// La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
// posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
// que el usuario elija la opción ‘c’ que terminará el programa.
// 13. Crea un programa que permita al usuario almacenar una secuencia aritmética en un
// array y luego mostrarla. Una secuencia aritmética es una serie de números que
// comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
// e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
// programa solicitará al usuario V, I además de N (nº de valores a crear).
// 14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
// valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
// muestre por pantalla.
    }
}
