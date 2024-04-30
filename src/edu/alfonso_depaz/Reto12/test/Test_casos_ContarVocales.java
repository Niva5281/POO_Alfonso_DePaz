package edu.alfonso_depaz.Reto12.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_casos_ContarVocales {
    /**
     * Pruebas para verificar los metodos de conteo
     */
    @Test
    public void Test_ContarVocales(){
        String texto="Hola, soy Alfonso";
        int resultado=edu.alfonso_depaz.Reto12.process.Contar_Vocales.contar(texto);
        assertEquals(6, resultado);
    }
    @Test
    public void Test_ContarVocales_Consonantes(){
        String texto="bcnvmxzbvncmxz";
        int resultado=edu.alfonso_depaz.Reto12.process.Contar_Vocales.contar(texto);
        assertEquals(0,resultado);
    }
    @Test
    public void Test_ContarVocales_SoloVocales(){
        String texto="aeiou";
        int resultado=edu.alfonso_depaz.Reto12.process.Contar_Vocales.contar(texto);
        assertEquals(5,resultado);
    }
}