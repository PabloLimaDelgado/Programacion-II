package EjercicioUno.Escuela;

import EjercicioUno.Persona.Alumno;

import java.util.ArrayList;

public class Grupo {
    private String curso;
    private char letra;
    private ArrayList<Alumno> pertenece;
    private ArrayList<Asignatura> recibe = new ArrayList<>();

    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
        this.pertenece = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Alumno> getPertenece() {
        return pertenece;
    }

    public void setPertenece(ArrayList<Alumno> pertenece) {
        this.pertenece = pertenece;
    }


    public ArrayList<Asignatura> getRecibe() {
        return recibe;
    }

    public void setRecibe(ArrayList<Asignatura> recibe) {
        this.recibe = recibe;
    }

    public void addAlumno(Alumno alumno){
        pertenece.add(alumno);
        alumno.addGrupo(this);
    }

    public void addAsignatura(Asignatura asignatura){
        recibe.add(asignatura);
        asignatura.setGrupo(this);
    }
}
