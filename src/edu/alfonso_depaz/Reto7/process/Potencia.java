package edu.alfonso_depaz.Reto7.process;

import edu.alfonso_depaz.Reto7.process.Multiplicacion;

public class Potencia extends Multiplicacion {
    @Override
    public double Calcular(double n1, double n2) {
        if (n2 < 0) throw new ArithmeticException("No utilizes exponentes negativos -");
        int potencia = 1;
        for (int i = 0; i < Math.abs(n2); i++) {
            potencia = (int) super.Calcular(potencia, Math.abs(n1));
        }
        double residuo = Math.abs(n2);
        while (residuo >= 2) {
            residuo -= 2;

        }
        if (n1 < 0 && residuo != 0) {
            potencia = -potencia;
        }
        return potencia;
    }
}