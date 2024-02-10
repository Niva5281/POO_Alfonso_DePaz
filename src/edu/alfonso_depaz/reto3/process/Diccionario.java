package edu.alfonso_depaz.reto3.process;
import edu.alfonso_depaz.reto3.ui.CLI;

import java.util.Arrays;
import java.util.Scanner;
public class Diccionario {
    // Subvariables (campos o variables miembro)
    private String[] palabras;
    private String[] definicion;

    // Constructor
    public Diccionario(String []palabras, String []definicion) {
        this.palabras = palabras;
        this.definicion = definicion;
    }
    public String buscar_definiciones(String palabra) {
        return getDescripcion(getIndice(palabra));
    }
    private int getIndice(String palabra){
    int index=0;
    while(index < palabras.length){
        if(palabra.equalsIgnoreCase(palabras[index])) return index;
        index++;
    }
    return -1;
    }
    private String getDescripcion(int index){
        if(index==-1) return "la palabra que busca no esta en el diccionario";
        return definicion[index];
    }
    public void imprimir_lista(){
        Arrays
                .stream(palabras)
                .forEach(System.out::println);
    }
    public int contador_de_palabras() {
        int contadorPalabras = 0;
        for (String elemento : palabras) {
            // Dividir el elemento en palabras usando el espacio en blanco como delimitador
            String[] palabras = elemento.split("\\s+"); // \\s+ significa uno o más espacios en blanco
            contadorPalabras += palabras.length;
        }
        System.out.println("El número total de palabras en el array es: " + contadorPalabras);
        return contadorPalabras;
    }
}