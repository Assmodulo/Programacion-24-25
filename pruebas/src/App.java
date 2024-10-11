import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Se le van a pedir dos números enteros por teclado");
        int n, m;
        int[] enteros;

        
        System.out.println("Introduzca el primer número");
        n =  teclado.nextInt();

        System.out.println("Introduzca el segundo número");
        m = teclado.nextInt();

        //Ahora el programa va a calcular la diferencia entre P y Q para crear el array evaluando cual es
        //el número mayor para calcular la diferencia.

        if(n > m){
            enteros = new int[n - m]; //Dependiendo de cual sea el mayor, se evalua y se define de nuevo el array
            //Despues de evaluar los números hay que insertar el for para completar el array de acuerdo a las 
            //opciones. Dentro de cada for para completar el array, puedo ir mostrando el resultado
            for (int i = m; i < enteros.length; i++) {
                enteros[i] = i;
                System.out.print("{" + enteros[i] + "}");
            }
        }else if(m > n){
            enteros = new int[m - n];
            for (int i = n; i < enteros.length; i++) {
                enteros[i] = i;
                System.out.print("{" + enteros[i] + "}");
            }
        }else {
            System.err.println("El valor de los números es igual, o por alguna otra razón\n"
            +"no se puede evaluar el valor ni crear el array");
        }

        for(int i = 0; i < enteros.length; i++){
            
        }

        System.out.println();
    }
}
