package edu.alfonso_depaz.reto4.UI;
import edu.alfonso_depaz.reto4.process.Ticket;
import java.util.Scanner;
public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio = 1250.5;
        System.out.println("Bienvenido al programa del reto 4");
        System.out.println("A Realizar venta de boleto");
        System.out.println("B Mostrar la lista de ventas");
        System.out.println("S Finalizar el programa");
        String opcion = scanner.nextLine();
        switch (opcion) {
            case "A": Ticket.registrar_Comprador();
            Ticket.registrar_Pasajeros();
            case "B":Ticket.imprimir_Pasajeros();
            case "S": System.out.println("Programa finalizado...");
                break;
        }
    }
}