package edu.alfonso_depaz.MiJuego1.process;

import java.util.Scanner;

public class Jugadores {
    private String Jg1_Nombre;
    private String Jg2_Nombre;
    public Jugadores(String Jg1_nombreConstructor,String Jg2_NombreConstructor){
        Jg1_nombreConstructor=Jg1_Nombre;
        Jg2_NombreConstructor=Jg2_Nombre;
    }
    public static String ReigstrarJugador2(String Jugador){
        Scanner scanner = new Scanner(System.in);
        Jugador=scanner.nextLine();
        return Jugador;
    }
    public String getJg1_Nombre(){
        return Jg1_Nombre;
    }
    public void setJg1_Nombre(String nuevoNombre){
        this.Jg1_Nombre=nuevoNombre;
    }
    public String getJg2_Nombre(){
        return Jg2_Nombre;
    }
    public void setJg2_Nombre(String nuevoNombre){
        this.Jg2_Nombre=nuevoNombre;
    }
}
