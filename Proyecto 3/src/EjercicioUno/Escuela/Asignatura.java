package EjercicioUno.Escuela;


import EjercicioUno.Persona.Profesor;

import java.util.HashSet;
import java.util.Set;

public class Asignatura {
    private int aula;
    private String hora;
    private String nombre;
    private Grupo grupo;

    public Asignatura(){

    }

    public Asignatura(int aula, String hora, String nombre) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
