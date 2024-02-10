package edu.alfonso_depaz.reto3;

import edu.alfonso_depaz.reto3.process.Diccionario;
import edu.alfonso_depaz.reto3.ui.CLI;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String palabras[]={"perro","casa","cargador","montaña","teclas","telofono","camara","tienda","basura","mochila"};
        String definicion[]={"amigo del humano","lugar para descansar","objeto para dar energia a aparatos electronicos","lugar alto","botones de una computadora","herramienta para capturar imagenes","desechos o cosas que no sirven","objeto para guardar cosas"};
        Diccionario diccionario = new Diccionario(palabras,definicion);
        CLI.showMenu(diccionario);
    }
}
