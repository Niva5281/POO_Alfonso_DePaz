package edu.alfonso_depaz.reto3.ui;
import edu.alfonso_depaz.reto3.process.Diccionario;
import java.util.Scanner;
public class CLI {
    public static void showMenu(Diccionario diccionario){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("a. Para mostrar lista de palabras de diccionario");
            System.out.println("b. Buscar significado de palabra");
            System.out.println("c. Descripcion del diccionario");
            System.out.println("s. Finalizar diccionario");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "a": diccionario.imprimir_lista();
                break;
                case "b": System.out.println("que palabra desea buscar?");
                String palabra = scanner.nextLine();
                String definicion = diccionario.buscar_definiciones(palabra);
                System.out.printf("&s: %s\na", palabra, definicion);
                break;
                case "c": diccionario.imprimir_lista(); System.out.println("total de palabras"+diccionario.contador_de_palabras());
                case "s": System.out.println("programa finalizado");
                break;
            }
        }
    }
}
