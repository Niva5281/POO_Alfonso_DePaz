/**
 * Clase que representa a un jugador en el juego de gato.
 */
package edu.alfonso_depaz.Evidencia3.data;

public class Jugador {
    private String Jg_Nombre;
    private char Cj_Caracter;
    private int victorias;

    /**
     * Constructor de la clase Jugador.
     * Inicializa los atributos del jugador.
     */
    public Jugador(){
        this.Jg_Nombre="";
        this.Cj_Caracter=' ';
        this.victorias=0;
    }

    /**
     * Método para obtener el nombre del jugador.
     * @return El nombre del jugador.
     */
    public String getJg_Nombre(){
        return Jg_Nombre;
    }

    /**
     * Método para establecer el nombre del jugador.
     * @param nuevoNombre El nuevo nombre del jugador.
     */
    public void setJg_Nombre(String nuevoNombre){
        this.Jg_Nombre=nuevoNombre;
    }

    /**
     * Método para obtener el carácter del jugador.
     * @return El carácter del jugador.
     */
    public char getCj_Caracter(){
        return Cj_Caracter;
    }

    /**
     * Método para establecer el carácter del jugador.
     * @param nuevoCaracter El nuevo carácter del jugador.
     */
    public void setCj_Caracter(char nuevoCaracter){
        this.Cj_Caracter=nuevoCaracter;
    }

    /**
     * Método para aumentar el contador de victorias del jugador.
     */
    public void aumentarVictorias(){
        victorias++;
    }

    /**
     * Método para obtener el número de victorias del jugador.
     * @return El número de victorias del jugador.
     */
    public int obtenerVictorias() {
        return victorias;
    }

    /**
     * Método para marcar una casilla en el tablero.
     * @param fila La fila en la que se va a marcar la casilla.
     * @param columna La columna en la que se va a marcar la casilla.
     * @param tablero El tablero de juego.
     */
    public void marcarCasilla(int fila, int columna, char[][] tablero) {
        tablero[fila][columna] = Cj_Caracter;
    }
}