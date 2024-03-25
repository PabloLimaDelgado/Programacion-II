package Animales;

public class Gato extends Felino{
    public Gato() {
    }

    public Gato(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    public void comer(String comida){
        super.comer(comida + " que es alimento balanceado");

    }
    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("miauuuuu");
    }

    public void vacunar(){
        System.out.println("El gato fue vacunado");
    }
}
