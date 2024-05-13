package edu.alfonso_depaz.MiJuego1.ui;

import java.util.Scanner;

public abstract class Idioma {
    public abstract String get_Bienvenida();
    public abstract String get_Entrada_ModoDeJuego();
    public abstract String mostrar_Salida_CaracteresDeTicTacToe();
    public abstract String get_Entrada_CaracteresDeTicTacToe_Jg_Uno();
    public abstract String get_Entrada_CaracteresDeTicTacToe_Jg_Dos();
    public abstract String get_Entrada_Nombre_Jg_Uno();
    public abstract String get_Entrada_Nombre_Jg_Dos();
    public abstract String get_Salida_Error_CaracterInvalido();
    public abstract String get_Salida_Bienvenida_ModoDeJuego_JgVSJg();
    public abstract String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU();
    public abstract String get_Salida_Confirmación_CaracterRegistrado();
    public abstract String get_Salida_InicioJuego();
    public abstract String get_Salida_FinalizarPrograma();
    public abstract String get_Salida_FinalizandoJuego();
    public abstract String get_Salida_RegresarMenu();
    public abstract String get_Error_JugadoresIguales();
    public abstract String get_Entrada_CambiarNombreJugadorV();
    public abstract String get_Error_CaracteresIguales();
    public abstract String get_Entrada_CambiarCaracterJugador();
    public abstract String get_Salida_Empate();
    public abstract String get_Salida_Ganador();
    public abstract String get_Salida_JugarOtraVez();
    public abstract String get_Salida_TurnoDe();
    public abstract String get_Salida_EscojerFilasyColumnas();
    public abstract String get_Entrada_ObtenerFilas();
    public abstract String get_Entrada_ObtenerColumnas();
    public abstract String get_Salida_CeldaOcupada();
    public abstract String get_Salida_SalonFamaVacio();
    public abstract String get_Salida_SalonFama();
    public abstract String get_Salida_Victorias();
}
