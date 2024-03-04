package edu.alfonso_depaz.reto5.process.opcion_c;
public class ImporteTotalArticulo {
    public double calcularImporteTotal(ArticulosSuper articulo) {
        return articulo.getPrecio() * articulo.getCantidad();
    }
}