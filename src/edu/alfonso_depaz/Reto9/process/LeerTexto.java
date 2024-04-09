package edu.alfonso_depaz.Reto9.process;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerTexto {
    public static String Leer(String archivo) {
        Path path = Paths.get("src", "edu", "gael_rivera", "reto9", "resources", archivo);
        try {
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
            return "";
        }
    }
}