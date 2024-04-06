package edu.alfonso_depaz.Reto8.ui;

public class Español extends Idioma{
    @Override
    public String getBienvenido() {
        return "Bienvenido";
    }

    @Override
    public String getMenu_Operaciones() {
        return """
               Seleccione la operación:
               1. Suma
               2. Resta
               3. Multiplicación
               4. División
               5. Potencia
               6. Raíz
               7. Logaritmo
               """;
    }

    @Override
    public String getOpcion_invalido() {
        return "Opcion no valido";
    }

    @Override
    public String getIngreseN1() {
        return "Ingrese el primer numero";
    }

    @Override
    public String getIngreseN2() {
        return "Ingrese el segundo numero";
    }

    @Override
    public String getIngreseExponente() {
        return "Ingrese el exponente";
    }

    @Override
    public String getIngreseBase() {
        return "Ingrese la base";
    }

    @Override
    public String getIngreseNumero() {
        return "Ingrese el numero";
    }

    @Override
    public String getResultado() {
        return "El resultado es: ";
    }
}
