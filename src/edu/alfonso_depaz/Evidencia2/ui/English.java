package edu.alfonso_depaz.Evidencia2.ui;

public class English extends Idioma{
    @Override
    public String getBienvenida() {
        return """
               Welcome to the streaming app cost simulator...
               
               Please enter your credentials
               """;
    }

    @Override
    public String getIngrese_Usuario() {
        return "User?";
    }

    @Override
    public String getIngrese_Contrseña() {
        return "Password?";
    }

    @Override
    public String getMostrar_reporteConsumo() {
        return "Consumption report: ";
    }

    @Override
    public String getMostar_reporteConsumo_Nombre() {
        return "Name: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Tipo() {
        return ", Type:";
    }

    @Override
    public String getMostrar_reporteConsumo_Genero() {
        return ", Gender: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Estreno() {
        return ", Premiere: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Verdadero() {
        return "Yes";
    }

    @Override
    public String getMostrar_reporteConsumo_Falso() {
        return "No";
    }

    @Override
    public String getMostrar_estimado() {
        return "Dear: ";
    }

    @Override
    public String getMostrar_Monto() {
        return ", Your amount to pay is:";
    }

    @Override
    public String getMostrar_Musica() {
        return "Music";
    }

    @Override
    public String getMostrar_Videojuego() {
        return "Videogame";
    }

    @Override
    public String getMostrar_Libro() {
        return "Book";
    }

    @Override
    public String getMostrar_Pelicula() {
        return "Movie";
    }

    @Override
    public String getMostrar_jPOP() {
        return "J-POP";
    }

    @Override
    public String getMostrar_altPOP() {
        return "ALT-POP";
    }

    @Override
    public String getMostrar_Novela() {
        return "Novel";
    }

    @Override
    public String getMostrar_Tecnología() {
        return "Tecnology";
    }

    @Override
    public String getMostrar_Producto() {
        return "Product";
    }
}
