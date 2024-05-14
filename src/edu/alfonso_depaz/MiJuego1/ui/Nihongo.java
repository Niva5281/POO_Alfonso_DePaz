package edu.alfonso_depaz.MiJuego1.ui;

/**
 * Clase que define los mensajes en japonés para el juego.
 */
public class Nihongo extends Idioma{

    /**
     * Mensaje de bienvenida en japonés.
     * @return mensaje de bienvenida
     */
    @Override
    public String get_Bienvenida() {
        return """
               TIC TAC TOE ゲームへようこそ
               """;
    }

    /**
     * Mensaje que solicita al usuario seleccionar el modo de juego en japonés.
     * @return mensaje de solicitud de modo de juego
     */
    @Override
    public String get_Entrada_ModoDeJuego() {
        return """
               ///////////////////////////////////////////////////////////
               
               ゲームモード？
               
               1. プレイヤー対プレイヤー
               
               2. プレイヤー対 CPU
               
               ///////////////////////////////////////////////////////////
               """;
    }

    /**
     * Muestra la representación de caracteres del juego de Tic Tac Toe en japonés.
     * @return representación de caracteres del juego
     */
    @Override
    public String mostrar_Salida_CaracteresDeTicTacToe() {
        return """
                ///////////////////////////////////////////////////////////
                
                これらは
                チックタックトゥ」のボックスをマークする文字です"
                
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
     * Mensaje que solicita al usuario ingresar los caracteres para el jugador 1 en japonés.
     * @return mensaje de solicitud de caracteres para el jugador 1
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Uno() {
        return "「プレイヤー 1 のキャラクター:」:";
    }

    /**
     * Mensaje que solicita al usuario ingresar los caracteres para el jugador 2 en japonés.
     * @return mensaje de solicitud de caracteres para el jugador 2
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "「プレイヤー 2 のキャラクター:」:";
    }

    /**
     * Mensaje que solicita al usuario ingresar el nombre del jugador 1 en japonés.
     * @return mensaje de solicitud de nombre del jugador 1
     */
    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "「プレイヤー１の名前は？」";
    }

    /**
     * Mensaje que solicita al usuario ingresar el nombre del jugador 2 en japonés.
     * @return mensaje de solicitud de nombre del jugador 2
     */
    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "「プレイヤー2の名前は？」";
    }

    /**
     * Mensaje de error de caracter inválido en japonés.
     * @return mensaje de error de caracter inválido
     */
    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "「無効な文字です」";
    }

    /**
     * Mensaje de bienvenida al modo de juego Jugador vs Jugador en japonés.
     * @return mensaje de bienvenida al modo de juego Jugador vs Jugador
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "「ゲームモード: プレイヤー vs プレイヤー...」";
    }

    /**
     * Mensaje de bienvenida al modo de juego Jugador vs CPU en japonés.
     * @return mensaje de bienvenida al modo de juego Jugador vs CPU
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "「ゲームモード: プレイヤー vs CPU...」";
    }

    /**
     * Mensaje de confirmación de caracter registrado en japonés.
     * @return mensaje de confirmación de caracter registrado
     */
    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "「登録キャラクター：」";
    }

    /**
     * Mensaje de inicio de juego en japonés.
     * @return mensaje de inicio de juego
     */
    @Override
    public String get_Salida_InicioJuego() {
        return "「ゲームの始まり」";
    }

    /**
     * Mensaje para finalizar el programa en japonés.
     * @return mensaje para finalizar el programa
     */
    @Override
    public String get_Salida_FinalizarPrograma() {
        return "「プログラムを終了するには、いつでもFINを押してください。」";
    }

    /**
     * Mensaje de finalización de juego en japonés.
     * @return mensaje de finalización de juego
     */
    @Override
    public String get_Salida_FinalizandoJuego() {
        return "「ゲームから離れる」";
    }

    /**
     * Mensaje para regresar al menú en japonés.
     * @return mensaje para regresar al menú
     */
    @Override
    public String get_Salida_RegresarMenu() {
        return "「メニューに戻る」";
    }

    /**
     * Mensaje de error de nombres de jugadores iguales en japonés.
     * @return mensaje de error de nombres de jugadores iguales
     */
    @Override
    public String get_Error_JugadoresIguales() {
        return "「同じプレイヤー名です。同じ名前を入力しないでください。」";
    }

    /**
     * Mensaje para cambiar el nombre de un jugador en japonés.
     * @return mensaje para cambiar el nombre de un jugador
     */
    @Override
    public String get_Entrada_CambiarNombreJugadorV() {
        return "「どの選手を変更しますか? 1/2」";
    }

    /**
     * Mensaje de error de caracteres de jugadores iguales en japonés.
     * @return mensaje de error de caracteres de jugadores iguales
     */
    @Override
    public String get_Error_CaracteresIguales() {
        return "「同じプレイヤーのシンボルです。別のシンボルを入力してください」";
    }

    /**
     * Mensaje para cambiar el caracter de un jugador en japonés.
     * @return mensaje para cambiar el caracter de un jugador
     */
    @Override
    public String get_Entrada_CambiarCaracterJugador() {
        return "「どのプレイヤーキャラクターを変更しますか? 1/2」";
    }

    /**
     * Mensaje de empate en japonés.
     * @return mensaje de empate
     */
    @Override
    public String get_Salida_Empate() {
        return "「ネクタイ」";
    }

    /**
     * Mensaje de victoria en japonés.
     * @return mensaje de victoria
     */
    @Override
    public String get_Salida_Ganador() {
        return "「勝て」！";
    }

    /**
     * Mensaje para jugar otra vez en japonés.
     * @return mensaje para jugar otra vez
     */
    @Override
    public String get_Salida_JugarOtraVez() {
        return """
                また遊びたい？
                1. うん
                2. いいえ
                """;
    }

    /**
     * Mensaje para indicar el turno del jugador en japonés.
     * @return mensaje para indicar el turno del jugador
     */
    @Override
    public String get_Salida_TurnoDe() {
        return "「ターン・オブ・ザ・:」: ";
    }

    /**
     * Mensaje para solicitar al usuario que escoja filas y columnas en japonés.
     * @return mensaje de solicitud de filas y columnas
     */
    @Override
    public String get_Salida_EscojerFilasyColumnas() {
        return """
                //////////////////////////////////////////////
                
                "次に、行と列を置きます..."
                
                //////////////////////////////////////////////
                """;
    }

    /**
     * Mensaje para solicitar al usuario ingresar las filas en japonés.
     * @return mensaje de solicitud de filas
     */
    @Override
    public String get_Entrada_ObtenerFilas() {
        return "行？";
    }

    /**
     * Mensaje para solicitar al usuario ingresar las columnas en japonés.
     * @return mensaje de solicitud de columnas
     */
    @Override
    public String get_Entrada_ObtenerColumnas() {
        return "カラム？";
    }

    /**
     * Mensaje de celda ocupada en japonés.
     * @return mensaje de celda ocupada
     */
    @Override
    public String get_Salida_CeldaOcupada() {
        return "「独房は占拠されています」";
    }

    /**
     * Mensaje que indica que el Salón de la Fama está vacío en japonés.
     * @return mensaje de Salón de la Fama vacío
     */
    @Override
    public String get_Salida_SalonFamaVacio() {
        return "「殿堂は空だ」";
    }

    /**
     * Mensaje que muestra el Salón de la Fama en japonés.
     * @return mensaje del Salón de la Fama
     */
    @Override
    public String get_Salida_SalonFama() {
        return "殿堂...";
    }

    /**
     * Mensaje que muestra el número de victorias en japonés.
     * @return mensaje del número de victorias
     */
    @Override
    public String get_Salida_Victorias() {
        return "勝利";
    }
}