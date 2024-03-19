package Herencia;

public class Tecnico extends Operario{
    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(String nombre, String areaTrabajo, String especialidad) {
        super(nombre, areaTrabajo);
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void entrarAreaTrabajo(){
        System.out.println("Entre a trabajar como tecnico");
    }

    public String toString(){
        return "Nombre: " + nombre + ". Area de trabajo: "+ areaTrabajo + ". Especialidad: " + especialidad;
    }
}
