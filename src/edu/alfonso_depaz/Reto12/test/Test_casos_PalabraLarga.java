package edu.alfonso_depaz.Reto12.test;
import edu.alfonso_depaz.Reto12.process.Palabra_corta;
import edu.alfonso_depaz.Reto12.process.Palabra_larga;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_casos_PalabraLarga {
    /**
     * Pruebas generales para verificar el metodo de "Contador de palabras largas"
     */
    //Prueba con NULL
    @Test
    public void Test_PalabraLarga_Vacio(){
        String []texto={};
        String respuesta=Palabra_larga.palabra_larga(texto);
        assertEquals("",respuesta);
    }
    //Prueba con palabras iguales
    @Test
    public void Test_PalabraLarga_Iguales(){
        String [] texto={"Alfonso","Alfonso","Alfonso","Alfonso"};
        String respuesta= Palabra_corta.palabra_Corta(texto);
        assertEquals("Alfonso",respuesta);
    }
    //Prueba con una sola palabra
    @Test
    public void Test_PalabraLarga_Una(){
        String []texto={"Alfonso"};
        String respuesta=Palabra_corta.palabra_Corta(texto);
        assertEquals("Alfonso",respuesta);
    }
}
