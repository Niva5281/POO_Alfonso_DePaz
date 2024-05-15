package edu.alfonso_depaz.Evidencia3.ui;

import edu.alfonso_depaz.Evidencia3.process.Partida;
import edu.alfonso_depaz.Evidencia3.data.SalonDeLaFama;
import edu.alfonso_depaz.Evidencia3.process.metodos.jugadores.Metodos_Jugadores;

import java.util.Scanner;

public class CLI {
    static boolean filtro=true;
    /**
     * Juego de gato donde cumple con los parametros de la evidencia 3
     */
    //En main se manda a llamar el menu
    public static void main(String [] args){
        CLI.Menu();
    }

    /**
     * Se registra el idioma y luego se pregunta cual opcion de juego va a escoger y se va hacia el modo de juego
     */
    public static void Menu(){
        //Se le pregunta al usuario el modo de juego a escojer y se va a ese apartado
        Scanner scanner=new Scanner(System.in);
        Idioma lenguaje=Seleccion_Idioma(scanner);
        SalonDeLaFama salonDeLaFama = new SalonDeLaFama(5);
        System.out.println(lenguaje.get_Bienvenida());
        System.out.println(lenguaje.get_Entrada_ModoDeJuego());
        int opcion;
        while (!scanner.hasNextInt()) {
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
            scanner.next();
        }
        opcion = scanner.nextInt();
        while(opcion>=3){
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
            opcion=scanner.nextInt();
        }
        if(opcion==1){
            CLI cli=new CLI();
            Partida partida=new Partida();
            System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
            System.out.println("****************************************************");
            System.out.println("****************************************************");
            partida.jugar_JugadorVsJugador(scanner, cli,lenguaje);
        } else if (opcion==2) {
            System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSCPU());
            CLI cli=new CLI();
            Partida partida=new Partida();
            System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
            partida.jugar_JugadorVsCpu(scanner, cli,lenguaje);
        } else {
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
        }
    }

    /**
     * Se define el idioma utilizando un scanner
     * @param scanner leer entradas del usuario
     * @return el lenguaje escogido
     */
    private static Idioma Seleccion_Idioma(Scanner scanner){
        Idioma lenguaje;
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Japones");
        System.out.println("4. Ruso");
        int opcion;
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Por favor ingrese solo números.");
            scanner.next();
        }
        opcion = scanner.nextInt();
        if(opcion==1){
            lenguaje=new Español();
        }else if(opcion==2){
            lenguaje=new English();
        } else if (opcion==3) {
            lenguaje=new Nihongo();
        } else if (opcion==4){
            lenguaje=new Русский();
        } else{
            lenguaje=new English();
        }
        return lenguaje;
    }

    /**
     * Se agregan metodos para leer jugadores, utiliza un polimorfismo inecessario en la clase "process.metodos.jugadores"
     * a partir de las clases, utiliza los metodos necesarios y acciones para ejecutar el programa
     *
     * objetivo: crear como checkpoints en donde el programa necesitara para el registro
     *
     * @param jg1 variable donde se almacena
     * @param metodosJugadores metodos en donde realizan las accinoes necesarias
     * @param lenguaje pasa el idioma seleccionado
     * @return se regresa jg1
     */
    public static String leerJg1(String jg1, Metodos_Jugadores metodosJugadores,Idioma lenguaje){
        jg1=metodosJugadores.Guardar_NombresJugadores_V1(jg1,lenguaje);
        return jg1;
    }
    public static String leerJg2(String jg2, Metodos_Jugadores metodosJugadores,Idioma lenguaje){
        jg2=metodosJugadores.Guardar_NombresJugadores_V1(jg2,lenguaje);
        return jg2;
    }
    public static String leerCj1(String cj1, Metodos_Jugadores metodosJugadores, Idioma lenguaje){
        cj1=metodosJugadores.Guardar_CaracteresJugadores_V1(cj1,lenguaje);
        return cj1;
    }
    public static String leerCj2(String cj2, Metodos_Jugadores metodosJugadores, Idioma lenguaje){
        cj2=metodosJugadores.Guardar_CaracteresJugadores_V1(cj2,lenguaje);
        return cj2;
    }

    /**
     * pregunta al usuario si desea jugar otra vez
     * @param lenguaje
     * @return el valor de la opcion si/no
     */
    public int mostrarMenuReinicio(Idioma lenguaje) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(lenguaje.get_Salida_JugarOtraVez());
        return scanner.nextInt();
    }
    public void condicional_esNumero(){

    }
}