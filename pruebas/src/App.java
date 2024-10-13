import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String cadena;  //Defino una variable de tipo String que almacenará la cadena que voy a introducir
        
        

        String cadena2; //Defino una segunda variable de tipo String para almacenar la cadena modificada

        //Utilizo las dos variables, cadena y cadena 2, usadas en el ejercicio anterior y creo otra variable cadena tres

        String cadena3;

        //Indico al usuario lo que hace el programa

        System.out.println("El programa le va a solicitar 3 cadenas distintas:\n"
        +"La primera será un nombre\n"
        +"La segunda será el primer apellido\n"
        +"Y por último la tercera será el segundo apellido");

        System.out.println();

        System.out.println("Despues de todo esto el programa formará una cadena con las tres primeras letras de cada cadena anterior en mayúsculas");

        //Solicito las cadenas

        System.out.println();

        System.out.println("Introduzca la primera cadena");

        cadena = teclado.nextLine();

        System.out.println();

        System.out.println("Introduzca la segunda cadena");

        cadena2 = teclado.nextLine();

        System.out.println();

        System.out.println("Introduzca la tercera cadena");

        cadena3 = teclado.nextLine();

        //A partir de ahora debemos de usar el método substring en cada cadena para obtener los tres primeros caracteres, los pasaremos a mayúscuals y los
        //concatenaremos

        //Defino una variable que almacene el resultado

        String concatenacion = cadena.substring(0, 3) + cadena2.substring(0, 3) + cadena3.substring(0, 3);

        //Convierto a mayúsculas la cadena resultado

        concatenacion = concatenacion.toUpperCase();

        //Muestro el resultado

        System.out.println(concatenacion);

        




    }
}
