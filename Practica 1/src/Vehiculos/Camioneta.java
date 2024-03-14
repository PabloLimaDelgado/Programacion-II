package Vehiculos;

public class Camioneta extends Coche{
    private double carga;

    public Camioneta(String color, int ruedas, int cilindrada, double velocidad, double carga) {
        super(color, ruedas, cilindrada, velocidad);
        this.carga = carga;
    }
}
