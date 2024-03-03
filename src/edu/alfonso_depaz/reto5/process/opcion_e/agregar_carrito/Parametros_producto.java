package edu.alfonso_depaz.reto5.process.opcion_e.agregar_carrito;

public class Parametros_producto {
    public static String nombre;
    public static double precio;
    public static int cantidad;
    public static double IVA;
    public Parametros_producto(double precio, int cantidad, String nombre){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.IVA=calcular_IVA();
    }
    private double calcular_IVA() {
        IVA=precio/1.1;
        return IVA;
    }
    public double getPrecio(){
        return precio;
    }
    public double getCantidad(){
        return cantidad;
    }
    public double getIVA(){
        return IVA;
    }
    public String getNombre(){
        return nombre;
    }
}
