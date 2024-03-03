package edu.alfonso_depaz.reto5.process.opcion_e.agregar_carrito;

import edu.alfonso_depaz.reto5.ui.CLI;

import java.util.ArrayList;
import java.util.Scanner;

public class lista_productos_agregados {
    public static ArrayList<Parametros_producto> lista_producto;
    public lista_productos_agregados(ArrayList<Parametros_producto>lista_producto){
        this.lista_producto= new ArrayList<>();
    }
    public static void registrar_producto() {
        System.out.println("Ingrese los productos que quiera para agregar al carrito");
        System.out.println("Para regresar, ponga FIN");
        String respuesta;
        while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("¿Cuál es el producto?");
            respuesta=scanner.nextLine();
            condicional_productos(respuesta);
            System.out.println("Guardando el producto...");
            String nombre=respuesta;
            System.out.println(nombre);
            System.out.println("Precio:");
            respuesta=scanner.nextLine();
            condicional_productos(respuesta);
            System.out.println("Guardando el precio...");
            double precio= Double.parseDouble(respuesta);
            System.out.println(precio);
            System.out.println("Cantidad");
            respuesta=scanner.nextLine();
            condicional_productos(respuesta);
            System.out.println("Guardando cantidad...");
            int cantidad = Integer.parseInt(respuesta);
            System.out.println(cantidad);
            System.out.println("Guardando datos del producto...");
            agregar_parametros_producto(precio,cantidad,nombre);
        }
    }
    public static void agregar_parametros_producto(double precio, int cantidad,String nombre){
        Parametros_producto parametros_producto = new Parametros_producto(precio,cantidad,nombre);
        lista_producto.add(parametros_producto);
    }
    public static void condicional_productos(String respuesta){
        if (respuesta.equalsIgnoreCase("FIN")){
            System.out.println("Regresando al menu");
            CLI.menu_E();
        }
    }
    public static void mostrar_productos(){
        for(int i=0; i<lista_producto.size();i++){
            System.out.println("producto:");
            System.out.println(Parametros_producto.nombre);
            System.out.println("parametros del producto:");
            System.out.println(Parametros_producto.cantidad);
            System.out.println(Parametros_producto.precio);
            System.out.println(Parametros_producto.IVA);
        }
    }

}