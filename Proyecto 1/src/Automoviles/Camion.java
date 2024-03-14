package Automoviles;

public class Camion extends Vehiculo{

    private float carga;

    public Camion(String dueño, int puerta, int ruedas, float carga) {
        super(dueño, puerta, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void cargar(){

    }

    @Override
    public void caracteristicas() {
        System.out.println("Puertas: " + this.getPuerta());
        System.out.println("Ruedas: " + this.getRuedas());
        System.out.println("Dueño: " + this.getDueño());
        System.out.println("Carga: " + this.carga);
    }
}
