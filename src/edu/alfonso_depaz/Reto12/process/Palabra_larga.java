package edu.alfonso_depaz.Reto12.process;

import java.util.Comparator;
import java.util.stream.Stream;

public class Palabra_larga {
    public static String palabra_larga(String[] palabras){
        return Stream.of(palabras)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
