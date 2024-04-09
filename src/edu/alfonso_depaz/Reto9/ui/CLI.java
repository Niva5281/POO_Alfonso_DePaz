package edu.alfonso_depaz.Reto9.ui;

import java.util.Scanner;
import edu.alfonso_depaz.Reto9.process.Contar_Palabras;
import edu.alfonso_depaz.Reto9.process.LeerTexto;
import edu.alfonso_depaz.Reto9.process.Depurar;
import edu.alfonso_depaz.Reto9.process.Separar;
import edu.alfonso_depaz.Reto9.process.Ordenar;
public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] Libros = {"Libro_1.txt", "Libro_2.txt", "Libro_3.txt", "Libro_4.txt", "Libro_5.txt"};
        System.out.println("Welcome");
        System.out.println("""
                1.Español
                2.English
                """);
        int idioma = scanner.nextInt();
        Idioma id = null;
        if (idioma == 1) {
            id = new Español();
        } else if (idioma == 2) {
            id = new English();
        } else {
            System.out.println("Invalid choice");
        }
        while (true) {
            System.out.println(id.get_SeleccionarLibro());
            for (int i = 0; i < Libros.length; i++) {
                System.out.println((i + 1) + "." + Libros(i));
            }
            int Opt = scanner.nextInt();
            if (Opt == 0) {
                System.out.println(id.fin());
                break;
            } else if (Opt >= 1 && Opt <= 5) {
                analyzeBook(Libros[Opt - 1], id);
            } else {
                System.out.println(id.get_opcionInvalida());
            }
        }
        scanner.close();
    }

    private static void analyzeBook(String book, Idioma id) {
        // Se lee el texto del libro
        String txt = LeerTexto.Leer(book);
        // Se limpia el texto eliminando caracteres no alfabéticos y convirtiendo en minusculas
        String cleanedText = Depurar.depurar(txt);
        // Se separa el texto en palabras
        String[] words = Separar.separar(cleanedText);
        // Se cuentan las palabras
        String[] countedWords = Contar_Palabras.contar(words);
        // Se ordenan las palabras por frecuencia
        String[] top10Words = Ordenar.ordenar(countedWords);

        // Se muestra el resultado del análisis al usuario
        System.out.println(id.get_PalabrasMasUsadas() + book);
        for (String word : top10Words) {
            System.out.println(word);
        }
    }
}