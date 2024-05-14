package edu.alfonso_depaz.MiJuego1.ui;

/**
 * Clase que define los mensajes en inglés para el juego.
 */
public class English extends Idioma{

    /**
     * Mensaje de bienvenida en inglés.
     * @return mensaje de bienvenida
     */
    @Override
    public String get_Bienvenida() {
        return "Welcome";
    }

    /**
     * Mensaje que solicita al usuario seleccionar el modo de juego en inglés.
     * @return mensaje de solicitud de modo de juego
     */
    @Override
    public String get_Entrada_ModoDeJuego() {
        return """
                ///////////////////////////////////////////////////////////
                
                Choose your game mode...
                
                1. Player vs Player
                
                2. Player vs CPU
                
                3. Show hall of fame
                
                ///////////////////////////////////////////////////////////
                """;
    }

    /**
     * Muestra la representación de caracteres del juego de Tic Tac Toe en inglés.
     * @return representación de caracteres del juego
     */
    @Override
    public String mostrar_Salida_CaracteresDeTicTacToe() {
        return """
                ///////////////////////////////////////////////////////////
                
                These are the characters for the "Tic Tac Toe"
                
                A. X
                B. O
                C. †
                D. ∑
                E. 
                F. ©️
                G. §
                H. €
                I. W
                J. Z
                
                ///////////////////////////////////////////////////////////
                """;
    }

    /**
     * Mensaje que solicita al usuario ingresar los caracteres para el jugador 1 en inglés.
     * @return mensaje de solicitud de caracteres para el jugador 1
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Uno() {
        return "Characters for the player 1:";
    }

    /**
     * Mensaje que solicita al usuario ingresar los caracteres para el jugador 2 en inglés.
     * @return mensaje de solicitud de caracteres para el jugador 2
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "Characters for the player 2:";
    }

    /**
     * Mensaje que solicita al usuario ingresar el nombre del jugador 1 en inglés.
     * @return mensaje de solicitud de nombre del jugador 1
     */
    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "Name of the player 1?";
    }

    /**
     * Mensaje que solicita al usuario ingresar el nombre del jugador 2 en inglés.
     * @return mensaje de solicitud de nombre del jugador 2
     */
    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "Name of the player 2";
    }

    /**
     * Mensaje de error de caracter inválido en inglés.
     * @return mensaje de error de caracter inválido
     */
    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "Invalid Character";
    }

    /**
     * Mensaje de bienvenida al modo de juego Jugador vs Jugador en inglés.
     * @return mensaje de bienvenida al modo de juego Jugador vs Jugador
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "Game mode: Player Vs Player";
    }

    /**
     * Mensaje de bienvenida al modo de juego Jugador vs CPU en inglés.
     * @return mensaje de bienvenida al modo de juego Jugador vs CPU
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "Player Vs CPU";
    }

    /**
     * Mensaje de confirmación de caracter registrado en inglés.
     * @return mensaje de confirmación de caracter registrado
     */
    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "Character registered: ";
    }

    /**
     * Mensaje de inicio de juego en inglés.
     * @return mensaje de inicio de juego
     */
    @Override
    public String get_Salida_InicioJuego() {
        return "Starting game";
    }

    /**
     * Mensaje para finalizar el programa en inglés.
     * @return mensaje para finalizar el programa
     */
    @Override
    public String get_Salida_FinalizarPrograma() {
        return "To exit, use OUT";
    }

    /**
     * Mensaje de finalización de juego en inglés.
     * @return mensaje de finalización de juego
     */
    @Override
    public String get_Salida_FinalizandoJuego() {
        return ";)";
    }

    /**
     * Mensaje para regresar al menú en inglés.
     * @return mensaje para regresar al menú
     */
    @Override
    public String get_Salida_RegresarMenu() {
        return "Returning to menu";
    }

    /**
     * Mensaje de error de nombres de jugadores iguales en inglés.
     * @return mensaje de error de nombres de jugadores iguales
     */
    @Override
    public String get_Error_JugadoresIguales() {
        return "Same Player Names, please do not enter the same names";
    }

    /**
     * Mensaje para cambiar el nombre de un jugador en inglés.
     * @return mensaje para cambiar el nombre de un jugador
     */
    @Override
    public String get_Entrada_CambiarNombreJugadorV() {
        return "Which player do you want to change? 1/2";
    }

    /**
     * Mensaje de error de caracteres de jugadores iguales en inglés.
     * @return mensaje de error de caracteres de jugadores iguales
     */
    @Override
    public String get_Error_CaracteresIguales() {
        return "Same player characters, please enter different characters";
    }

    /**
     * Mensaje para cambiar el caracter de un jugador en inglés.
     * @return mensaje para cambiar el caracter de un jugador
     */
    @Override
    public String get_Entrada_CambiarCaracterJugador() {
        return "Which player character do you want to change? 1/2";
    }

    /**
     * Mensaje de empate en inglés.
     * @return mensaje de empate
     */
    @Override
    public String get_Salida_Empate() {
        return "Draw";
    }

    /**
     * Mensaje de victoria en inglés.
     * @return mensaje de victoria
     */
    @Override
    public String get_Salida_Ganador() {
        return "Won!";
    }

    /**
     * Mensaje que solicita al usuario si desea jugar otra vez en inglés.
     * @return mensaje de solicitud de jugar otra vez
     */
    @Override
    public String get_Salida_JugarOtraVez() {
        return """
                Do you want to play again?
                1. Yes
                2. Nop
                """;
    }

    /**
     * Mensaje que solicita al usuario ingresar filas y columnas en inglés.
     * @return mensaje de solicitud de filas y columnas
     */
    @Override
    public String get_Salida_TurnoDe() {
        return "Turn of: ";
    }

    /**
     * Mensaje que solicita al usuario ingresar filas y columnas en inglés.
     * @return mensaje de solicitud de filas y columnas
     */
    @Override
    public String get_Salida_EscojerFilasyColumnas() {
        return """
                //////////////////////////////////////////////
                
                Next, put your rows and columns...
                
                //////////////////////////////////////////////
                """;
    }

    /**
     * Mensaje que solicita al usuario ingresar las filas en inglés.
     * @return mensaje de solicitud de filas
     */
    @Override
    public String get_Entrada_ObtenerFilas() {
        return "Rows?";
    }

    /**
     * Mensaje que solicita al usuario ingresar las columnas en inglés.
     * @return mensaje de solicitud de columnas
     */
    @Override
    public String get_Entrada_ObtenerColumnas() {
        return "Columns?";
    }

    /**
     * Mensaje de celda ocupada en inglés.
     * @return mensaje de celda ocupada
     */
    @Override
    public String get_Salida_CeldaOcupada() {
        return "The cell is occupied";
    }

    /**
     * Mensaje que indica que el Salón de la Fama está vacío en inglés.
     * @return mensaje de Salón de la Fama vacío
     */
    @Override
    public String get_Salida_SalonFamaVacio() {
        return "The Hall of Fame is empty";
    }

    /**
     * Mensaje que muestra el Salón de la Fama en inglés.
     * @return mensaje del Salón de la Fama
     */
    @Override
    public String get_Salida_SalonFama() {
        return "Hall of Fame...";
    }

    /**
     * Mensaje que muestra el número de victorias en inglés.
     * @return mensaje del número de victorias
     */
    @Override
    public String get_Salida_Victorias() {
        return " Victories";
    }
}