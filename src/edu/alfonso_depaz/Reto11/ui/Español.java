package edu.alfonso_depaz.Reto11.ui;

import edu.alfonso_depaz.Reto9.ui.Idioma;

public class Español extends Idioma {
    @Override
    public String Bienvenido() {
        return """
               Bienvenido
               
               Seleccione su archivo...
               """;
    }
    @Override
    public String get_SeleccionarLibro() {
        return "Escoja su libro (1-5), Use el 0 para salir";
    }

    @Override
    public String fin() {
        return "Finalizando el programa";
    }

    @Override
    public String get_opcionInvalida() {
        return "Opción invalida";
    }

    @Override
    public String get_PalabrasMasUsadas() {
        return "Las 10 palabras mas usadas son";
    }
}