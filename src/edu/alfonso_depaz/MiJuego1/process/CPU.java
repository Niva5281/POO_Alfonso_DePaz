package edu.alfonso_depaz.MiJuego1.process;
import java.util.Random;
public class CPU {
    private char Cj_caracter;
    public CPU(char simbolo) {
        this.Cj_caracter = simbolo;
    }

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