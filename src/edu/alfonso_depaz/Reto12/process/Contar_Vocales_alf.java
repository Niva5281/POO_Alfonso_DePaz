package edu.alfonso_depaz.Reto12.process;

import java.util.Map;
import java.util.TreeMap;

public class Contar_Vocales_alf {
    public static String[] Vocales_Alf(String caracter){
        Map<Character, StringBuilder> palabrasPorVocal = new TreeMap<>();
        palabrasPorVocal.put('a', new StringBuilder());
        palabrasPorVocal.put('e', new StringBuilder());
        palabrasPorVocal.put('i', new StringBuilder());
        palabrasPorVocal.put('o', new StringBuilder());
        palabrasPorVocal.put('u', new StringBuilder());
        String[] palabras = caracter.split("\\s+");

        for (String palabra : palabras) {
            char primeraLetra = palabra.toUpperCase().charAt(0);
            if (palabrasPorVocal.containsKey(primeraLetra)) {
                palabrasPorVocal.get(primeraLetra).append(palabra).append(" ");
            }
        }

        return palabrasPorVocal.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().toString().trim())
                .toArray(String[]::new);
    }
}
