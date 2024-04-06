package edu.alfonso_depaz.Reto7.process;

import edu.alfonso_depaz.Reto7.process.OperacionArimetrico;

public class Raiz extends OperacionArimetrico {
    @Override
    public double Calcular(double n1, double n2) {
        int resultado = 0;
        int i = 1;

        while (n1 > 0){
            n1 -= i;
            i += 2;
            if (n1 >= 0) resultado++;
        }
        return resultado;
    }
}
