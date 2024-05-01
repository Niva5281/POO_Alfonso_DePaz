package edu.alfonso_depaz.Reto12.process;

import java.util.ArrayList;

public class Palabras_impares {
    public static String [] palabras_impares(String [] palabras){
        ArrayList<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.length() % 2 != 0) {
                resultado.add(palabra);
            }
        }
        return resultado.toArray(new String[resultado.size()]);
    }
}