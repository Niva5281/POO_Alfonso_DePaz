package edu.alfonso_depaz.Reto6.data;

import java.util.Scanner;

public class categoriaEmpleados {
    static String categoria;
    int sueldo_baseCategoria;
    int pagoXHoraextra;
    public categoriaEmpleados(String categoria, String claveCategoria, int sueldo_baseCategoria, int pagoXHoraextra){
        this.categoria=categoria;
        this.sueldo_baseCategoria=sueldo_baseCategoria;
        this.pagoXHoraextra=pagoXHoraextra;
    }
    public static void calcular_categoria(String categoria){
        Scanner scanner = new Scanner(System.in);
        switch (categoria){
            case "Empleado_ventas":System.out.println("Categoria escogida: EMPLEADO DE VENTAS");
            case "Administrador": System.out.println("Categoria escogida: ADMINISTRADOR");
            case "Gerente":System.out.println("Categoria escogida: GERENTE");
            default:System.out.println("El caracter registrado es invalido, porfavor registrelo exactamante igual:");
            System.out.println("Empleado_venats");
            System.out.println("Administrador");
            System.out.println("Gerente");
            categoria=scanner.nextLine();
        }
    }
}
