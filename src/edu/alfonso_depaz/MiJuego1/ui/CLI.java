package edu.alfonso_depaz.MiJuego1.ui;

import edu.alfonso_depaz.MiJuego1.process.Jugadores;

import java.util.Scanner;

public class CLI {
    static boolean filtro=true;
    /**
     * Juego de gato donde cumple con los parametros de la evidencia 3
     * @param args
     */
    //En main se hacen todas las operaciones de entradas y salidas del usuario
    public static void main(String [] args){
        //Se le pregunta al usuario el modo de juego a escojer y se va a ese apartado
        Scanner scanner=new Scanner(System.in);
        Idioma lenguaje=Seleccion_Idioma(scanner);
        System.out.println(lenguaje.get_Bienvenida());
        System.out.println(lenguaje.get_Entrada_ModoDeJuego());
        System.out.println(lenguaje.get_Salida_FinalizarPrograma());
        int opcion=scanner.nextInt();
        if(opcion==1){
            Jugador_VS_Jugador(lenguaje);
        } else if (opcion==2) {
            Jugador_VS_CPU(lenguaje);
        } else {
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
        }
    }
    //Se define el lenguaje a utilizar "Español y ingles" utilizando un metodo
    private static Idioma Seleccion_Idioma(Scanner scanner){
        Idioma lenguaje;
        System.out.println("1. Español");
        System.out.println("2. English");
        int opcion=scanner.nextInt();
        if(opcion==1){
            lenguaje=new Español();
        }else if(opcion==2){
            lenguaje=new English();
        }else{
            System.out.println("Language invalid, defaulting to English");
            lenguaje=new English();
        }
        return lenguaje;
    }
    //Se registran los jugadores y los caracteres a utilizar en el gato correspondiendo al jugador
    public static void Registrar_JugadoresGeneral(Idioma lenguaje){
        //Se invoca el objeto para utilizar los metodos de la clase
        CLI metodo = new CLI();
        //Se invoca el scanner el registro de datos proporcionados por el usuario
        Scanner scanner = new Scanner(System.in);
        //Se hace el proceso de registro de nombres de los usuarios
        System.out.println(lenguaje.get_Entrada_Nombre_Jg_Uno());
        String jugador1=scanner.nextLine();
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jugador1);

        System.out.println(lenguaje.get_Entrada_Nombre_Jg_Dos());
        String jugador2=scanner.nextLine();
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jugador2);

        Jugadores jugadores= new Jugadores(jugador1,jugador2);
        jugadores.setJg1_Nombre(jugador1);
        jugadores.setJg2_Nombre(jugador2);
        System.out.println("***********************");
        System.out.println("Player 1: "+jugadores.getJg1_Nombre());
        System.out.println("Player 2: "+jugadores.getJg2_Nombre());
        System.out.println("***********************");
        //Se hace el proceso de registro de caracteres correspondiendo a cada uno de los jugadores
        System.out.println(lenguaje.mostrar_Salida_CaracteresDeTicTacToe());
        System.out.println(lenguaje.get_Entrada_CaracteresDeTicTacToe_Jg_Uno());
        String Caracter_Jg_1= scanner.next();

        do while(){

        }
        Caracter_Jg_1=metodo.RegistrarCaracteresJugadores(Caracter_Jg_1, lenguaje);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+Caracter_Jg_1);

        System.out.println(lenguaje.get_Entrada_CaracteresDeItcTacToe_Jg_Dos());
        String Caracter_Jg_2=scanner.next();
        Caracter_Jg_2=metodo.RegistrarCaracteresJugadores(Caracter_Jg_2, lenguaje);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+Caracter_Jg_2);
    }
    public String RegistrarCaracteresJugadores(String opcion, Idioma lenguaje){
        if(opcion.equalsIgnoreCase("a")){
            opcion="X";
        }else if(opcion.equalsIgnoreCase("b")){
            opcion="O";
        } else if (opcion.equalsIgnoreCase("c")) {
            opcion="†";
        }else if (opcion.equalsIgnoreCase("d")) {
            opcion = "∑";
        }else if (opcion.equalsIgnoreCase("e")) {
            opcion = "";
        }else if (opcion.equalsIgnoreCase("f")) {
            opcion = "©";
        }else if (opcion.equalsIgnoreCase("g")) {
            opcion = "§";
        }else if (opcion.equalsIgnoreCase("h")) {
            opcion = "€";
        }else if (opcion.equalsIgnoreCase("i")) {
            opcion = "W";
        }else if (opcion.equalsIgnoreCase("j")) {
            opcion = "Z";
        }else{
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
        }
        return opcion;
    }
    //Metodo donde guarda la opcion para seleccionar el caracter (Numero) y regresa el caracter seleccionado
    //Modo de juego de jugador contra jugador donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_Jugador(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
        CLI.Registrar_JugadoresGeneral(lenguaje);
        System.out.println(lenguaje.get_Salida_InicioJuego());
    }
    //Modo de juego de jugador contra CPU donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_CPU(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSCPU());
    }

}