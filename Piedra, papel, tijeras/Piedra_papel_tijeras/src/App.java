import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        //Lo primero que tengo que hacer es crear un objeto de la clase Scanner porque lo voy a necesitar

        Scanner teclado = new Scanner(System.in);

        

        //Como voy a tener que crear un menú, o quizás varios, creo una variable String para almacenar la opción seleccionada

        String opcion;

        //Creo 3 variables string para las jugadas de cada jugador y el resultado

        String jugadaPlayer = "", jugadaCpu = "", enfrentamiento = "";


        System.out.println("BIENVENIDO A PIEDRA-PAPEL-TIJERAS");

        //Creo el primer menú, que será sencillo, para jugar una sola mano, según vaya añadiendo cosas quizá se vaya haciendo más grande

        do { 
            
            //Como lo que queremos es que funcione sin parar mostramos la primera información al usuario aquí por ahora
            
            System.out.println("SELECCIONE LA OPCIÓN DESEADA PULSANDO EL NÚMERO DE LA IZQUIERDA");
            System.out.println();

            System.out.println(
                "1. - JUGAR UNA MANO" + "\n" +
                "2. - INSTRUCCIONES DEL JUEGO" + "\n" +
                "3. - CONFIGURACIÓN DE LA PARTIDA\n" +
                "4. - SALIR"
            );

            opcion = teclado.nextLine();

            //Evaluo las opciones con un switch

            switch (opcion) {
                case "1":
                    
                    //Al elegir jugar el jugador debe de elegir una de las opciones, esto es otro menú, con do while
                    do{
                        System.out.println("AHORA ELIJA SU JUGADA. MARQUE SU OPCIÓN, TANTO EN MAYÚSCULAS COMO MINÚSCULAS.\n" + 
                        "V. - VAMOS ALLÁ " + "\n" +
                        "S. - VOLVER ATRÁS");

                        System.out.println();

                        opcion = teclado.nextLine().toUpperCase(); //Me aseguro de hacer que la opción siempre entre en mayúsculas para comparar mejor

                        //Evaluo de nuevo con un switch
                        //Después de las pruebas vi que lo mejor era empezar a crear métodos para organizar mejor las cosas

                        switch (opcion) {
                            case "V":
                                System.out.println(resultado(versus(eleccionJugador(),eleccionCpu())));
                                System.out.println();
                                break;
                            case "S":
                                System.out.println("SOLO LOS COBARDES SE RETIRAN, VUELVE CUANDO ESTÉS LISTO");
                                break;    
                            default:
                                System.out.println("ESTÁS NERVIOSO? HAS ELEGIDO UNA OPCIÓN INCORRECTA. VAMOS, PRUEBA OTRA VEZ");
                                System.out.println();
                        }
                      
                    }while(!"S".equals(opcion));
                    break;

                case "2":
                    tutorial();
                    break;

                case "3":
                    configuracion();
                    break;    

                case "4":
                    System.out.println("HASTA LA PRÓXIMA PARTIDA. VUELVE CON GANAS");
                    break;
                default:
                    //Por default, el usuario ha introducido una opción no recogida y debe de introducirla de nuevo otra vez
                    System.out.println("HA ELEGIDO UNA OPCIÓN INCORRECTA, PRUEBE OTRA VEZ");
                    System.out.println();
                    break;
            }

        } while (!"4".equals(opcion));

    }

    //Creo un método, llamado tutorial que simplemente nos va a mostrar como funciona el juego

    public static void tutorial(){
        //voy mostrando por pantalla como funciona

        System.out.println("POR SI NO CONOCIAS EL JUEGO TE VOY A EXPLICAR COMO SE JUEGA");
        System.out.println("EN PIEDRA-PAPEL-TIJERAS CADA JUGADOR ELIGE EN SECRETO UNA DE LAS TRES OPCIONES");
        System.out.println("CUANDO CADA UNO DE LOS JUGADORES HA TERMINADO SU ELECCIÓN SE MUESTRAN LAS DOS\n"
        +"DE FORMA SIMULTANEA");
        System.out.println("LUEGO HAY QUE VER QUIEN HA GANADO SEGÚN SU ELECCIÓN\n"
        +"PIEDRA SIEMPRE GANA A TIJERA, POR QUE LAS ROMPE\n"+
        "PAPEL SIEMPRE GANA A PIEDRAS, PORQUE LA ENVUELVE\n"+
        "TIJERAS SIEMPRE GANA A PAPEL, PORQUE LO CORTA");
        System.out.println();
        System.out.println("ASÍ DE SIMPLE ES EL JUEGO. LO MEJOR ES QUE JUEGUES UNA MANO EN CUANTO PUEDAS");
        System.out.println("YA VEREMOS SI ERES CAPAZ DE DERROTARME");
        System.out.println();
        System.out.println("SI TE HA QUEDADO ALGUNA DUDA PUEDES VOLVER AQUÍ CUANDO QUIERAS");
    }

    /*He creado un apartado que es configuración de la partida. Dentro de ese apartado voy a crear un menú que
     * tenga opciones para explicar como configurar la partida y para cambiar esas configuraciones
     */

    public static void configuracion(){
        
        String opcion;
        
        do{
            
            System.out.println();
            System.out.println("MENÚ DE CONFIGURACIÓN\n");
            System.out.println("1. - EXPLICACIÓN");
            System.out.println("2. - CONFIGURACIÓN");
            System.out.println("3. - VOLVER");

            Scanner teclado = new Scanner(System.in);
    
            opcion = teclado.nextLine().toUpperCase();

            switch(opcion){

                case "1":
                    tutorialConfiguracion();
                    break;

                case "2":
                    break;
                    
                case "3":
                    System.out.println("CONFIGURACIÓN TERMINADA");
                    break;

                default:
                    System.out.println("OPCIÓN INCORRECTA. PRUEBA OTRA VEZ");
                    break;
            }

        }while(!"3".equals(opcion));
    }

    /*Creo el método que da una explicación de como funciona la configuración de la partida*/

    public static void tutorialConfiguracion(){
        System.out.println();

        System.out.println("LA COSA VA ASÍ. CADA JUGADA INDIVIDUAL ES UNA RONDA.");
        System.out.println("SI QUIERES JUGAR AL MEJOR DE X RONDAS, PUEDES CONFIGURARLO EN ESTE MENÚ");
        System.out.println("CUANDO ENTRES EN CONFIGURACIÓN SE TE PREGUNTARÁ AL MEJOR DE CUANTAS RONDA QUIERES JUGAR");
        System.out.println("BUENA SUERTE");
        System.out.println();
    }

    //Este método se encarga de dar al jugador una herramienta para elegir su jugada que es el string que devuelve

    public static String eleccionJugador(){

        String opcion = ""; //Variable opción para el menú, ya que la que definí dentro de main no me sirve

        Scanner teclado = new Scanner(System.in); //Una variable de Scanner, la de main no me vale

        do{
            System.out.println("AHORA ELIJA SU JUGADA. MARQUE SU OPCIÓN, TANTO EN MAYÚSCULAS COMO MINÚSCULAS.\n" + 
            "P. - PIEDRA" + "\n" +
            "L. - PAPEL" + "\n" +
            "T. - TIJERAS" + "\n");

            System.out.println();

            opcion = teclado.nextLine().toUpperCase(); //Me aseguro de hacer que la opción siempre entre en mayúsculas para comparar mejor

            //Evaluo de nuevo con un switch
            //Después de las pruebas vi que lo mejor era empezar a crear métodos para organizar mejor las cosas

            switch (opcion) {
                case "P":
                    
                    System.out.println("PIEDRA, EL ARMA DE UN BÁRBARO!!");
                    System.out.println();
                    break;
                case "L":

                    System.out.println("PAPEL, LA HERRAMIENTA DE UN ERUDITO");
                    System.out.println();
                    break;
                case "T":

                    System.out.println("TIJERAS, QUE ES LO QUE VAS A CORTAR?");
                    System.out.println();
                    break;
                default:
                    System.out.println("ESTÁS NERVIOSO? HAS ELEGIDO UNA OPCIÓN INCORRECTA. VAMOS, PRUEBA OTRA VEZ");
                    System.out.println();
            }
        }while(!opcion.equals("P") &&  !opcion.equals("L") && !opcion.equals("T"));

        return opcion;
}

    //Este método sirve para que la cpu elija una jugada. Para elegir 1 de entre las 3 jugadas posibles, lo que he hecho es
    //crear un array en el que almaceno la inicial de cada jugada. Luego hago que el método retorne una de las posiciones del 
    //array de forma aleatoria

    public static String eleccionCpu(){
        
        //Creo un array, de el va a coger sus opciones la CPU

        String cpu[] = {"P" , "L" , "T"};
        
        //Ahora la cpu hace su elección

        System.out.println();
        System.out.println("QUE ELEGIRÉ ESTA VEZ? DEJAME PENSAR");
        System.out.println();

        //Uso el metrodo Math.random para generar un número aleatorio entre 0 y 2 y hacer que la jugadaCpu sea igual a la letra en esa posición
        //de su array

        return cpu[(int)(Math.random()*2)];
    }

    /*En este método se reciben dos parámetros, el primero la elección del jugador, el segundo, la elección de la cpu, en ese orden
     * siempre. He decidido mostrar por pantalla aquí cual ha sido la elección de la cpu. Al final del método se devuelve la concatenación
     * de la elección del jugador + la elección de la cpu
     */

    public static String versus(String jugador, String cpu){
        //Ya que aquí recibo por parámetro el String que ha generado el método eleccionCpu, voy a evaluarlo par informar al player
        //de la elección de la cpu

        if(cpu.equals("P")){
            System.out.println("VOY A ELEGIR LA PIEDRA, A VER SI TE DOY CON ELLA");
        }
        
        if(cpu.equals("L")){
            System.out.println("PAPEL QUIZÁ? TENDRÉ QUE SER IMAGINATIVO Y VER QUE TE HAGO CON EL");
        }

        if(cpu.equals("T")){
            System.out.println("LAS TIJERAS!!! A LA YUGULAR");
        }

        //Luego ya retorno la concatenación de las dos elecciones para evaluar el resultado
        return jugador + cpu;
    }

    /*En el método resultado, que recibe un parámetro que es el string que devuelve el método versus se evalua ese String
     * Como la elección del jugador va a ser siempre la primera letra y la elección de la cpu la segunda letra, si la evaluo
     * con un if y el método equals puedo saber si el jugador ha ganado la ronda, si han empatado o si la cpu ha ganado
     */

    public static String resultado(String evaluacion){
        
        //Defino una variable String para devolver una cadena

        String resultado = "";
        
        //Ahora uso un if para evaluar resultados según el contenido de la variable enfrentamiento. El método que uso es que
        //la primera letra es la elección del jugador, la de la derecha es la de la cpu, dependiendo de su combinación podemos saber
        // si ha ganado el jugador, la cpu o es empate.

        if(evaluacion.equals("PT") || evaluacion.equals("TL") || evaluacion.equals("LP")){
            resultado = "VAYA. PARECE QUE HAS SIDO MÁS HÁBIL QUE YO... ESTA VEZ\n\nDAME OTRA OPORTUNIDAD... VAMOS... ESTA VEZ GANARÉ YO";
            } else if(evaluacion.equals("PP") || evaluacion.equals("TT") || evaluacion.equals("LL")){
            resultado = "NOS HEMOS LEIDO LA MENTE? HABRÁ QUE JUGAR UN DESEMPATE\n\nPREPÁRATE, AHÍ VAMOS DE NUEVO";
            } else {
                resultado ="NO ESTABAS PREPARADO. TENDRÁS QUE MEJORAR LA PROXIMA VEZ\n\nNO SERÍA JUSTO QUE NO TE DIESE OTRA OPORTUNIDAD, VAMOS, JUEGA DE NUEVO";
        }
        return resultado;
        
    }
}
