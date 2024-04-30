package edu.alfonso_depaz.Reto11.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerTexto {
    public static String Leer(String archivo) {
        Path path = Paths.get("src", "edu", "alfonso_depaz", "reto11", "Libros", archivo);
        try {
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
            return "";
        }
    }
}