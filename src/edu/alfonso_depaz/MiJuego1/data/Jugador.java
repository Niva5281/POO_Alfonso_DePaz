package edu.alfonso_depaz.MiJuego1.data;

public class Jugador {
    private String Jg_Nombre;
    private char Cj_Caracter;
    private int victorias;
    public Jugador(){
        this.Jg_Nombre="";
        this.Cj_Caracter=' ';
        this.victorias=0;
    }
    public String getJg_Nombre(){
        return Jg_Nombre;
    }
    public void setJg_Nombre(String nuevoNombre){
        this.Jg_Nombre=nuevoNombre;
    }
    public char getCj_Caracter(){
        return Cj_Caracter;
    }

    public void setCj_Caracter(char nuevoCaracter){
        this.Cj_Caracter=nuevoCaracter;
    }
    public void aumentarVictorias(){
        victorias++;
    }
    public int obtenerVictorias() {
        return victorias;
    }
    public void marcarCasilla(int fila, int columna, char[][] tablero) {
        tablero[fila][columna] = Cj_Caracter;
    }
}
