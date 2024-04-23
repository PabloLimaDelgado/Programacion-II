package EjercicioUno.Persona;

import EjercicioUno.Escuela.Grupo;

import java.util.ArrayList;

public class Alumno extends Persona{
    private ArrayList<Grupo> cursos;
    public Alumno() {
    }

    public Alumno(int dni, String nombre) {
        super(dni, nombre);
        this.cursos = new ArrayList<>();
    }

    public ArrayList<Grupo> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Grupo> cursos) {
        this.cursos = cursos;
    }

    public void addGrupo(Grupo grupo){
        cursos.add(grupo);
    }
}
