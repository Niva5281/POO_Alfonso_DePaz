package edu.alfonso_depaz.Reto6.ui;
import java.util.Scanner;

import edu.alfonso_depaz.Reto6.data.Empleados;
import edu.alfonso_depaz.Reto6.process.Lista_empleados;

public class CLI {
    public static void ella(){
        show_Menu();
    }
    public static void show_Menu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bienvenido al programa de registros de empleados");
        System.out.println("A continuación le mostraremos el menu");
        System.out.println("-------------------------------------------------");
        System.out.println("A. Agregar empleados");
        System.out.println("B. Modificar empleados");
        System.out.println("C. Mostrar datos de empleados");
        System.out.println("D. Finalizar el programa");
        System.out.println("-------------------------------------------------");
        String respuesta=scanner.nextLine();
        switch (respuesta){
            case "A": Empleados.registrarEmpleados();
            default: System.out.println("Caracter invalido, porfavor incerte los siguientes caracteres...");
            System.out.println("A B C D");
        }
    }
}
