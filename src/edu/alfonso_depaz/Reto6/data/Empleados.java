package edu.alfonso_depaz.Reto6.data;

import edu.alfonso_depaz.Reto6.process.Lista_empleados;
import edu.alfonso_depaz.Reto6.ui.CLI;

import java.util.Scanner;

import static edu.alfonso_depaz.Reto6.process.Lista_empleados.registrarEmpleados_1;

public class Empleados {
    String nombre;
    int horasTrabajados;
    int horasTrabajados_extra;
    long telefono;
    String fecha;
    String categoria;
    public Empleados(String nombre, int horasTrabajados, int horasTrabajados_extra, long telefono, String fecha, String categoria){
        this.nombre=nombre;
        this.horasTrabajados=horasTrabajados;
        this.horasTrabajados_extra=horasTrabajados_extra;
        this.telefono=telefono;
        this.fecha=fecha;
        this.categoria=categoria;
    }
    public static void registrarEmpleados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al registro de empleados");
        System.out.println("Para finalizar ponga FIN");
        while(true){
            System.out.println("Ingrese el nombre del empleado");
            String nombre=scanner.nextLine();
            condicional_regresar_menu(nombre);
            System.out.println("Guardando...");
            System.out.println(nombre);
            System.out.println("Ingrese las horas trabajadas del empleado: "+nombre);
            int horas_trb= Integer.parseInt(scanner.nextLine());
            condicional_regresar_menu(String.valueOf(horas_trb));
            System.out.println("Guardando...");
            System.out.println(horas_trb);
            System.out.println("horas extra: "+nombre);
            int horas_extra= Integer.parseInt(scanner.nextLine());
            condicional_regresar_menu(String.valueOf(horas_extra));
            System.out.println("Guardando..");
            System.out.println(horas_extra);
            System.out.println("Ingrese el telefono del:"+nombre);
            long telefono= Long.parseLong(scanner.nextLine());
            condicional_regresar_menu(String.valueOf(telefono));
            System.out.println("Guardando...");
            System.out.println(telefono);
            System.out.println("Fecha de nacimiento:"+nombre);
            System.out.println("La fecha debe ser guardada como el siguiente ejemplo...");
            System.out.println("27 Septiembre 2015");
            String fecha=scanner.nextLine();
            condicional_regresar_menu(fecha);
            System.out.println("Guardando...");
            System.out.println(fecha);
            System.out.println("Ingrese la categoria dele empleado");
            System.out.println("Las categorias siguientes son...");
            System.out.println("Empleado_ventas");
            System.out.println("Gerente");
            System.out.println("Administrador");
            String categoria=scanner.nextLine();
            condicional_regresar_menu(categoria);
            categoriaEmpleados.calcular_categoria(categoria);

            Lista_empleados.registrarEmpleados_1(nombre,horas_trb,horas_extra,telefono,fecha,categoria);
        }
    }
    public static void condicional_regresar_menu(String respuesta){
        if (respuesta.equalsIgnoreCase("FIN")){
            System.out.println("regresando al programa");
            CLI.show_Menu();
        }
    }
}
