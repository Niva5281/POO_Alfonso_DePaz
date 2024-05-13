package edu.alfonso_depaz.MiJuego1.ui;

import edu.alfonso_depaz.MiJuego1.process.Partida;
import edu.alfonso_depaz.MiJuego1.data.SalonDeLaFama;
import edu.alfonso_depaz.MiJuego1.process.metodos.jugadores.Metodos_Jugadores;

import java.util.Scanner;

public class CLI {
    static boolean filtro=true;
    /**
     * Juego de gato donde cumple con los parametros de la evidencia 3
     */
    //En main se hacen todas las operaciones de entradas y salidas del usuario
    public static void main(String [] args){
        CLI.Menu();
    }
    public static void Menu(){
        //Se le pregunta al usuario el modo de juego a escojer y se va a ese apartado
        Scanner scanner=new Scanner(System.in);
        Idioma lenguaje=Seleccion_Idioma(scanner);
        SalonDeLaFama salonDeLaFama = new SalonDeLaFama(5);
        System.out.println(lenguaje.get_Bienvenida());
        System.out.println(lenguaje.get_Entrada_ModoDeJuego());
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
        System.out.println("3. Japones");
        System.out.println("4. Ruso");
        int opcion=scanner.nextInt();
        if(opcion==1){
            lenguaje=new Español();
        }else if(opcion==2){
            lenguaje=new English();
        } else if (opcion==3) {
            lenguaje=new Nihongo();
        } else if (opcion==4){
            lenguaje=new Русский();
        } else {
            System.out.println("Language invalid, defaulting to English");
            lenguaje=new English();
        }
        return lenguaje;
    }
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
    public int mostrarMenuReinicio(Idioma lenguaje) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(lenguaje.get_Salida_JugarOtraVez());
        return scanner.nextInt();
    }
    //Modo de juego de jugador contra jugador donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_Jugador(Idioma lenguaje){
        Scanner scanner=new Scanner(System.in);
        CLI cli=new CLI();
        Partida partida=new Partida();
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
        System.out.println("****************************************************");
        partida.jugar_JugadorVsJugador(scanner, cli,lenguaje);
    }
    //Modo de juego de jugador contra CPU donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_CPU(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSCPU());
        Scanner scanner=new Scanner(System.in);
        CLI cli=new CLI();
        Partida partida=new Partida();
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
        partida.jugar_JugadorVsCpu(scanner, cli,lenguaje);
    }
}