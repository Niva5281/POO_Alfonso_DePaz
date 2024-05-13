package edu.alfonso_depaz.MiJuego1.process;

import edu.alfonso_depaz.MiJuego1.data.CPU;
import edu.alfonso_depaz.MiJuego1.data.Jugador;
import edu.alfonso_depaz.MiJuego1.data.SalonDeLaFama;
import edu.alfonso_depaz.MiJuego1.process.metodos.jugadores.Metodo_RegistroDatos_Jugador1_V1;
import edu.alfonso_depaz.MiJuego1.process.metodos.jugadores.Metodo_RegistroDatos_Jugador2_V1;
import edu.alfonso_depaz.MiJuego1.process.metodos.jugadores.Metodos_Jugadores;
import edu.alfonso_depaz.MiJuego1.ui.CLI;
import edu.alfonso_depaz.MiJuego1.ui.Idioma;

import java.util.Random;
import java.util.Scanner;

public class Partida {
    //Se invocan los objetos
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    private char turno;
    private CPU cpu;
    public Partida(){
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.tablero = new Tablero();
        this.turno = ' ';
        this.cpu = new CPU('O');
    }
    public void inicializar(Scanner scanner, Idioma lenguaje) {
        //Se invoca el metodo y apunta al jugador 1
        CLI cli=new CLI();
        Metodos_Jugadores metodosJugadores=new Metodo_RegistroDatos_Jugador1_V1();
        String jg1=null;
        jg1= CLI.leerJg1(jg1,metodosJugadores,lenguaje);

        // Jugador 2
        metodosJugadores=new Metodo_RegistroDatos_Jugador2_V1();
        String jg2=null;
        jg2 =CLI.leerJg2(jg2,metodosJugadores,lenguaje);

        //Condicional para obtener diferentes nombres de jugadores
        while(jg1.equals(jg2)){
            scanner = new Scanner(System.in);
            System.out.println(lenguaje.get_Error_JugadoresIguales());
            System.out.println(lenguaje.get_Entrada_CambiarNombreJugadorV());
            int opcion=scanner.nextInt();
            if(opcion==1) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador1_V1();
                jg1=CLI.leerJg1(jg1, metodosJugadores, lenguaje);
            } else if (opcion==2) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador2_V1();
                jg2=CLI.leerJg2(jg2, metodosJugadores,lenguaje);
            } else {
                System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
            }
        }
        //Se apunta al jugador 1 para registrar el caracter que quiera
        metodosJugadores= new Metodo_RegistroDatos_Jugador1_V1();
        String cj1=null;
        cj1=CLI.leerCj1(cj1,metodosJugadores, lenguaje);
        System.out.println(lenguaje.get_Salida_Confirmación_CaracterRegistrado()+cj1);

        //Se apunta al jugador 2
        metodosJugadores=new Metodo_RegistroDatos_Jugador2_V1();
        String cj2=null;
        cj2= metodosJugadores.Guardar_CaracteresJugadores_V1(cj2,lenguaje);

        while(cj1==cj2){
            scanner=new Scanner(System.in);
            System.out.println(lenguaje.get_Error_CaracteresIguales());
            System.out.println(lenguaje.get_Entrada_CambiarCaracterJugador());
            int opcion=scanner.nextInt();
            if(opcion==1) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador1_V1();
                cj1=CLI.leerCj1(cj1, metodosJugadores, lenguaje);
            } else if (opcion==2) {
                metodosJugadores = new Metodo_RegistroDatos_Jugador2_V1();
                cj2=CLI.leerCj2(cj2, metodosJugadores,lenguaje);
            } else {
                System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
            }
        }
        //Se cambian las variables de caracteres por tipo char

        char cj1_char=cj1.charAt(0);
        char cj2_char=cj2.charAt(0);

        //Hecho el filtro, se agregan los datos a los jugadores
        jugador1.setJg_Nombre(jg1);
        jugador1.setCj_Caracter(cj1_char);
        jugador2.setJg_Nombre(jg2);
        jugador2.setCj_Caracter(cj2_char);

        System.out.println(jugador1.getJg_Nombre());
        System.out.println(jugador1.getCj_Caracter());
        System.out.println(jugador2.getJg_Nombre());
        System.out.println(jugador2.getCj_Caracter());
        // Asignar turnos
        Random rand = new Random();
        int random = rand.nextInt(2);
        turno = random == 0 ? jugador1.getCj_Caracter() : jugador2.getCj_Caracter();
    }
    public void realizarJugada_V1(Scanner scanner, CLI cli) {
        Jugador jugadorActual = turno == jugador1.getCj_Caracter() ? jugador1 : jugador2;
        tablero.mostrar();
        System.out.println("Turno de " + jugadorActual.getJg_Nombre()+ " (" + jugadorActual.getCj_Caracter() + ") ");
        if (jugadorActual == jugador1) {
            System.out.println("Choose row and column / Elige fila y columna (e.g., 1 2):"); // Agregamos un mensaje explicativo
            System.out.println("Fila:");
            int fila = scanner.nextInt();
            System.out.println("Columna:");
            int columna = scanner.nextInt();
            if (tablero.verificarCasilla(fila, columna)) {
                tablero.marcarCasilla(fila, columna, jugadorActual.getCj_Caracter());
                turno = jugador2.getCj_Caracter();
            } else {
                System.out.println("That cell is already occupied / Esa celda ya está ocupada");
            }
        } else {
            cpu.marcarCasillaRandom(tablero);
            turno = jugador1.getCj_Caracter();
        }
    }
    public void realizarJugada_V2(Scanner scanner, CLI cli,Idioma lenguaje) {
        Jugador jugadorActual = (turno == jugador1.getCj_Caracter()) ? jugador1 : jugador2;
        tablero.mostrar();
        System.out.println(lenguaje.get_Salida_TurnoDe() + jugadorActual.getJg_Nombre()+ " (" + jugadorActual.getCj_Caracter() + ")");
        if (jugadorActual == jugador1) {
            System.out.println(lenguaje.get_Salida_EscojerFilasyColumnas()); // Agregamos un mensaje explicativo
            System.out.println(lenguaje.get_Entrada_ObtenerFilas());
            int fila = scanner.nextInt();
            System.out.println(lenguaje.get_Entrada_ObtenerColumnas());
            int columna = scanner.nextInt();
            if (tablero.verificarCasilla(fila, columna)) {
                tablero.marcarCasilla(fila, columna, jugadorActual.getCj_Caracter());
                turno = jugador2.getCj_Caracter();
            } else {
                System.out.println(lenguaje.get_Salida_CeldaOcupada());
            }
        }
        if (jugadorActual == jugador2) {
            System.out.println(lenguaje.get_Salida_EscojerFilasyColumnas()); // Agregamos un mensaje explicativo
            System.out.println(lenguaje.get_Entrada_ObtenerFilas());
            int fila = scanner.nextInt();
            System.out.println(lenguaje.get_Entrada_ObtenerColumnas());
            int columna = scanner.nextInt();
            if (tablero.verificarCasilla(fila, columna)) {
                tablero.marcarCasilla(fila, columna, jugadorActual.getCj_Caracter());
                turno = jugador1.getCj_Caracter();
            } else {
                System.out.println(lenguaje.get_Salida_CeldaOcupada());
            }
        }
    }
    public void jugar_JugadorVsCpu(Scanner scanner, CLI cli, Idioma lenguaje) {
        boolean jugarDeNuevo = true;
        while (jugarDeNuevo) {
            inicializar(scanner, lenguaje);
            while (!tablero.verificarGanador()) {
                realizarJugada_V1(scanner, cli);
            }
            tablero.mostrar();
            String ganador = tablero.obtenerGanador();
            if (ganador.equals("Empate")) {
                System.out.println(lenguaje.get_Salida_Empate());
            } else {
                Jugador jugadorGanador = ganador.equals(String.valueOf(jugador1.getCj_Caracter())) ? jugador1 : jugador2;
                jugadorGanador.aumentarVictorias();
                System.out.println(jugadorGanador.getJg_Nombre() + " " + lenguaje.get_Salida_Ganador());
                tablero.vaciarCasillas();
            }
            int opcion = cli.mostrarMenuReinicio(lenguaje);
            jugarDeNuevo = opcion == 1;
        }
    }
    public void jugar_JugadorVsJugador(Scanner scanner, CLI cli, Idioma lenguaje) {
        boolean jugarDeNuevo = true;
        while (jugarDeNuevo) {
            inicializar(scanner, lenguaje);
            while (!tablero.verificarGanador()) {
                realizarJugada_V2(scanner, cli,lenguaje);
            }
            tablero.mostrar();
            String ganador = tablero.obtenerGanador();
            if (ganador.equals(lenguaje.get_Salida_Empate())) {
                System.out.println(lenguaje.get_Salida_Empate());
            } else {
                Jugador jugadorGanador = ganador.equals(String.valueOf(jugador1.getCj_Caracter())) ? jugador1 : jugador2;
                jugadorGanador.aumentarVictorias();
                System.out.println(jugadorGanador.getJg_Nombre() + " " + lenguaje.get_Salida_Ganador());
                tablero.vaciarCasillas();
            }
            int opcion = cli.mostrarMenuReinicio(lenguaje);
            jugarDeNuevo = opcion == 1;
            opcion = SalonDeLaFama.mostrarMenuSalonDeLaFama(scanner);
        }
    }
}