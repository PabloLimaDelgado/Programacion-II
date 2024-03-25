package Animales;

public abstract class Canino extends Animal{
    public Canino() {
    }

    public Canino(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    public void rugir(){
        System.out.println("El canino aulla");
    }
}
