package edu.alfonso_depaz.reto3.ui;
import edu.alfonso_depaz.reto3.process.Diccionario;
import java.util.Scanner;
public class CLI {
    public static void showMenu(Diccionario diccionario) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("a. Para mostrar lista de palabras de diccionario");
            System.out.println("b. Buscar significado de palabra");
            System.out.println("c. Descripcion del diccionario");
            System.out.println("s. Finalizar diccionario");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "a":
                    diccionario.imprimir_lista();
                    break;
                case "b":
                    System.out.println("que palabra desea buscar?");
                    String palabra = scanner.nextLine();
                    String definicion = diccionario.buscar_definiciones(palabra);
                    System.out.printf("&s: %s\na", palabra, definicion);
                    break;
                case "c":
                    diccionario.imprimir_lista();
                    System.out.println("total de palabras" + diccionario.contador_de_palabras());
                case "s":
                    System.out.println("programa finalizado");
                    break;
            }
        }
    }

    public static void showNum_pares_impares() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de arrays que desea crear
        System.out.print("Ingrese la cantidad de filas que desea crear: ");
        int cantidadFilas = scanner.nextInt();

        // Crear un array de arrays para almacenar los arrays ingresados por el usuario
        int[][] arrays = new int[cantidadFilas][];
        System.out.print("Ingrese la cantidad de columnas que desea crear: ");
        int cantidadColumnas = scanner.nextInt();


        // Solicitar al usuario que ingrese los elementos para cada array
        for (int i = 0; i < cantidadFilas; i++) {
            arrays[i] = new int[cantidadColumnas];
            for (int j = 0; j < cantidadColumnas; j++) {
                System.out.print("Ingrese el elemento " + (j + 1) + ": ");
                arrays[i][j] = scanner.nextInt();
            }
        }

        // Mostrar los arrays ingresados por el usuario
        System.out.println("Arrays ingresados por el usuario:");
        for (int i = 0; i < cantidadFilas; i++) {
            System.out.print("Array " + (i + 1) + ": [");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
                if (j < arrays[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        int total_de_filas = 0;
        int total_de_columnas = 0;
        for (int i = 0; i < arrays.length; i++) {
            for(int s = 0;s < arrays.length; s++){
                total_de_filas += arrays [i][s];
            }
            System.out.println("El total de la fila "+(i+1)+" es ="+total_de_filas);
            total_de_filas=0;
        }
        int s=0;
        for (int i = 0;i<arrays.length;i++){
            while (s<cantidadColumnas){
                total_de_columnas += arrays[i][s];
                s++;
            }
            System.out.println("El total de columnas "+(i+1)+" es ="+total_de_columnas);
            total_de_columnas=0;
            s=0;
        }
        int total_de_todo = 0;
        for(int i = 0; i < arrays.length;i++){
            for(int j = 0;j <arrays.length;j++){
                total_de_todo +=arrays[i][j];
            }
        }
        System.out.println("Suma total de todos los numeros... "+total_de_todo);
    }
}