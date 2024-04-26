package edu.alfonso_depaz.Reto11.process;

import java.text.Normalizer;

public class Depurar {
    public static String depurar(String texto){
        texto = texto.toLowerCase();
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", "");
        texto = texto.replaceAll("[^a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]", "");
        return texto;
    }
}
