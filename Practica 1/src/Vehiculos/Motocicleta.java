package Vehiculos;

public class Motocicleta extends Bicicleta{
    public int cilindrada;
    private double velocidad;
    public Motocicleta(String color, int ruedas, String tipo, int cilindrada, double velocidad) {
        super(color, ruedas, tipo);
        this.cilindrada = cilindrada;
        this.velocidad = velocidad;
    }
}
