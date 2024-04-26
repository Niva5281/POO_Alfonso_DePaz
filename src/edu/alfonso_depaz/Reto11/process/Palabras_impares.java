package edu.alfonso_depaz.Reto11.process;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Palabras_impares {
    public static String[] palabras_Impares(String[] palabras) {
        return Arrays.stream(palabras)
                .filter(word -> word.length() % 2 != 0 && !repite_Letras(word))
                .toArray(String[]::new);
    }
    private static boolean repite_Letras(String palabra){
        return palabra.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values().stream()
                .anyMatch(count -> count > 1);
    }
}