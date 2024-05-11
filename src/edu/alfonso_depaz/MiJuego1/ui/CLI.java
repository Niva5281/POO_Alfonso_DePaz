package edu.alfonso_depaz.MiJuego1.ui;

import edu.alfonso_depaz.MiJuego1.process.CaracteresJugadores;
import edu.alfonso_depaz.MiJuego1.process.Jugador1;
import edu.alfonso_depaz.MiJuego1.process.Jugadores;
import edu.alfonso_depaz.MiJuego1.process.metodos.jugadores.Metodo_RegistroDatos_Jugador1_V1;
import edu.alfonso_depaz.MiJuego1.process.metodos.jugadores.Metodo_RegistroDatos_Jugador2_V1;
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
    //Modo de juego de jugador contra jugador donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_Jugador(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
        //Se invoca el metodo y apunta al jugador 1
        Metodos_Jugadores metodosJugadores=new Metodo_RegistroDatos_Jugador1_V1();
        String jg1=null;
        jg1=CLI.leerJg1(jg1,metodosJugadores,lenguaje);

        //Se apunta al jugador 2
        metodosJugadores=new Metodo_RegistroDatos_Jugador2_V1();
        String jg2=null;
        jg2 =CLI.leerJg2(jg2,metodosJugadores,lenguaje);

        while(jg1.equals(jg2)){
            Scanner scanner=new Scanner(System.in);
            System.out.println(lenguaje.get_Error_JugadoresIguales());
            System.out.println(lenguaje.get_Entrada_CambiarNombreJugadorV());
            int opcion=scanner.nextInt();
            if(opcion==1) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador1_V1();
                jg1=leerJg1(jg1, metodosJugadores, lenguaje);
            } else if (opcion==2) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador2_V1();
                jg2=leerJg2(jg2, metodosJugadores,lenguaje);
            } else {
                System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
            }
        }

        Jugadores jugadores= new Jugadores(jg1, jg2);
        jugadores.setJg1_Nombre(jg1);
        jugadores.setJg2_Nombre(jg2);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jugadores.getJg1_Nombre());
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jugadores.getJg2_Nombre());

        //Se apunta al jugador 1 para registrar el caracter que quiera
        metodosJugadores= new Metodo_RegistroDatos_Jugador1_V1();
        String cj1=null;
        cj1=CLI.leerCj1(cj1,metodosJugadores, lenguaje);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+cj1);

        //Se apunta al jugador 2
        metodosJugadores=new Metodo_RegistroDatos_Jugador2_V1();
        String cj2=null;
        cj2= metodosJugadores.Guardar_CaracteresJugadores_V1(cj2,lenguaje);

        while(cj1.equals(cj2)){
            Scanner scanner=new Scanner(System.in);
            System.out.println(lenguaje.get_Error_CaracteresIguales());
            System.out.println(lenguaje.get_Entrada_CambiarCaracterJugador());
            int opcion=scanner.nextInt();
            if(opcion==1) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador1_V1();
                cj1=leerCj1(cj1, metodosJugadores, lenguaje);
            } else if (opcion==2) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador2_V1();
                cj2=leerCj2(cj2, metodosJugadores,lenguaje);
            } else {
                System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
            }
        }

        CaracteresJugadores caracteresJugadores=new CaracteresJugadores(cj1,cj2);
        caracteresJugadores.setJg1_Crt(cj1);
        caracteresJugadores.setJg2_Crt(cj2);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+caracteresJugadores.getJg1_Crt());
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+caracteresJugadores.getJg2_Crt());
        System.out.println(lenguaje.get_Salida_InicioJuego());
    }
    //Modo de juego de jugador contra CPU donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_CPU(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSCPU());

        Metodos_Jugadores metodosJugadores=new Metodo_RegistroDatos_Jugador1_V1();
        String jg1=null;
        jg1=CLI.leerJg1(jg1,metodosJugadores,lenguaje);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jg1);
        String cj1=null;
        cj1=CLI.leerCj1(cj1,metodosJugadores, lenguaje);

        Jugador1 jugador1=new Jugador1(jg1,cj1);
        jugador1.setJg1_Nombre(jg1);
        jugador1.setCj1_Caracter(cj1);

        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jugador1.getJg1_Nombre());
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+jugador1.getCj1_Caracter());
    }

}