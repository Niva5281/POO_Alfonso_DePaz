package edu.alfonso_depaz.reto4.process;

import edu.alfonso_depaz.reto4.UI.CLI;

import java.util.ArrayList;
import java.util.Scanner;
// se registran los metodos necesarios

public class Ticket{
    //se crea un array biodimensional para le impresión de los pasajeros, esto se hace con la finalidad de utilizar
    //el array para una mejor vizualisación a los pasajeros
    static int[][] lista_Pasajeros;
    //se crea la lista de pasajeros utilizando el "Arraylist"
    public static ArrayList<String> listaPasajeros;
    //Se crea la variable del comprador
    public String comprador;
    //Se crea un constructor asignado al ticket
    public Ticket(ArrayList<String> listaPasajeros, String comprador){
        this.listaPasajeros = listaPasajeros;
        this.comprador = comprador;
    }
    static ArrayList<String>Pasajeros=new ArrayList<>();
    public static void registrar_Comprador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo del comprador");
        String comprador = scanner.nextLine();
    }
    public static void registrar_Pasajeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los pasajeros (escriba 'fin' para detenerse):");
        String respuesta;
        while (true) {
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("fin")) {
                break;
            }
            Pasajeros.add(respuesta);
        }
    }
    public static void imprimir_Pasajeros(){
        for (int i=0,i<listaPasajeros.size(),i++){
            System.out.println("Pasajero"+listaPasajeros.size());
        }
    }
}