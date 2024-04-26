package edu.alfonso_depaz.Reto11.process;

import java.util.stream.Stream;

public class Palabras_vocalesParecidos {
    public static String []palabras_vocalesParecidos(String [] palabras){
        return Stream.of(palabras)
                .filter(word -> word.matches("^[aeiouAEIOU].*[aeiouAEIOU]$"))
                .filter(word -> word.length() >= 5)
                .toArray(String[]::new);
    }
}
