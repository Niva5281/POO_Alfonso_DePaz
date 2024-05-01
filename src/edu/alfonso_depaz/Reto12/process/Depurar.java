package edu.alfonso_depaz.Reto12.process;

import java.text.Normalizer;

public class Depurar {
    public static String depurar(String texto){
        return texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]", "").toLowerCase();
    }
}