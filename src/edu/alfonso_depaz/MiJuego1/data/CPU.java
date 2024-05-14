/**
 * Clase que representa al jugador controlado por la computadora en el juego de gato.
 */
package edu.alfonso_depaz.MiJuego1.data;

import edu.alfonso_depaz.MiJuego1.process.Tablero;

import java.util.Random;

public class CPU {
    private char Cj_caracter;

    /**
     * Constructor de la clase CPU.
     * @param simbolo El símbolo con el que juega la CPU.
     */
    public CPU(char simbolo) {
        this.Cj_caracter = simbolo;
    }

    /**
     * Método para marcar una casilla aleatoria en el tablero por parte de la CPU.
     * @param tablero El tablero de juego.
     */
    public void marcarCasillaRandom(Tablero tablero) {
        Random rand = new Random();
        int fila, columna;
        do {
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
        } while (!tablero.verificarCasilla(fila, columna));
        tablero.marcarCasilla(fila, columna, Cj_caracter);
    }
}