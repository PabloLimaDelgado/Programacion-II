package Automoviles;

public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto(String dueño, int puerta, int ruedas, boolean descapotable) {
        super(dueño, puerta, ruedas);
        this.descapotable = descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajar(){

    }

    public void subir(){

    }
    @Override
    public void caracteristicas() {
        System.out.println("Puertas: " + this.getPuerta());
        System.out.println("Ruedas: " + this.getRuedas());
        System.out.println("Dueño: " + this.getDueño());
        System.out.println("Descapotable: " + descapotable);
    }
}
