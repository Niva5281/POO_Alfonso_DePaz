package edu.alfonso_depaz.Reto12.process;

public class Contar_Vocales {
    public static int contar(String texto) {
        long count = texto.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
        return (int) count;
    }
}
