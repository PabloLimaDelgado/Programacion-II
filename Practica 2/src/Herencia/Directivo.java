package Herencia;

public class Directivo extends Empleado{
    private String areaGerencia;

    public Directivo() {
    }

    public Directivo(String nombre, String areaGerencia) {
        super(nombre);
        this.areaGerencia = areaGerencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaGerencia() {
        return areaGerencia;
    }

    public void setAreaGerencia(String areaGerencia) {
        this.areaGerencia = areaGerencia;
    }

    public String toString(){
        return "Nombre: " + nombre + ". Area de gerencia: "+ areaGerencia;
    }
}
