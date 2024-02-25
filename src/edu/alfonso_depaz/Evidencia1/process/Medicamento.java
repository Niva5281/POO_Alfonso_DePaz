package edu.alfonso_depaz.Evidencia1.process;

import java.util.ArrayList;
import java.util.Scanner;

public class Medicamento {
    public ArrayList<Parametros_medicamento>listaMedicamento;
    public Medicamento(){
        this.listaMedicamento=new ArrayList<>();
    }

    public static void showMenu_medicamentos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("A. registrar medicamentos");
        System.out.println("B. mostrar la lista de medicamentos y eliminar o modificar medicamentos");
        System.out.println("C. abandonar el programa");
        String opcion = scanner.nextLine();
        switch (opcion) {
            case "A":registrar_parametrosMedicamento();
            case "B":
                mostrar_medicamentos();
                ;
            case "C":
                ;
            default:
                System.out.println("caracter invalido, reintente nuevamente");
        }
    }
    public void registrarMedicamentos(String nombre_registrador,
                                      String fecha,
                                      String nombre_quimico,
                                      String nombre_generico,
                                      String nombre_registrado,
                                      String precio_publico,
                                      String forma_farmaceutica,){
        Parametros_medicamento parametros_medicamento = new Parametros_medicamento(nombre_registrador,fecha,nombre_quimico,nombre_generico,nombre_registrado,precio_publico,forma_farmaceutica)
    }
    public static void registrar_parametrosMedicamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registre los parametros de sus medicamentos...");
        System.out.println("Para parar ponga FIN");
        String respuesta;
        while(true) {
            System.out.println("Nombre del registrador:");
            String nombre_registrador=scanner.nextLine();
            System.out.println("fecha:");
            String fecha=scanner.nextLine();
            System.out.println("Lista:"+Medicamento.);
            System.out.println("Nombre químico:");
            respuesta = scanner.nextLine();
            condicional_FIN(respuesta);
            String nombre_quimico=respuesta;
            System.out.println("Nombre genérico:");
            respuesta= scanner.nextLine();
            condicional_FIN(respuesta);
            String nombre_generico=respuesta;
            System.out.println("Nombre registrado:");
            respuesta= scanner.nextLine();
            condicional_FIN(respuesta);
            String nombre_registrado=respuesta;
            System.out.println("Precio al público:");
            respuesta= String.valueOf(scanner.nextDouble());
            condicional_FIN(respuesta);
            String precio_publico= respuesta;
            System.out.println("Tipo de presentación (solido, semisolido, liquido):");
            respuesta= scanner.nextLine();
            String forma_farmaceutica=respuesta;
            System.out.println("Lista de medicamentos:"+Medicamento+"regisstrado exitosamente");
            registrarMedicamentos(nombre_registrador,fecha,nombre_quimico,nombre_generico,nombre_registrado,
                    precio_publico,forma_farmaceutica, precio_venta);
        }
    }
    public void condicional_FIN(String respuesta){
        if(respuesta.equalsIgnoreCase("FIN")){
            System.out.println("Regresando al menu...");
            Medicamento.showMenu_medicamentos();
        }
    }
}
