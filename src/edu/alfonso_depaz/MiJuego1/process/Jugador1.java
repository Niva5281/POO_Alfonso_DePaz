package edu.alfonso_depaz.MiJuego1.process;

public class Jugador1 {
    private String Jg1_Nombre;
    private String Cj1_Caracter;
    public Jugador1(String jg1_NombreConstructor,String cj1_CaracterConstructor){
        jg1_NombreConstructor=Jg1_Nombre;
        cj1_CaracterConstructor=Cj1_Caracter;
    }
    public String getJg1_Nombre(){
        return Jg1_Nombre;
    }
    public void setJg1_Nombre(String nuevoNombre){
        this.Jg1_Nombre=nuevoNombre;
    }
    public String getCj1_Caracter(){
        return Cj1_Caracter;
    }

    public void setCj1_Caracter(String nuevoCaracter){
        this.Cj1_Caracter=nuevoCaracter;
    }
}
