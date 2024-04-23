package EjercicioUno.Persona;

import EjercicioUno.Escuela.Asignatura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Profesor extends Persona{
    private String departamento;
        private ArrayList<Asignatura> imparte = new ArrayList<>();
    public Profesor() {
    }

    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getImparte() {
        return imparte;
    }

    public void setImparte(ArrayList<Asignatura> imparte) {
        this.imparte = imparte;
    }

    public void impartirAsignatura(Asignatura asignatura){
        imparte.add(asignatura);
    }
}
