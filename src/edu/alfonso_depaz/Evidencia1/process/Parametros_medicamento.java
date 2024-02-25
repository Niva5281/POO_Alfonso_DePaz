package edu.alfonso_depaz.Evidencia1.process;

import java.util.Scanner;

public class Parametros_medicamento {
    public String nombre_registrador;
    public String fecha;
    public String nombre_quimico;
    public String nombre_generico;
    public String nombre_registrado;
    public double precio_publico;
    public double precio_venta = calcular_precioVenta();
    public String forma_farmaceutica;

    public Parametros_medicamento(String nombre_registrador,
                                  String fecha,
                                  String nombre_quimico,
                                  String nombre_generico,
                                  String nombre_registrado,
                                  double precio_publico,
                                  double precio_venta,
                                  String forma_farmaceutica){
        this.nombre_registrador=nombre_registrador;
        this.fecha=fecha;
        this.nombre_quimico = nombre_quimico;
        this.nombre_generico = nombre_generico;
        this.nombre_registrado = nombre_registrado;
        this.precio_publico = precio_publico;
        this.forma_farmaceutica = forma_farmaceutica;
    }

    public static void mostrar_medicamentos() {
    }



    public void registrarMedicamentos() {

    }

    public double calcular_precioVenta() {
        double porcentajeAdicional = 0.0;
        switch (forma_farmaceutica) {
            case "solido":
                porcentajeAdicional = 0.09;
                break;
            case "semisolido":
                porcentajeAdicional = 0.12;
                break;
            case "liquido":
                porcentajeAdicional = 0.13;
                break;
            default:
                System.out.println("Tipo de presentación inválido.");
        }
        return precio_publico * (1 + porcentajeAdicional);
    }
    public String getNombre_quimicoo() {
        return nombre_quimico;
    }

    public String getNombre_generico() {
        return nombre_generico;
    }

    public String getNombre_registradoo() {
        return nombre_registrado;
    }

    public double getPrecio_publico() {
        return precio_publico;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public String getForma_farmaceutica() {
        return forma_farmaceutica;
    }
}