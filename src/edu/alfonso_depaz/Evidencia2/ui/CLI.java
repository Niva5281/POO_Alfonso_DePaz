package edu.alfonso_depaz.Evidencia2.ui;
import edu.alfonso_depaz.Evidencia2.data.Articulo;
import edu.alfonso_depaz.Evidencia2.process.CalculoCosto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("1. Español");
        System.out.println("2. English");
        int idioma=scanner.nextInt();
        Idioma language;
        if (idioma == 1) {
            language = new Español(); // Instanciamos el idioma español
        } else if (idioma == 2) {
            language = new English(); // Instanciamos el idioma inglés
        } else {
            System.out.println("Invalid language choice."); // Opción de idioma inválida
            return;
        }
        // Simular inicio de sesión
        System.out.println(language.getBienvenida());

        System.out.print(language.getIngrese_Usuario());
        String usuario = scanner.nextLine();
        System.out.print(language.getIngrese_Contrseña());
        String contrasena = scanner.nextLine();

        // Simular generación aleatoria de consumo del usuario
        ArrayList<Articulo> productosConsumidos = generarConsumoAleatorio(idioma);

        // Mostrar reporte de consumo
        System.out.println(language.getMostrar_reporteConsumo());
        for (Articulo articulo : productosConsumidos) {
            System.out.println(language.getMostar_reporteConsumo_Nombre() + articulo.getNombre() + language.getMostrar_reporteConsumo_Tipo()+ articulo.getTipo() +
                    language.getMostrar_reporteConsumo_Genero() + articulo.getGenero() + language.getMostrar_reporteConsumo_Estreno() + (articulo.esEstreno() ? language.getMostrar_reporteConsumo_Verdadero() : language.getMostrar_reporteConsumo_Falso()));
        }

        // Calcular el monto a pagar
        CalculoCosto calculadora = new CalculoCosto();
        double montoTotal = calculadora.calcularCosto(productosConsumidos);

        // Mostrar el monto a pagar
        System.out.println(language.getMostrar_estimado() + usuario + language.getMostrar_Monto() + montoTotal);

        // Cerrar el scanner
        scanner.close();
    }
    private static ArrayList<Articulo> generarConsumoAleatorio(int idioma) {
        ArrayList<Articulo> productosConsumidos = new ArrayList<>();
        Random random = new Random();
        Idioma language=new English();
        String[] tipos = {language.getMostrar_Musica(), language.getMostrar_Videojuego(), language.getMostrar_Libro(), language.getMostrar_Pelicula()};
        String[] generos = {language.getMostrar_jPOP(), language.getMostrar_altPOP(), language.getMostrar_Novela(), language.getMostrar_Tecnología()};

        // Simular entre 5 y 10 productos consumidos
        int numProductos = random.nextInt(6) + 5;
        for (int i = 0; i < numProductos; i++) {
            String tipo = tipos[random.nextInt(tipos.length)];
            String genero = generos[random.nextInt(generos.length)];
            boolean esEstreno = random.nextBoolean();

            productosConsumidos.add(new Articulo(language.getMostrar_Producto() + (i + 1), tipo, genero, esEstreno));
        }

        return productosConsumidos;
    }
}