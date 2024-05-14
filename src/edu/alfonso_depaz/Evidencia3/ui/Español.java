package edu.alfonso_depaz.Evidencia3.ui;

public class Español extends Idioma{

    /**
     * Mensaje de bienvenida al juego en español.
     * @return mensaje de bienvenida
     */
    @Override
    public String get_Bienvenida() {
        return """
               Bienvenido al juego de TIC TAC TOE
               """;
    }

    /**
     * Mensaje que solicita al usuario seleccionar el modo de juego en español.
     * @return mensaje de solicitud de modo de juego
     */
    @Override
    public String get_Entrada_ModoDeJuego() {
        return """
               ///////////////////////////////////////////////////////////
               
               Modo de juego?
               
               1. Jugador vs Jugador
               
               2. Jugador vs CPU
               
               3. Mostrar salón de la fama
               
               ///////////////////////////////////////////////////////////
               """;
    }

    /**
     * Muestra la representación de caracteres del juego de Tic Tac Toe en español.
     * @return representación de caracteres del juego
     */
    @Override
    public String mostrar_Salida_CaracteresDeTicTacToe() {
        return """
                ///////////////////////////////////////////////////////////
                
                Estos son los caracteres para
                marcar las casillas del "Tic Tac Toe"
                
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
     * Mensaje que solicita al jugador uno su caracter para jugar en español.
     * @return mensaje de solicitud de caracter para el jugador uno
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Uno() {
        return "Caracteres para el jugador 1:";
    }

    /**
     * Mensaje que solicita al jugador dos su caracter para jugar en español.
     * @return mensaje de solicitud de caracter para el jugador dos
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "Caracteres para el jugador 2:";
    }

    /**
     * Mensaje que solicita al jugador uno su nombre en español.
     * @return mensaje de solicitud de nombre para el jugador uno
     */
    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "Nombre del jugador 1?";
    }

    /**
     * Mensaje que solicita al jugador dos su nombre en español.
     * @return mensaje de solicitud de nombre para el jugador dos
     */
    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "Nombre del jugador 2?";
    }

    /**
     * Mensaje de error cuando se ingresa un caracter inválido en español.
     * @return mensaje de error de caracter inválido
     */
    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "Carácter inválido";
    }

    /**
     * Mensaje de bienvenida al modo de juego de jugador contra jugador en español.
     * @return mensaje de bienvenida al modo de juego Jg VS Jg
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "Modo de juego: Jugador Vs Jugador...";
    }

    /**
     * Mensaje de bienvenida al modo de juego de jugador contra CPU en español.
     * @return mensaje de bienvenida al modo de juego Jg VS CPU
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "Modo de juego: Jugador Vs CPU...";
    }

    /**
     * Mensaje de confirmación cuando se registra un caracter en español.
     * @return mensaje de confirmación de registro de caracter
     */
    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "Carácter registrado: ";
    }

    /**
     * Mensaje de inicio de juego en español.
     * @return mensaje de inicio de juego
     */
    @Override
    public String get_Salida_InicioJuego() {
        return "Inicio del juego";
    }

    /**
     * Mensaje de finalización del programa en español.
     * @return mensaje de finalización del programa
     */
    @Override
    public String get_Salida_FinalizarPrograma() {
        return "Para finalizar el programa, escriba FIN en cualquier momento";
    }

    /**
     * Mensaje de finalización del juego en español.
     * @return mensaje de finalización del juego
     */
    @Override
    public String get_Salida_FinalizandoJuego() {
        return "Finalizando juego";
    }

    /**
     * Mensaje para regresar al menú principal en español.
     * @return mensaje para regresar al menú principal
     */
    @Override
    public String get_Salida_RegresarMenu() {
        return "Regresando al menú";
    }

    /**
     * Mensaje de error cuando se intenta ingresar nombres de jugadores iguales en español.
     * @return mensaje de error de jugadores iguales
     */
    @Override
    public String get_Error_JugadoresIguales() {
        return "Nombres de jugadores iguales. Por favor, introduzca nombres diferentes.";
    }

    /**
     * Mensaje para cambiar el nombre de un jugador en español.
     * @return mensaje para cambiar el nombre de un jugador
     */
    @Override
    public String get_Entrada_CambiarNombreJugadorV() {
        return "¿Qué jugador desea cambiar? 1/2";
    }

    /**
     * Mensaje de error cuando se intenta ingresar caracteres iguales para los jugadores en español.
     * @return mensaje de error de caracteres iguales
     */
    @Override
    public String get_Error_CaracteresIguales() {
        return "Caracteres de jugadores iguales. Por favor, introduzca caracteres diferentes.";
    }

    /**
     * Mensaje para cambiar el caracter de un jugador en español.
     * @return mensaje para cambiar el caracter de un jugador
     */
    @Override
    public String get_Entrada_CambiarCaracterJugador() {
        return "¿Qué caracter del jugador desea cambiar? 1/2";
    }

    /**
     * Mensaje de empate en español.
     * @return mensaje de empate
     */
    @Override
    public String get_Salida_Empate() {
        return "Empate";
    }

    /**
     * Mensaje de victoria en español.
     * @return mensaje de victoria
     */
    @Override
    public String get_Salida_Ganador() {
        return "¡Gana!";
    }

    /**
     * Mensaje que solicita al usuario si desea jugar otra vez en español.
     * @return mensaje de solicitud de jugar otra vez
     */
    @Override
    public String get_Salida_JugarOtraVez() {
        return """
                ¿Desea jugar otra vez?
                1. Sí
                2. No
                """;
    }

    /**
     * Mensaje que indica el turno de un jugador en español.
     * @return mensaje de turno de jugador
     */
    @Override
    public String get_Salida_TurnoDe() {
        return "Turno de: ";
    }

    /**
     * Mensaje que solicita al usuario seleccionar filas y columnas en español.
     * @return mensaje de solicitud de selección de filas y columnas
     */
    @Override
    public String get_Salida_EscojerFilasyColumnas() {
        return """
                //////////////////////////////////////////////
                
                A continuación, elija sus filas y columnas...
                
                //////////////////////////////////////////////
                """;
    }

    /**
     * Mensaje que solicita al usuario ingresar el número de filas en español.
     * @return mensaje de solicitud de número de filas
     */
    @Override
    public String get_Entrada_ObtenerFilas() {
        return "¿Fila?";
    }

    /**
     * Mensaje que solicita al usuario ingresar el número de columnas en español.
     * @return mensaje de solicitud de número de columnas
     */
    @Override
    public String get_Entrada_ObtenerColumnas() {
        return "¿Columna?";
    }

    /**
     * Mensaje de error cuando una celda ya está ocupada en español.
     * @return mensaje de error de celda ocupada
     */
    @Override
    public String get_Salida_CeldaOcupada() {
        return "La celda está ocupada";
    }

    /**
     * Mensaje cuando el salón de la fama está vacío en español.
     * @return mensaje de salón de la fama vacío
     */
    @Override
    public String get_Salida_SalonFamaVacio() {
        return "El Salón de la Fama está vacío";
    }

    /**
     * Mensaje que muestra el salón de la fama en español.
     * @return mensaje de salón de la fama
     */
    @Override
    public String get_Salida_SalonFama() {
        return "Salón de la Fama...";
    }

    /**
     * Mensaje que muestra el número de victorias en español.
     * @return mensaje de número de victorias
     */
    @Override
    public String get_Salida_Victorias() {
        return " Victorias";
    }
}