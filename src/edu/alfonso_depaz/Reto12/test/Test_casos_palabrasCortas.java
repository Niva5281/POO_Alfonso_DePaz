package edu.alfonso_depaz.Reto12.test;

import edu.alfonso_depaz.Reto12.process.Palabra_corta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_casos_palabrasCortas {
    /**
     * Pruebas para los metodos que se obtiene las palabras mas cortas
     */
    @Test
    public void test_PalabraMasCorta(){
        String[] palabras={"Aguila","Par","Telefono","videojuego","camara"};
        String resultado= Palabra_corta.palabra_Corta(palabras);
        assertEquals("Par", resultado);
    }
    /**
     * Prueba para obtener la palabra mas corta en caso de solo tener solo una palabra
     */
    @Test
    public void test_PalabraMasCorta_Una(){
        String[] palabras={"Piano"};
        String resultado=Palabra_corta.palabra_Corta(palabras);
        assertEquals("Piano",resultado);
    }

    /**
     * Prueba para obtener la palabra mas corta en caso de tener muchas palabras iguales
     */
    @Test
    public void test_PalabraMasCorta_Iguales(){
        String [] palabras={"Piano","Piano","Piano"};
        String resultado=Palabra_corta.palabra_Corta(palabras);
        assertEquals("Piano",resultado);
    }

    /**
     * Prueb apara obtener NULL en caso de no tener ni una palabra
     */
    @Test
    public void test_PalabraMasCorta_Vacio(){
        String [] palabras={};
        String resultado=Palabra_corta.palabra_Corta(palabras);
        assertEquals(null,resultado);
    }
}
