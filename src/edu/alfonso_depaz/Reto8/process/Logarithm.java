package edu.alfonso_depaz.Reto8.process;

public class Logarithm extends Multiplicacion{
    @Override
    public double Calcular(double n1, double n2) {
        if (n1 <= 1 || n2 <= 0) throw new ArithmeticException(" El logaritmo no esta definido" +
                "para los valores proporcionados");
        int logaritmo = 1;
        int multiplicacion;
        int potenciaBase = (int) n2;

        while (potenciaBase <= n1) {
            multiplicacion = (int) super.Calcular(potenciaBase, n2);
            potenciaBase += multiplicacion;
            logaritmo++;

        }
        int potencia = 1;
        for (int i = 0; i < logaritmo; i++){
            potencia = (int) super.Calcular(potencia, n2);
        }
        if (potencia != n1){
            System.out.println("Este logaritmo es un aproximado del resultado"+
                    "entero mas que se aproxima a su logaritmo");
            System.out.println("El argumento exato que se cumple este logaritmo es: " + potencia);
        }
        return logaritmo;
    }
}
