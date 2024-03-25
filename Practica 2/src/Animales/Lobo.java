package Animales;

public class Lobo extends Canino{
    public Lobo() {
    }

    public Lobo(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    public void comer(String comida){
        super.comer(comida + " que es carne");

    }
    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("auuuuuuu");
    }
}
