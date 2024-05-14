/**
 * Clase abstracta que define métodos para guardar nombres de jugadores y caracteres seleccionados por el usuario.
 */
package edu.alfonso_depaz.MiJuego1.process.metodos.jugadores;

import edu.alfonso_depaz.MiJuego1.ui.Idioma;

public abstract class Metodos_Jugadores {

    /**
     * Método abstracto para guardar el nombre del jugador.
     * @param jugador El nombre del jugador.
     * @param lenguaje El idioma en el que se mostrarán los mensajes.
     * @return El nombre del jugador.
     */
    public abstract String Guardar_NombresJugadores_V1(String jugador, Idioma lenguaje);

    /**
     * Método abstracto para guardar el carácter seleccionado por el jugador.
     * @param opcion La opción seleccionada por el jugador.
     * @param lenguaje El idioma en el que se mostrarán los mensajes.
     * @return El carácter seleccionado por el jugador.
     */
    public abstract String Guardar_CaracteresJugadores_V1(String opcion, Idioma lenguaje);
}