package edu.alfonso_depaz.Evidencia1.process;

import java.util.Scanner;

public class Usuario {
    public static String id;
    public static String contraseña;

    public Usuario(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    public static void recopilar_datos_XUsuarioXContraseñaX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál va a ser el usuario?");
        id = scanner.nextLine();
        System.out.println("¿Cuál va a ser la contraseña");
        contraseña = scanner.nextLine();
    }

    public static void confirmar_usuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuario:");
        String respuesta;
        while (true) {
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase(id)){
                System.out.println("¡Usuario correcto!");
                confirmar_contraseña();
            }
            System.out.println("Usuario incorrecto");
        }
    }

    public static void confirmar_contraseña() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Contraseña:");
        String respuesta;
        while (true) {
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase(contraseña)){
                System.out.println("¡Contraseña correcta!");
                Medicamento.showMenu_medicamentos();
            }
            System.out.println("Contraseña incorrecto");
        }
    }
}