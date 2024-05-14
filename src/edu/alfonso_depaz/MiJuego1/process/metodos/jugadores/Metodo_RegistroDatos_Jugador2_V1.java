/**
 * Clase que sobrescribe los métodos para registrar jugadores y caracteres del usuario.
 * Esta variante de registro del jugador 1 utiliza salidas "System.out.println" para solicitar
 * al usuario los datos requeridos.
 */
package edu.alfonso_depaz.MiJuego1.process.metodos.jugadores;

import edu.alfonso_depaz.MiJuego1.ui.Idioma;

import java.util.Scanner;

public class Metodo_RegistroDatos_Jugador2_V1 extends Metodos_Jugadores {

    /**
     * Método para guardar el nombre del jugador.
     * @param jugador El nombre del jugador.
     * @param lenguaje El idioma en el que se mostrarán los mensajes.
     * @return El nombre del jugador.
     */
    @Override
    public String Guardar_NombresJugadores_V1(String jugador, Idioma lenguaje) {
        // Se invoca scanner para leer salidas del usuario
        Scanner scanner = new Scanner(System.in);
        // Se imprime mensaje
        System.out.println(lenguaje.get_Entrada_Nombre_Jg_Dos());
        // Se registra el nombre
        jugador = scanner.nextLine();
        return jugador;
    }

    /**
     * Método para guardar el carácter seleccionado por el jugador.
     * @param opcion La opción seleccionada por el jugador.
     * @param lenguaje El idioma en el que se mostrarán los mensajes.
     * @return El carácter seleccionado por el jugador.
     */
    @Override
    public String Guardar_CaracteresJugadores_V1(String opcion, Idioma lenguaje) {
        // Se invoca scanner para leer salidas del usuario
        Scanner scanner = new Scanner(System.in);
        // Se imprime mensaje de la lista de caracteres
        System.out.println(lenguaje.mostrar_Salida_CaracteresDeTicTacToe());
        // Se imprime mensaje para registrar el jugador
        System.out.println(lenguaje.get_Entrada_CaracteresDeTicTacToe_Jg_Dos());
        // Se registra la opción
        opcion = scanner.nextLine();

        // Se asigna el carácter correspondiente según la opción ingresada por el usuario
        switch (opcion.toLowerCase()) {
            case "a" -> opcion = "X";
            case "b" -> opcion = "O";
            case "c" -> opcion = "†";
            case "d" -> opcion = "∑";
            case "e" -> opcion = "";
            case "f" -> opcion = "©️";
            case "g" -> opcion = "§";
            case "h" -> opcion = "€";
            case "i" -> opcion = "W";
            case "j" -> opcion = "Z";
            default -> System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
        }
        return opcion;
    }
}