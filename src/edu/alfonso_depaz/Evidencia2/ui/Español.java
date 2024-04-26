package edu.alfonso_depaz.Evidencia2.ui;

public class Español extends Idioma{
    @Override
    public String getBienvenida() {
        return """
               Bienvenido al simulador de costo de aplicación de streaming...
               
               Porfavor ingrese sus credenciales
               """;
    }

    @Override
    public String getIngrese_Usuario() {
        return "Usuario?";
    }

    @Override
    public String getIngrese_Contrseña() {
        return "Contraseña?";
    }

    @Override
    public String getMostrar_reporteConsumo() {
        return "Reporte de consumo: ";
    }

    @Override
    public String getMostar_reporteConsumo_Nombre() {
        return "Nombre: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Tipo() {
        return ", Tipo: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Genero() {
        return ", Genero: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Estreno() {
        return ", Estreno: ";
    }

    @Override
    public String getMostrar_reporteConsumo_Verdadero() {
        return "Si";
    }

    @Override
    public String getMostrar_reporteConsumo_Falso() {
        return "No";
    }

    @Override
    public String getMostrar_estimado() {
        return "Estimado ";
    }

    @Override
    public String getMostrar_Monto() {
        return ", Su monto a pagar es: ";
    }

    @Override
    public String getMostrar_Musica() {
        return "Musica";
    }

    @Override
    public String getMostrar_Videojuego() {
        return "Videojuego";
    }

    @Override
    public String getMostrar_Libro() {
        return "Libro";
    }

    @Override
    public String getMostrar_Pelicula() {
        return "Pelicula";
    }

    @Override
    public String getMostrar_jPOP() {
        return "J-POP";
    }

    @Override
    public String getMostrar_altPOP() {
        return "alt-POP";
    }

    @Override
    public String getMostrar_Novela() {
        return "Novela";
    }

    @Override
    public String getMostrar_Tecnología() {
        return "Tecnología";
    }

    @Override
    public String getMostrar_Producto() {
        return "Producto";
    }
}
