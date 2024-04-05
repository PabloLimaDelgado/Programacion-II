package Poligonos;

public class Cuadrado extends Figura implements Rotable, Dibujable{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        double area;
        area = lado*2;
        return area;
    }

    @Override
    public void rotar(int gradoRotacion) {
        System.out.println("La figura fue rotada: " + gradoRotacion + " grados");
    }

    @Override
    public void dibujar(String superficie){
        System.out.println("La figura fue dibujada sobre: " + superficie);
    }
}
