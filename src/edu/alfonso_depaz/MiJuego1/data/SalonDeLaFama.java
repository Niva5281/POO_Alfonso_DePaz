/**
 * Clase que representa el Salón de la Fama del juego.
 */
package edu.alfonso_depaz.MiJuego1.data;

import edu.alfonso_depaz.MiJuego1.data.Jugador;
import edu.alfonso_depaz.MiJuego1.ui.Idioma;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SalonDeLaFama {
    private ArrayList<Jugador> jugadores;
    private int maxJugadores;

    /**
     * Constructor de la clase SalonDeLaFama.
     * @param maxJugadores El número máximo de jugadores en el Salón de la Fama.
     */
    public SalonDeLaFama(int maxJugadores) {
        this.jugadores = new ArrayList<>();
        this.maxJugadores = maxJugadores;
    }

    /**
     * Método para agregar un jugador al Salón de la Fama.
     * @param jugador El jugador a agregar.
     */
    public void agregarJugador(Jugador jugador) {
        if (jugadores.size() < maxJugadores) {
            jugadores.add(jugador);
        } else {
            jugadores.sort(Comparator.comparingInt(Jugador::obtenerVictorias)); // Ordenar por victorias
            if (jugador.obtenerVictorias() > jugadores.get(0).obtenerVictorias()) {
                jugadores.remove(0); // Eliminar el jugador con menos victorias
                jugadores.add(jugador); // Agregar el nuevo jugador
            }
        }
    }

    /**
     * Método para verificar si un jugador está en el Salón de la Fama.
     * @param jugador El jugador a verificar.
     * @return true si el jugador está en el Salón de la Fama, false en caso contrario.
     */
    public boolean verificarEntrada(Jugador jugador) {
        return jugadores.contains(jugador);
    }

    /**
     * Método para mostrar el Salón de la Fama en el idioma especificado.
     * @param lenguaje El idioma en el que se mostrará el Salón de la Fama.
     */
    public void mostrar(Idioma lenguaje) {
        if (jugadores.isEmpty()) {
            System.out.println(lenguaje.get_Salida_SalonFamaVacio());
        } else {
            System.out.println(lenguaje.get_Salida_SalonFama());
            for (int i = 0; i < jugadores.size(); i++) {
                Jugador jugador = jugadores.get(i);
                System.out.println((i + 1) + ". " + jugador.getJg_Nombre() + " - " + jugador.obtenerVictorias() + lenguaje.get_Salida_Victorias());
            }
        }
    }

    /**
     * Método estático para mostrar el menú del Salón de la Fama.
     * @param scanner El scanner para leer la entrada del usuario.
     * @return La opción elegida por el usuario.
     */
    public static int mostrarMenuSalonDeLaFama(Scanner scanner) {
        System.out.println("¿Quieres ver el Salón de la Fama?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        return scanner.nextInt();
    }
}