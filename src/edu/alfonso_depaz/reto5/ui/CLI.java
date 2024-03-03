package edu.alfonso_depaz.reto5.ui;

import edu.alfonso_depaz.reto5.process.opcion_e.agregar_carrito.Parametros_producto;
import edu.alfonso_depaz.reto5.process.opcion_e.agregar_carrito.lista_productos_agregados;

import java.util.Scanner;

public class CLI {
    public static void menu_control(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoja el enunciado a evaluar");
        System.out.println("A. Pantalla de una aplicación móvil donde se muestre la lista de todas las propiedades cercanas a una ubicación geográfica, el objetivo de dicha aplicación es mejorar la búsqueda de propiedades inmobiliarias que se encuentran en venta o renta. ");
        System.out.println("B. Sistema de gestión de la cartera de cuenta habientes de un banco, cada cliente puede tener una o más cuentas bancarias asociadas. ");
        System.out.println("C. Lista de artículos del supermercado donde se guarden el nombre del producto, precio, cantidad e importe total por producto. ");
        System.out.println("D. Lista de contactos de una agenda telefónica, en la lista se guardan el nombre, dirección, teléfono de casa y teléfono de trabajo del contacto.");
        System.out.println("E. Carrito de compras de una tienda en línea, en dicho carrito se almacenen los artículos que han sido seleccionados, las cantidades requeridas, precios unitarios, IVA e importe neto de cada artículo.");
        String respuesta=scanner.nextLine();
        switch (respuesta){
            case "A":;
            case "B":;
            case "C":;
            case "D":;
            case "E":menu_E();
            default:System.out.println("Caracter incorecto, reintente");
        }
    }
    public static void menu_E(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de registros de productos");
        System.out.println("Antes de iniciar, registre la lista de productos de la tienda");

        System.out.println("A. poner productos");
        System.out.println("B. mostrar la lista de productos + el precio");
        String respuesta= scanner.nextLine();
        switch (respuesta){
            case "A":lista_productos_agregados.registrar_producto();
            case "B":lista_productos_agregados.mostrar_productos();
            default:System.out.println("Caracter incorrecto, reintente");
        }
    }
}
