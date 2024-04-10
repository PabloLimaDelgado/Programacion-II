package EjersicioDos;

import java.util.ArrayList;

public class Libro {
    private String nombreLibro;
    private ArrayList<Persona> personasLoTiene = new ArrayList<>();

    public Libro() {
    }

    public Libro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public ArrayList<Persona> getPersonasLoTiene() {
        return personasLoTiene;
    }

    public void setPersonasLoTiene(Persona personaLoTiene) {
        personasLoTiene.add(personaLoTiene);
        //personaLoTiene.setLibrosTiene(this);
    }
}
