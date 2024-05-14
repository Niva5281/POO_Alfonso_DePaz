/**
 * Clase que representa el tablero de juego.
 */
package edu.alfonso_depaz.MiJuego1.process;

import java.util.Random;

public class Tablero {
    // Matriz que representa el tablero
    private char[][] matriz;
    // Variable para almacenar al ganador
    private String ganador;

    /**
     * Constructor de la clase Tablero.
     */
    public Tablero() {
        this.matriz = new char[3][3];
        this.ganador = "";
        // Inicializa el tablero
        inicializar();
    }

    /**
     * Método para inicializar el tablero con espacios en blanco.
     */
    public void inicializar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    /**
     * Método para mostrar el tablero.
     */
    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    /**
     * Método para verificar si una casilla está vacía.
     * @param fila Fila de la casilla.
     * @param columna Columna de la casilla.
     * @return true si la casilla está vacía, false de lo contrario.
     */
    public boolean verificarCasilla(int fila, int columna) {
        return matriz[fila][columna] == ' ';
    }

    /**
     * Método para marcar una casilla con un símbolo.
     * @param fila Fila de la casilla a marcar.
     * @param columna Columna de la casilla a marcar.
     * @param simbolo Símbolo a colocar en la casilla.
     */
    public void marcarCasilla(int fila, int columna, char simbolo) {
        matriz[fila][columna] = simbolo;
    }

    /**
     * Método para vaciar todas las casillas del tablero.
     */
    public void vaciarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    /**
     * Método para marcar una casilla aleatoria con un símbolo.
     * @param simbolo Símbolo a colocar en la casilla.
     */
    public void marcarCasillaRandom(char simbolo) {
        Random rand = new Random();
        int fila, columna;
        do {
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
        } while (!verificarCasilla(fila, columna));
        matriz[fila][columna] = simbolo;
    }

    /**
     * Método para verificar si hay un ganador o si hay empate.
     * @return true si hay un ganador o empate, false de lo contrario.
     */
    public boolean verificarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != ' ') {
                ganador = String.valueOf(matriz[i][0]);
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (matriz[0][j] == matriz[1][j] && matriz[1][j] == matriz[2][j] && matriz[0][j] != ' ') {
                ganador = String.valueOf(matriz[0][j]);
                return true;
            }
        }
        // Verificar diagonales
        if ((matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != ' ') ||
                (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != ' ')) {
            ganador = String.valueOf(matriz[1][1]);
            return true;
        }
        // Verificar empate
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == ' ') {
                    empate = false;
                    break;
                }
            }
            if (!empate) break;
        }
        if (empate) {
            ganador = "Empate";
            return true;
        }
        return false;
    }

    /**
     * Método para obtener al ganador del juego.
     * @return El nombre del ganador o "Empate".
     */
    public String obtenerGanador() {
        return ganador;
    }
}