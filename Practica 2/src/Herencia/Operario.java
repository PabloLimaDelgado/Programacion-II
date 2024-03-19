package Herencia;

public class Operario extends Empleado{
    protected String areaTrabajo;

    public Operario() {
    }

    public Operario(String nombre, String areaTrabajo) {
        super(nombre);
        this.areaTrabajo = areaTrabajo;
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

    public void entrarAreaTrabajo(){
        System.out.println("Entre a trabajar");
    }

    public String toString(){
        return super.toString() + ". Area de trabajo: "+areaTrabajo;
    }
}
