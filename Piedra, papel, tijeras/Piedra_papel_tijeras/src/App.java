import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        //Lo primero que tengo que hacer es crear un objeto de la clase Scanner porque lo voy a necesitar

        Scanner teclado = new Scanner(System.in);

        

        //Como voy a tener que crear un menú, o quizás varios, creo una variable String para almacenar la opción seleccionada

        String opcion;

        //Creo 3 variables string para las jugadas de cada jugador y el resultado

        String jugadaPlayer = "", jugadaCpu = "", enfrentamiento = "";


        //Creo el primer menú, que será sencillo, para jugar una sola mano, según vaya añadiendo cosas quizá se vaya haciendo más grande

        do { 
            
            //Como lo que queremos es que funcione sin parar mostramos la primera información al usuario aquí por ahora
            System.out.println("BIENVENIDO A PIEDRA-PAPEL-TIJERAS");
            System.out.println("A CONTINUACIÓN SE LE MOSTRARÁ UN MENÚ. SELECCIONE LA OPCIÓN DESEADA PULSANDO EL NÚMERO DE LA IZQUIERDA");
            System.out.println();

            System.out.println(
                "1. - JUGAR UNA MANO" + "\n" +
                "2. - SALIR"
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
                    System.out.println("HASTA LA PRÓXIMA PARTIDA. VUELVE CON GANAS");
                    break;
                default:
                    //Por default, el usuario ha introducido una opción no recogida y debe de introducirla de nuevo otra vez
                    System.out.println("HA ELEGIDO UNA OPCIÓN INCORRECTA, PRUEBE OTRA VEZ");
                    System.out.println();
                    break;
            }

        } while (!"2".equals(opcion));

    }

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

    public static String versus(String jugador, String cpu){
        //Ya que aquí recibo por parámetro el String que a generado el método eleccionCpu, voy a evaluarlo par informar al player
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
