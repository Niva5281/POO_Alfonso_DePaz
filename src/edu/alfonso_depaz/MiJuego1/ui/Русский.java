package edu.alfonso_depaz.MiJuego1.ui;

public class Русский extends Idioma{

    @Override
    public String get_Bienvenida() {
        return """
              Добро пожаловать в игру крестики-нолики
               """;
    }

    @Override
    public String get_Entrada_ModoDeJuego() {
        return """
               ///////////////////////////////////////////////////////////
               
               Игровой режим?
               
               1. Игрок против Игрока
               
               2. Игрок против процессора
               
               ///////////////////////////////////////////////////////////
               """;
    }

    @Override
    public String mostrar_Salida_CaracteresDeTicTacToe() {
        return """
                ///////////////////////////////////////////////////////////
                
                Это персонажи для
                 поставьте галочки напротив «Крестики-нолики»
                
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
        return "«Персонажи для игрока 1:»";
    }

    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "«Персонажи для игрока 2:»";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "«Имя игрока 1?»";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "«Имя игрока 2?»";
    }

    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "Неправильный символ";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "«Режим игры: Игрок против игрока...»";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "«Игровой режим: Игрок против процессора...»";
    }

    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "Зарегистрированный персонаж: ";
    }

    @Override
    public String get_Salida_InicioJuego() {
        return "«Начало игры»";
    }

    @Override
    public String get_Salida_FinalizarPrograma() {
        return "«Чтобы завершить программу, нажмите FIN  в любой момент»";
    }

    @Override
    public String get_Salida_FinalizandoJuego() {
        return "«Выход из игры»";
    }

    @Override
    public String get_Salida_RegresarMenu() {
        return "«Возвращение в меню»";
    }

    @Override
    public String get_Error_JugadoresIguales() {
        return "«Одинаковые имена игроков, пожалуйста, не вводите одинаковые имена»";
    }

    @Override
    public String get_Entrada_CambiarNombreJugadorV() {
        return "«Какого игрока вы хотите изменить? 1/2»";
    }

    @Override
    public String get_Error_CaracteresIguales() {
        return "«Те же персонажи игроков, пожалуйста, введите разные символы»";
    }

    @Override
    public String get_Entrada_CambiarCaracterJugador() {
        return "«Какого персонажа игрока вы хотите изменить? 1/2»";
    }

    @Override
    public String get_Salida_Empate() {
        return "Галстук";
    }

    @Override
    public String get_Salida_Ganador() {
        return "Победить!";
    }

    @Override
    public String get_Salida_JugarOtraVez() {
        return """
                Хотите сыграть еще раз?
                1. Ага
                2. Нет
                """;
    }

    @Override
    public String get_Salida_TurnoDe() {
        return "Поворот: ";
    }

    @Override
    public String get_Salida_EscojerFilasyColumnas() {
        return """
                //////////////////////////////////////////////
                
               Затем поместите строки и столбцы...
                
                //////////////////////////////////////////////
                """;
    }

    @Override
    public String get_Entrada_ObtenerFilas() {
        return "Ряд?";
    }

    @Override
    public String get_Entrada_ObtenerColumnas() {
        return "Столбец?";
    }

    @Override
    public String get_Salida_CeldaOcupada() {
        return "«Ячейка занята»";
    }

    @Override
    public String get_Salida_SalonFamaVacio() {
        return "«Зал славы пуст»";
    }

    @Override
    public String get_Salida_SalonFama() {
        return "Зал славы...";
    }

    @Override
    public String get_Salida_Victorias() {
        return "победа";
    }
}