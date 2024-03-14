package Vehiculos;

public class Coche extends Vehiculo{
    public int cilindrada;
    private double velocidad;

    public Coche(String color, int ruedas, int cilindrada, double velocidad) {
        super(color, ruedas);
        this.cilindrada = cilindrada;
        this.velocidad = velocidad;
    }
}
