package edu.alfonso_depaz.reto5.process.opcion_d;
import java.util.ArrayList;
import java.util.List;

public class ListaContactos {
    private List<Contacto> contactos;

    public ListaContactos() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null; // Si no se encuentra el contacto
    }
}