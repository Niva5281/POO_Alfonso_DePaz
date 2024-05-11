package edu.alfonso_depaz.MiJuego1.process.metodos.jugadores;

import edu.alfonso_depaz.MiJuego1.ui.Idioma;

import java.util.Scanner;

public class Metodo_RegistroDatos_Jugador2_V1 extends Metodos_Jugadores{
    /**
     * Clase donde sobre escribe los metodos para registrar jugadores y caracteres del usuario
     * Esta variante de registro del jugador 1, utiliza salidas "System.out.println" para pedirle
     * al usuario los datos requeridos
     */

    @Override
    public String Guardar_NombresJugadores_V1(String jugador, Idioma lenguaje) {
        //Se invoca scanner para leer salidas del usuario
        Scanner scanner = new Scanner(System.in);
        //Se imprime mensaje
        System.out.println(lenguaje.get_Entrada_Nombre_Jg_Dos());
        //Se registra el nombre
        jugador=scanner.nextLine();
        return jugador;
    }

    @Override
    public String Guardar_CaracteresJugadores_V1(String opcion, Idioma lenguaje) {
        //Se invoca scanner para leer salidas del usuario
        Scanner scanner = new Scanner(System.in);
        //Se imprime mensaje de la lista de caracteres
        System.out.println(lenguaje.mostrar_Salida_CaracteresDeTicTacToe());
        //Se imprime mensaje para registrar el jugador
        System.out.println(lenguaje.get_Entrada_CaracteresDeTicTacToe_Jg_Dos());
        //Se registra la opcion
        opcion=scanner.nextLine();

        if(opcion.equalsIgnoreCase("a")){
            opcion="X";
        }else if(opcion.equalsIgnoreCase("b")){
            opcion="O";
        } else if (opcion.equalsIgnoreCase("c")) {
            opcion="†";
        }else if (opcion.equalsIgnoreCase("d")) {
            opcion = "∑";
        }else if (opcion.equalsIgnoreCase("e")) {
            opcion = "";
        }else if (opcion.equalsIgnoreCase("f")) {
            opcion = "©";
        }else if (opcion.equalsIgnoreCase("g")) {
            opcion = "§";
        }else if (opcion.equalsIgnoreCase("h")) {
            opcion = "€";
        }else if (opcion.equalsIgnoreCase("i")) {
            opcion = "W";
        }else if (opcion.equalsIgnoreCase("j")) {
            opcion = "Z";
        }else{
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
        }
        return opcion;
    }
}
