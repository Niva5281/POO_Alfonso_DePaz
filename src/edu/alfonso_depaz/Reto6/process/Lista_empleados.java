package edu.alfonso_depaz.Reto6.process;

import edu.alfonso_depaz.Reto6.data.Empleados;
import edu.alfonso_depaz.Reto6.data.categoriaEmpleados;

import java.util.ArrayList;

public class Lista_empleados {
    private static ArrayList<Empleados>ListaEmpleados;
    public Lista_empleados(ArrayList<Empleados>ListaEmpleados){
        this.ListaEmpleados=new ArrayList<>();
    }
    public static void registrarEmpleados_1(String nombre, int horasTrb, int horasExtra, long telefono, String fecha, String categoria) {
        Empleados empleados = new Empleados(nombre,horasTrb,horasExtra,telefono,fecha, categoria);
        ListaEmpleados.add(empleados);
    }
}
