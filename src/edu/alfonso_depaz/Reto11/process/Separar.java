package edu.alfonso_depaz.Reto11.process;

public class Separar {
    public static String[] separar(String texto) {
        // Se utiliza el método split() de la clase String para dividir el texto en palabras utilizando espacios en blanco como delimitador
        return texto.split("\\s+"); // Separar por espacios en blanco
    }
}
