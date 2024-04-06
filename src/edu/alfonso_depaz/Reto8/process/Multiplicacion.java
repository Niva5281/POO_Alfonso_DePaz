package edu.alfonso_depaz.Reto8.process;

public class Multiplicacion extends Suma{
    @Override
    public double Calcular(double n1, double n2){
        double multiplicacion = 0;
        for (int i = 0; i < Math.abs(n2); i++){
            multiplicacion = super.Calcular(multiplicacion, Math.abs(n1));
        }
        if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0 )){
            multiplicacion=-multiplicacion;
        }
        return multiplicacion;
    }
}
