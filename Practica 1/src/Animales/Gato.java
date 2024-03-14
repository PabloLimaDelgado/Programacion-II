package Animales;

public class Gato extends Animales{
    public String raza;

    public Gato(String genero, int edad, String nombre, String raza) {
        super(genero, edad, nombre);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato ladra");
    }

    @Override
    public void informacion(){
        super.informacion();
        System.out.println("La raza es: " + raza);
    }
}
