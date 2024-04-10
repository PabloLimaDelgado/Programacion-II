package EjersicioDos;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Libro> librosTiene = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosTiene() {
        return librosTiene;
    }

    public void setLibrosTiene(Libro librosTengo) {
        librosTiene.add(librosTengo);
        librosTengo.setPersonasLoTiene(this);
    }
}
