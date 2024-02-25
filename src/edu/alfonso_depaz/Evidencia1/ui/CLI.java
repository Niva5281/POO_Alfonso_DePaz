package edu.alfonso_depaz.Evidencia1.ui;

import edu.alfonso_depaz.Evidencia1.process.Parametros_medicamento;
import edu.alfonso_depaz.Evidencia1.process.Usuario;

import java.util.ArrayList;
import java.util.Scanner;
public class CLI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Usuario.recopilar_datos_XUsuarioXContraseñaX();
        Usuario.confirmar_usuario();
    }
}
