package Herencia;

public class Oficial extends Operario{
    private int cantEmpleadosVigilar;

    public Oficial() {
    }

    public Oficial(String nombre, String areaTrabajo, int cantEmpleadosVigilar) {
        super(nombre, areaTrabajo);
        this.cantEmpleadosVigilar = cantEmpleadosVigilar;
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

    public int getCantEmpleadosVigilar() {
        return cantEmpleadosVigilar;
    }

    public void setCantEmpleadosVigilar(int cantEmpleadosVigilar) {
        this.cantEmpleadosVigilar = cantEmpleadosVigilar;
    }

    public void entrarAreaTrabajo(){
        System.out.println("Entre a trabajar como oficial");
    }

    public String toString(){
        return "Nombre: " + nombre + ". Area de trabajo: "+ areaTrabajo + ". Cantidad de empleados que controla: " + cantEmpleadosVigilar;
    }
}
