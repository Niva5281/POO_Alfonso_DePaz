package edu.alfonso_depaz.Reto8.ui;

import edu.alfonso_depaz.Reto8.process.*;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionArimetrico operacionArimetrico = null;
        System.out.println("Welome");
        System.out.println("Select your language");
        System.out.println("1. Español");
        System.out.println("2. Enghlish");
        int idioma = scanner.nextInt();
        Idioma lenguaje;
        if(idioma==1){
            lenguaje=new Español();
        } else if (idioma==2) {
            lenguaje=new English();
        } else {
            System.out.println("X");
            return;
        }
        System.out.println(lenguaje.getBienvenido());
        System.out.println(lenguaje.getMenu_Operaciones());
        int opcion=scanner.nextInt();
        double resultado;
        switch (opcion){
            case 1: operacionArimetrico=new Suma();
            break;
            case 2: operacionArimetrico=new Resta();
            break;
            case 3: operacionArimetrico=new Multiplicacion();
            break;
            case 4: operacionArimetrico=new Division();
            break;
            case 5: operacionArimetrico=new Potencia();
            break;
            case 6: operacionArimetrico=new Raiz();
            break;
            case 7: operacionArimetrico=new Logarithm();
            break;
            default:
                System.out.println(lenguaje.getOpcion_invalido());
                return;
        }
        double n1, n2=0;
        if (opcion >= 1 && opcion <= 4) {
            System.out.println(lenguaje.getIngreseN1()); // Solicitar el primer número
            n1 = scanner.nextDouble(); // Leer el primer número
            System.out.println(lenguaje.getIngreseN2()); // Solicitar el segundo número
            n2 = scanner.nextDouble(); // Leer el segundo número
        } else if (opcion == 5) {
            System.out.println(lenguaje.getIngreseBase()); // Solicitar la base para la potencia
            n1 = scanner.nextDouble(); // Leer la base
            System.out.println(lenguaje.getIngreseExponente()); // Solicitar el exponente
            n2 = scanner.nextDouble(); // Leer el exponente
        } else {
            System.out.println(lenguaje.getIngreseNumero()); // Solicitar un número
            n1 = scanner.nextDouble(); // Leer el número
        }
        try {
            resultado=operacionArimetrico.Calcular((double) n1,(double) n2);
            System.out.println(lenguaje.getResultado()+resultado);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}