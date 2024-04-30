package edu.alfonso_depaz.Reto12.process;

import java.util.Comparator;
import java.util.stream.Stream;

public class Palabra_corta {
    public static String palabra_Corta(String[] palabras){
        return Stream.of(palabras)
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
    }
}
