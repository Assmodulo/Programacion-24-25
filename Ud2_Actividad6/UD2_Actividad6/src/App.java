import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        // y luego muestre la matriz por pantalla.

            //Lo primero que voy a hacer es declarar una matriz de tamaño 5x5

            int[][] matriz = new int[5][5];

            //Voy a crear una variable contador que vaya aumentando para ir desde 1 hasta 25;

            int contador = 1;

            //Ahora debo de completar la matriz

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = contador;
                    contador++;
                    System.out.print("{" + matriz[i][j] + "}");
                }
                System.out.println();
            }
            

            //Hago el clasico cambio de ejercicio
            System.out.println();
            System.out.println("*****SALTO DE EJERCICIO*****");
            System.out.println();


            // Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
            // multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.

            //Declaro la matriz que me hace falta

            int tabMulti[][] = new int[10][10];
            
            //Creo el bucle necesario para completarla y mostrar el resultado por pantalla

            for(int i = 0; i < tabMulti.length; i++){
                for(int j = 0; j < tabMulti[i].length; j++){
                    tabMulti[i][j] = (i + 1) * (j + 1);
                    System.out.print("{" + tabMulti[i][j] + "}");
                }
                System.out.println();
            }

            //Hago el clasico cambio de ejercicio
            System.out.println();
            System.out.println("*****SALTO DE EJERCICIO*****");
            System.out.println();


            // Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
            // introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
            // matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
            // menores que cero y cuántos son igual a cero.

        //Declaro primero el objeto de la clase Scanner y defino la matriz

        Scanner teclado = new Scanner(System.in);

        int matrizNM[][];

        //Le explico al usuario lo que hace el programa

        System.out.println("Este programa creará una matriz de datos de tamaño NxM, datos que usted introducirá por teclado.\n"
        +"Luego se completará la matriz con datos que usted también introducirá por teclado, se mostrará por pantalla\n"
        +"y el programá le indicará cuantos valores son positivos, cuantos negativos y cuantos iguales a cero.");

        //Declaro tres variables que actuarán como contadores y las variable n y m

        int contPos = 0, contNeg = 0, contCero = 0, n, m;

        //Solicito el tamaño de la matriz por teclado

        System.out.println();
        System.out.println("Introduzca el valor de las filas de la matriz:");

        n = teclado.nextInt();

        System.out.println("Introduzca el valor de las columnas de la matriz:");

        m = teclado.nextInt();

        //Declaro el tamaño de la matriz

        matrizNM = new int[n][m];

        //Creo el for para completar la matriz

        for(int i = 0; i < matrizNM.length; i++){
            for(int j = 0; j < matrizNM[i].length; j++){
                //A partir de aqui vuelvo a usar la variable n para almacenar los datos introducidos por teclado
                System.out.println("Introduzca un valor para almacenar en la matriz");
                n = teclado.nextInt();

                //Evaluo con un if el valor de n y aumento el contador correspondiente según el resultado

                if( n > 0){
                    contPos++;
                }else if( n < 0){
                    contNeg++;
                }else{
                    contCero++;
                }
            }
        }

        System.out.println("Vamos a mostrar el resultado del ejercicio.\n"
        +"La cantidad de valores positivos es de: " + contPos + "\n"
        +"La cantidad de valores negativos es de: " + contNeg + "\n"
        +"La cantidad de valores iguales a cero es de: " + contCero);

        //Hago el clasico cambio de ejercicio
        System.out.println();
        System.out.println("*****SALTO DE EJERCICIO*****");
        System.out.println();

        // Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        // 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        // programa mostrará la nota mínima, máxima y media de cada alumno.


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
