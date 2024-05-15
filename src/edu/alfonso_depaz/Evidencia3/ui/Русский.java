package edu.alfonso_depaz.Evidencia3.ui;

/**
 * Класс, определяющий сообщения на русском языке для игры.
 */
public class Русский extends Idioma{

    /**
     * Приветственное сообщение на русском языке.
     * @return приветственное сообщение
     */
    @Override
    public String get_Bienvenida() {
        return """
              Добро пожаловать в игру крестики-нолики
               """;
    }

    /**
     * Сообщение о выборе режима игры на русском языке.
     * @return сообщение о выборе режима игры
     */
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

    /**
     * Отображение символов для игры в крестики-нолики на русском языке.
     * @return отображение символов для игры
     */
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

    /**
     * Сообщение о выборе символов для игрока 1 на русском языке.
     * @return сообщение о выборе символов для игрока 1
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Uno() {
        return "«Персонажи для игрока 1:»";
    }

    /**
     * Сообщение о выборе символов для игрока 2 на русском языке.
     * @return сообщение о выборе символов для игрока 2
     */
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "«Персонажи для игрока 2:»";
    }

    /**
     * Сообщение о вводе имени игрока 1 на русском языке.
     * @return сообщение о вводе имени игрока 1
     */
    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "«Имя игрока 1?»";
    }

    /**
     * Сообщение о вводе имени игрока 2 на русском языке.
     * @return сообщение о вводе имени игрока 2
     */
    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "«Имя игрока 2?»";
    }

    /**
     * Сообщение об ошибке при вводе недопустимого символа на русском языке.
     * @return сообщение об ошибке при вводе недопустимого символа
     */
    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "Неправильный символ";
    }

    /**
     * Приветственное сообщение для режима игры Игрок против Игрока на русском языке.
     * @return приветственное сообщение для режима игры Игрок против Игрока
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "«Режим игры: Игрок против игрока...»";
    }

    /**
     * Приветственное сообщение для режима игры Игрок против процессора на русском языке.
     * @return приветственное сообщение для режима игры Игрок против процессора
     */
    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "«Игровой режим: Игрок против процессора...»";
    }

    /**
     * Сообщение подтверждения зарегистрированного символа на русском языке.
     * @return сообщение подтверждения зарегистрированного символа
     */
    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "Зарегистрированный персонаж: ";
    }

    /**
     * Сообщение о начале игры на русском языке.
     * @return сообщение о начале игры
     */
    @Override
    public String get_Salida_InicioJuego() {
        return "«Начало игры»";
    }

    /**
     * Сообщение для завершения программы на русском языке.
     * @return сообщение для завершения программы
     */
    @Override
    public String get_Salida_FinalizarPrograma() {
        return "«Чтобы завершить программу, нажмите FIN  в любой момент»";
    }

    /**
     * Сообщение об окончании игры на русском языке.
     * @return сообщение об окончании игры
     */
    @Override
    public String get_Salida_FinalizandoJuego() {
        return "«Выход из игры»";
    }

    /**
     * Сообщение о возвращении в меню на русском языке.
     * @return сообщение о возвращении в меню
     */
    @Override
    public String get_Salida_RegresarMenu() {
        return "«Возвращение в меню»";
    }

    /**
     * Сообщение об ошибке при вводе одинаковых имен игроков на русском языке.
     * @return сообщение об ошибке при вводе одинаковых имен игроков
     */
    @Override
    public String get_Error_JugadoresIguales() {
        return "«Одинаковые имена игроков, пожалуйста, не вводите одинаковые имена»";
    }

    /**
     * Сообщение о запросе выбора игрока для изменения имени на русском языке.
     * @return сообщение о запросе выбора игрока для изменения имени
     */
    @Override
    public String get_Entrada_CambiarNombreJugadorV() {
        return "«Какого игрока вы хотите изменить? 1/2»";
    }

    /**
     * Сообщение об ошибке при вводе одинаковых символов игроков на русском языке.
     * @return сообщение об ошибке при вводе одинаковых символов игроков
     */
    @Override
    public String get_Error_CaracteresIguales() {
        return "«Те же персонажи игроков, пожалуйста, введите разные символы»";
    }

    /**
     * Сообщение о запросе выбора игрока для изменения символа на русском языке.
     * @return сообщение о запросе выбора игрока для изменения символа
     */
    @Override
    public String get_Entrada_CambiarCaracterJugador() {
        return "«Какого персонажа игрока вы хотите изменить? 1/2»";
    }

    /**
     * Сообщение о ничьей на русском языке.
     * @return сообщение о ничьей
     */
    @Override
    public String get_Salida_Empate() {
        return "Галстук";
    }

    /**
     * Сообщение о победе на русском языке.
     * @return сообщение о победе
     */
    @Override
    public String get_Salida_Ganador() {
        return "Победить!";
    }

    /**
     * Сообщение о возможности сыграть еще раз на русском языке.
     * @return сообщение о возможности сыграть еще раз
     */
    @Override
    public String get_Salida_JugarOtraVez() {
        return """
                Хотите сыграть еще раз?
                1. Ага
                2. Нет
                """;
    }

    /**
     * Сообщение о ходе игрока на русском языке.
     * @return сообщение о ходе игрока
     */
    @Override
    public String get_Salida_TurnoDe() {
        return "Поворот: ";
    }

    /**
     * Сообщение о запросе выбора строк и столбцов на русском языке.
     * @return сообщение о запросе выбора строк и столбцов
     */
    @Override
    public String get_Salida_EscojerFilasyColumnas() {
        return """
                //////////////////////////////////////////////
                
               Затем поместите строки и столбцы...
                
                //////////////////////////////////////////////
                """;
    }

    /**
     * Сообщение о запросе ввода количества строк на русском языке.
     * @return сообщение о запросе ввода количества строк
     */
    @Override
    public String get_Entrada_ObtenerFilas() {
        return "Ряд?";
    }

    /**
     * Сообщение о запросе ввода количества столбцов на русском языке.
     * @return сообщение о запросе ввода количества столбцов
     */
    @Override
    public String get_Entrada_ObtenerColumnas() {
        return "Столбец?";
    }

    /**
     * Сообщение о занятой ячейке на русском языке.
     * @return сообщение о занятой ячейке
     */
    @Override
    public String get_Salida_CeldaOcupada() {
        return "«Ячейка занята»";
    }

    /**
     * Сообщение о пустом Зале Славы на русском языке.
     * @return сообщение о пустом Зале Славы
     */
    @Override
    public String get_Salida_SalonFamaVacio() {
        return "«Зал славы пуст»";
    }

    /**
     * Сообщение о Зале Славы на русском языке.
     * @return сообщение о Зале Славы
     */
    @Override
    public String get_Salida_SalonFama() {
        return "Зал славы...";
    }

    /**
     * Сообщение о числе побед на русском языке.
     * @return сообщение о числе побед
     */
    @Override
    public String get_Salida_Victorias() {
        return "победа";
    }
}