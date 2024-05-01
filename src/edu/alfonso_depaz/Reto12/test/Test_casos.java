package edu.alfonso_depaz.Reto12.test;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test_casos {
    /**
     * Este apartado corresponde a una prueba del conteo de las palabras. Se utilizara una palabra para comprobar
     * el metodo utilizado.
     */
    @Test
    public void testMain_PalabraSimple(){
        String texto="Hi";
        String[] resultado = edu.alfonso_depaz.Reto12.process.Contar_Palabras.contar
                (edu.alfonso_depaz.Reto12.process.Separar.separar(texto));
        assertArrayEquals(new String[]{"Hi"}, resultado);
    }
}