package edu.alfonso_depaz.Reto7.ui;

import edu.alfonso_depaz.Reto7.process.*;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionArimetrico operador = null;
        System.out.println("Bienvenido");
        System.out.println("""
               Seleccione la operación:
               1. Suma
               2. Resta
               3. Multiplicación
               4. División
               5. Potencia
               6. Raíz
               7. Logaritmo
               """);
        int opcion=scanner.nextInt();
        double resultado;
        switch (opcion){
            case 1: operador = new Suma();
            break;
            case 2: operador = new Resta();
            break;
            case 3: operador = new Multiplicacion();
            break;
            case 4: operador = new Division();
            break;
            case 5: operador = new Potencia();
            break;
            case 6: operador = new Raiz();
            break;
            case 7: operador = new Logarithm();
            break;
            default:
                System.out.println("Opción invalido, porfavor ingrese el numero correcto");
                return;
        }
        double n1, n2=0;
        if (opcion >= 1 && opcion <= 4) {
            System.out.println("Porfavor ingrese el numero 1"); // Solicitar el primer número
            n1 = scanner.nextDouble(); // Leer el primer número
            System.out.println("Porvavor ingrese el numero 2"); // Solicitar el segundo número
            n2 = scanner.nextDouble(); // Leer el segundo número
        } else if (opcion == 5) {
            System.out.println("Porfavor ingrese la Base"); // Solicitar la base para la potencia
            n1 = scanner.nextDouble(); // Leer la base
            System.out.println("Porfavor ingrese el exponente"); // Solicitar el exponente
            n2 = scanner.nextDouble(); // Leer el exponente
        } else {
            System.out.println("Porfavor ingrese el numero"); // Solicitar un número
            n1 = scanner.nextDouble(); // Leer el número
        }
        try {
            resultado=operador.Calcular((double) n1,(double) n2);
            System.out.println("El resultado es: "+resultado);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}