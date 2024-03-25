package Animales;

public class Perro extends Lobo{
    public Perro() {
    }

    public Perro(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }
    @Override
    public void comer(String comida){
        super.comer(comida + " que es alimento balanceado");

    }
    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("guauu");
    }

    public void vacunar(){
        System.out.println("El perro fue vacunado");
    }

    public void sacarPaseo(){
        System.out.println("El perro ya salio a pasear");
    }
}
