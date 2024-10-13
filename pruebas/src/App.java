import java.util.Scanner;


public class App {
    
    public static void main(String[] args) throws Exception {
        
        // Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        // 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        // programa mostrará la nota mínima, máxima y media de cada alumno.

        Scanner teclado = new Scanner(System.in);

        //Creamos la matriz, por sencillez del tipo int

        int notas[][] = new int[4][5];

        //Una variable para almacenar la suma de las notas de cada alumno

        int suma = 0;

        //Dos variables para almacenar la nota máxima y la mínima de cada alumno

        int maxima= 0; //Empieza a cero para poder evaluar las notas desde la primera
        int minima = 10; //Empieza a diez para poder evaluar las notas desde la primera

        //Declaro una variable para almacenar la nota introducida por teclado

        int nota;

        //Le indico al usuario que va a hacer el programa

        System.out.println("Este programa va a almacenar 5 notas de 4 alumnos diferentes.\n"
        +"Luego mostrará la nota más alta, la nota más baja y la nota media de cada alumno");

        //Creo el for para completar el array

        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Introduzca la primera nota del Alumno" + (i + 1));
                nota = teclado.nextInt();

                //Vamos evaluando el valor de nota y añadiendolo al sumatorio
                suma += nota;

                if(nota > maxima){
                    maxima = nota;
                } 
                if(nota < minima){
                    minima = nota;
                }
            }
            
            //Después de salir del bucle que completa las notas de un alumno tengo que hacer un par de acciones para que funcione todo bien
            //Muestro los resultados
            System.out.println("Estos son los datos del Alumno" + (i + 1) + ":\n"
            +"La nota máxima es igual a: " + maxima + "\n"
            +"La nota minima es igual a: " + minima + "\n"
            +"La nota media del alumno es: " +(double) (suma/notas[i].length));

            //Debo reiniciar el valor de las 3 variables auxiliares para que el programa haga lo que tiene que hacer en la siguiente iteracion
            suma = 0;
            minima = 10;
            maxima = 0;

            //sout para dejar un espacio para el siguiente alumno
            System.out.println();
        }

        //Hago el clasico cambio de ejercicio
        System.out.println();
        System.out.println("*****SALTO DE EJERCICIO*****");
        System.out.println();

    }
}
