package edu.alfonso_depaz.Reto8.ui;

public class English extends Idioma {

    @Override
    public String getBienvenido() {
        return "Welcome";
    }

    @Override
    public String getMenu_Operaciones() {
        return """
               Seleccione la operación:
               1. Adittion
               2. Substraction
               3. Multiplication
               4. Division
               5. Potency
               6. Root
               7. Logarithm
               """;
    }

    @Override
    public String getOpcion_invalido() {
        return "Option invalid";
    }

    @Override
    public String getIngreseN1() {
        return "Enter the number 1";
    }

    @Override
    public String getIngreseN2() {
        return "Enter the number 2";
    }

    @Override
    public String getIngreseExponente() {
        return "Enter the exponent";
    }

    @Override
    public String getIngreseBase() {
        return "Enter the base";
    }

    @Override
    public String getIngreseNumero() {
        return "Enter the number";
    }

    @Override
    public String getResultado() {
        return "Answer: ";
    }
}