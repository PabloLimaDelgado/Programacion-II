package Animales;

public abstract class Felino extends Animal{
    public Felino() {
    }
    public Felino(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    public void rugir(){
        System.out.println("El felino maulla");
    }
}
