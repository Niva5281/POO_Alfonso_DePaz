package edu.alfonso_depaz.Reto12.test;

import edu.alfonso_depaz.Reto11.process.Palabras_impares;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Test_casos_PalabrasImpares {
/**
 * Apartado para la verificción del metodo del contador de palabras impares
 */
//Pruebas con una serie de palabras palabra
    @Test
    public void Test_casos_PalabrasImpares_MuchasPalabras(){
        String []texto={"Alfonso","Gamaliel","Telefono","Daniela"};
        String [] respuesta = Palabras_impares.palabras_Impares(texto);
        assertArrayEquals(new String[]{"Alfonso","Daniela"},respuesta);
    }
}