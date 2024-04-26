package edu.alfonso_depaz.Reto11.process;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Contar_Palabras {
    public static String contar(String [] palabras){
        Map<String, Integer> frecuencias = new HashMap<>();
        for (String palabra : palabras) {
            frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
        }
        return Arrays.toString(frecuencias.keySet().toArray(new String[0]));
    }
}
