package edu.alfonso_depaz.Reto12.ui;

import java.util.Scanner;

import edu.alfonso_depaz.Reto12.process.Contar_Palabras;
import edu.alfonso_depaz.Reto12.process.LeerTexto;
import edu.alfonso_depaz.Reto12.process.Depurar;
import edu.alfonso_depaz.Reto12.process.Separar;
import edu.alfonso_depaz.Reto12.process.Ordenar;
import edu.alfonso_depaz.Reto12.process.*;
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
                System.out.println((i + 1) + ". " + Libros[i]);
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
        String txt = LeerTexto.Leer(book);
        String cleanedText = Depurar.depurar(txt);
        String[] words = Separar.separar(cleanedText);
        String[] countedWords = Contar_Palabras.contar(words);
        String[] top10Words = Ordenar.ordenar(countedWords);
        System.out.println(id.get_PalabrasMasUsadas() + book);
        for (String word : top10Words) {
            System.out.println(word);
        }
        int total_Vocales= Contar_Vocales.contar(cleanedText);
        System.out.println("Número total de vocales: " + total_Vocales);
        String[] vocales_Ordenadas = Contar_Vocales_alf.Vocales_Alf(cleanedText);
        System.out.println("Vocales en orden alfabetico");
        for (String vocal : vocales_Ordenadas) {
            System.out.print(vocal + " ");
        }
        System.out.println();

        String palabraMasCorta = Palabra_corta.palabra_Corta(words);
        System.out.println("Palabra más corta: " + palabraMasCorta);

        String palabraMasLarga = Palabra_larga.palabra_larga(words);
        System.out.println("Palabra más larga: " + palabraMasLarga);

        String[] palabrasLetraImpar = Palabras_impares.palabras_impares(words);
        System.out.println("Palabras con número impar de letras: ");
        for (String palabra : palabrasLetraImpar) {
            System.out.print(palabra + " ");
        }
        System.out.println();
        String[] palabrasConVocalesSemejantes = Palabras_vocalesParecidos.palabras_vocalesParecidos(words);
        System.out.println("Palabras que empiezan y terminan con una vocal y tienen al menos 5 letras: ");
        for (String palabra : palabrasConVocalesSemejantes) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}