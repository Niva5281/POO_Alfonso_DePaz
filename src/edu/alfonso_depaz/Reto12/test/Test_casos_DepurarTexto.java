package edu.alfonso_depaz.Reto12.test;

import edu.alfonso_depaz.Reto12.process.Depurar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_casos_DepurarTexto {
    /**
     * Apartado donde se realizan pruebas para los metodos de depuración de los textos
     */
    @Test
    public void testDepurarTexto(){
        String texto="¡Hola, cómo estás?";
        String resultado= Depurar.depurar(texto);
        assertEquals("hola c\u00f3mo est\u00e1s", resultado);
    }
}
