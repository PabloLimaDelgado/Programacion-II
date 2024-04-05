package Poligonos;
import java.lang.Math;


public class Circulo extends Figura implements Dibujable{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        double area;
        area = Math.PI * Math.pow(radio,2);
        return area;
    }

    @Override
    public void dibujar(String superficie){
        System.out.println("La figura fue dibujada sobre: " + superficie);
    }
}
