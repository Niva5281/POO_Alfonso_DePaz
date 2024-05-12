package edu.alfonso_depaz.MiJuego1.process;
import java.util.Random;
public class CPU {
    private String simbolo;
    public CPU(String simbolo) {
        this.simbolo = simbolo;
    }

    public void marcarCasillaRandom(Tablero tablero) {
        Random rand = new Random();
        int fila, columna;
        do {
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
        } while (!tablero.verificarCasilla(fila, columna));
        tablero.marcarCasilla(fila, columna, simbolo);
    }
}