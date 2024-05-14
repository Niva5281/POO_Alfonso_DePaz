package edu.alfonso_depaz.MiJuego1.ui;

import java.util.Scanner;

public abstract class Idioma {
    /**
     * Mensaje de bienvenida del juego en el idioma correspondiente.
     * @return mensaje de bienvenida
     */
    public abstract String get_Bienvenida();

    /**
     * Mensaje que solicita al usuario seleccionar el modo de juego.
     * @return mensaje de solicitud de modo de juego
     */
    public abstract String get_Entrada_ModoDeJuego();

    /**
     * Muestra la representación de caracteres del juego de Tic Tac Toe.
     * @return representación de caracteres del juego
     */
    public abstract String mostrar_Salida_CaracteresDeTicTacToe();

    /**
     * Mensaje que solicita al jugador uno su caracter para jugar.
     * @return mensaje de solicitud de caracter para el jugador uno
     */
    public abstract String get_Entrada_CaracteresDeTicTacToe_Jg_Uno();

    /**
     * Mensaje que solicita al jugador dos su caracter para jugar.
     * @return mensaje de solicitud de caracter para el jugador dos
     */
    public abstract String get_Entrada_CaracteresDeTicTacToe_Jg_Dos();

    /**
     * Mensaje que solicita al jugador uno su nombre.
     * @return mensaje de solicitud de nombre para el jugador uno
     */
    public abstract String get_Entrada_Nombre_Jg_Uno();

    /**
     * Mensaje que solicita al jugador dos su nombre.
     * @return mensaje de solicitud de nombre para el jugador dos
     */
    public abstract String get_Entrada_Nombre_Jg_Dos();

    /**
     * Mensaje de error cuando se ingresa un caracter inválido.
     * @return mensaje de error de caracter inválido
     */
    public abstract String get_Salida_Error_CaracterInvalido();

    /**
     * Mensaje de bienvenida al modo de juego de jugador contra jugador.
     * @return mensaje de bienvenida al modo de juego Jg VS Jg
     */
    public abstract String get_Salida_Bienvenida_ModoDeJuego_JgVSJg();

    /**
     * Mensaje de bienvenida al modo de juego de jugador contra CPU.
     * @return mensaje de bienvenida al modo de juego Jg VS CPU
     */
    public abstract String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU();

    /**
     * Mensaje de confirmación cuando se registra un caracter.
     * @return mensaje de confirmación de registro de caracter
     */
    public abstract String get_Salida_Confirmación_CaracterRegistrado();

    /**
     * Mensaje de inicio de juego.
     * @return mensaje de inicio de juego
     */
    public abstract String get_Salida_InicioJuego();

    /**
     * Mensaje de finalización del programa.
     * @return mensaje de finalización del programa
     */
    public abstract String get_Salida_FinalizarPrograma();

    /**
     * Mensaje de finalización del juego.
     * @return mensaje de finalización del juego
     */
    public abstract String get_Salida_FinalizandoJuego();

    /**
     * Mensaje para regresar al menú principal.
     * @return mensaje para regresar al menú principal
     */
    public abstract String get_Salida_RegresarMenu();

    /**
     * Mensaje de error cuando se intenta ingresar nombres de jugadores iguales.
     * @return mensaje de error de jugadores iguales
     */
    public abstract String get_Error_JugadoresIguales();

    /**
     * Mensaje para cambiar el nombre de un jugador.
     * @return mensaje para cambiar el nombre de un jugador
     */
    public abstract String get_Entrada_CambiarNombreJugadorV();

    /**
     * Mensaje de error cuando se intenta ingresar caracteres iguales para los jugadores.
     * @return mensaje de error de caracteres iguales
     */
    public abstract String get_Error_CaracteresIguales();

    /**
     * Mensaje para cambiar el caracter de un jugador.
     * @return mensaje para cambiar el caracter de un jugador
     */
    public abstract String get_Entrada_CambiarCaracterJugador();

    /**
     * Mensaje de empate.
     * @return mensaje de empate
     */
    public abstract String get_Salida_Empate();

    /**
     * Mensaje de victoria.
     * @return mensaje de victoria
     */
    public abstract String get_Salida_Ganador();

    /**
     * Mensaje que solicita al usuario si desea jugar otra vez.
     * @return mensaje de solicitud de jugar otra vez
     */
    public abstract String get_Salida_JugarOtraVez();

    /**
     * Mensaje que indica el turno de un jugador.
     * @return mensaje de turno de jugador
     */
    public abstract String get_Salida_TurnoDe();

    /**
     * Mensaje que solicita al usuario seleccionar filas y columnas.
     * @return mensaje de solicitud de selección de filas y columnas
     */
    public abstract String get_Salida_EscojerFilasyColumnas();

    /**
     * Mensaje que solicita al usuario ingresar el número de filas.
     * @return mensaje de solicitud de número de filas
     */
    public abstract String get_Entrada_ObtenerFilas();

    /**
     * Mensaje que solicita al usuario ingresar el número de columnas.
     * @return mensaje de solicitud de número de columnas
     */
    public abstract String get_Entrada_ObtenerColumnas();

    /**
     * Mensaje de error cuando una celda ya está ocupada.
     * @return mensaje de error de celda ocupada
     */
    public abstract String get_Salida_CeldaOcupada();

    /**
     * Mensaje cuando el salón de la fama está vacío.
     * @return mensaje de salón de la fama vacío
     */
    public abstract String get_Salida_SalonFamaVacio();

    /**
     * Mensaje que muestra el salón de la fama.
     * @return mensaje de salón de la fama
     */
    public abstract String get_Salida_SalonFama();

    /**
     * Mensaje que muestra el número de victorias.
     * @return mensaje de número de victorias
     */
    public abstract String get_Salida_Victorias();
}