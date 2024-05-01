package edu.alfonso_depaz.Reto12.test;

import edu.alfonso_depaz.Reto12.process.LeerTexto;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test_casos_LeerTexto {
    /**
     * Apartado para verificar los metodos
     */
    //Prueba en caso de que el archivo no este vacio
    @Test
    public void Test_casos_LeerTexto_NotNull(){
        String resultado= LeerTexto.Leer("Libro_1.txt");
        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
    }
    //Prueba en caso de que el archivo si este vacio
    @Test
    public void Test_casos_LeerTexto_Null(){
        String resultado=LeerTexto.Leer("VACIO");
        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
    }
}
