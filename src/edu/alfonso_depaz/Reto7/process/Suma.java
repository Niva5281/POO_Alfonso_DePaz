package edu.alfonso_depaz.Reto7.process;

import edu.alfonso_depaz.Reto7.process.OperacionArimetrico;

public class Suma extends OperacionArimetrico {
    @Override
    public double Calcular(double n1, double n2) {
        return n1+n2;
    }
}