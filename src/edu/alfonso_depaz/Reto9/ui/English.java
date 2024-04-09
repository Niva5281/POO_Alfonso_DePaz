package edu.alfonso_depaz.Reto9.ui;
import edu.alfonso_depaz.Reto9.ui.Idioma;
public class English extends Idioma {
    @Override
    public String Bienvenido(){
        return """
               Welcome
               
               Please select your file
               """;
    }

    @Override
    public String get_SeleccionarLibro() {
        return "Chose your book,(1-5). Use 0 to exit.";
    }

    @Override
    public String fin() {
        return "Ending the program...";
    }

    @Override
    public String get_opcionInvalida() {
        return "Invalid option";
    }

    @Override
    public String get_PalabrasMasUsadas() {
        return "The 10 more used words are";
    }
}
