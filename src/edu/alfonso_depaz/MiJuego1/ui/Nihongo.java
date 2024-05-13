package edu.alfonso_depaz.MiJuego1.ui;

public class Nihongo extends Idioma{

    @Override
    public String get_Bienvenida() {
        return """
               TIC TAC TOE ゲームへようこそ
               """;
    }

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

    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Uno() {
        return "「プレイヤー 1 のキャラクター:」:";
    }

    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "「プレイヤー 2 のキャラクター:」:";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "「プレイヤー１の名前は？」";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "「プレイヤー2の名前は？」";
    }

    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "「無効な文字です」";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "「ゲームモード: プレイヤー vs プレイヤー...」";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "「ゲームモード: プレイヤー vs CPU...」";
    }

    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "「登録キャラクター：」";
    }

    @Override
    public String get_Salida_InicioJuego() {
        return "「ゲームの始まり」";
    }

    @Override
    public String get_Salida_FinalizarPrograma() {
        return "「プログラムを終了するには、いつでもFINを押してください。」";
    }

    @Override
    public String get_Salida_FinalizandoJuego() {
        return "「ゲームから離れる」";
    }

    @Override
    public String get_Salida_RegresarMenu() {
        return "「メニューに戻る」";
    }

    @Override
    public String get_Error_JugadoresIguales() {
        return "「同じプレイヤー名です。同じ名前を入力しないでください。」";
    }

    @Override
    public String get_Entrada_CambiarNombreJugadorV() {
        return "「どの選手を変更しますか? 1/2」";
    }

    @Override
    public String get_Error_CaracteresIguales() {
        return "「同じプレイヤーのシンボルです。別のシンボルを入力してください」";
    }

    @Override
    public String get_Entrada_CambiarCaracterJugador() {
        return "「どのプレイヤーキャラクターを変更しますか? 1/2」";
    }

    @Override
    public String get_Salida_Empate() {
        return "「ネクタイ」";
    }

    @Override
    public String get_Salida_Ganador() {
        return "「勝て」！";
    }

    @Override
    public String get_Salida_JugarOtraVez() {
        return """
                また遊びたい？
                1. うん
                2. いいえ
                """;
    }

    @Override
    public String get_Salida_TurnoDe() {
        return "「ターン・オブ・ザ・:」: ";
    }

    @Override
    public String get_Salida_EscojerFilasyColumnas() {
        return """
                //////////////////////////////////////////////
                
                "次に、行と列を置きます..."
                
                //////////////////////////////////////////////
                """;
    }

    @Override
    public String get_Entrada_ObtenerFilas() {
        return "行？";
    }

    @Override
    public String get_Entrada_ObtenerColumnas() {
        return "カラム？";
    }

    @Override
    public String get_Salida_CeldaOcupada() {
        return "「独房は占拠されています」";
    }

    @Override
    public String get_Salida_SalonFamaVacio() {
        return "「殿堂は空だ」";
    }

    @Override
    public String get_Salida_SalonFama() {
        return "殿堂...";
    }

    @Override
    public String get_Salida_Victorias() {
        return "勝利";
    }
}