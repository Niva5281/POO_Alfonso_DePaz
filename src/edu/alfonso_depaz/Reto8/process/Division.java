package edu.alfonso_depaz.Reto8.process;

public class Division extends Resta{
    @Override
    public double Calcular(double n1, double n2) {
        double division = 0;
        double residuo = Math.abs(n1);
        while (residuo >= Math.abs(n2)){
            residuo = super.Calcular(residuo, n2);
            division++;

            if (n2 == 0){
                throw new ArithmeticException("No se puede dividir entre cero");
            }
        }
        if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)){
            division = -division;
        }
        return division;
    }
}
