import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        

        int n;
        //Reinicio Scanner
        Scanner teclado = new Scanner(System.in);

// 14. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
// valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
// muestre por pantalla.
        //En este programa lo primero que necesito es calcular cual es la dimensión del array sin hacerlo de cabeza
        //Para eso voy a usar un contador y un bucle para calcular cual será el tamaño
        int contadorTamanio = 0;

        for (int i = 1; i <= 10; i++) {
            //Ahora debo de hacer un for anidado que me calculase como si fuese a hacer la operación requerida
            for (int x = 1; x <= i; x++) {
                contadorTamanio++;
            }
        }

        //Una vez tengo el tamaño del array debo declararlo
        int[] secuencia2 = new int[contadorTamanio];

        //Ahora debo de completarlo de la forma que indica el ejercicio
        //Para ello creo que voy a necesitar tambien una variable que tenga como valor el número que tenemos que manejar
        int valorSec = 1;   //Lo inicializo a 1 porque es el primer valor que va a tener

        for (int i = 0; i < secuencia2.length; i++) {
            //Debo crear otro for para que imprima el númeroN N veces
            for (int j = 1; j <= valorSec; j++) {
                secuencia2[i] = valorSec;
                if(j<valorSec){
                    i++;
                }
            }
            //Fuera del primer for debo asegurarme de incrementar el valor que se tiene que usar
            valorSec++;
        }

        //Podría hacerlo dentro de los for anteriores pero por no liarme lo voy a hacer con un foreach fuera
        for (int valSec : secuencia2) {
            System.out.print("{" + valSec + "}");
        }
    }
}
