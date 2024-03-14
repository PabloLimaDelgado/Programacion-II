package Animales;

public class Pajaro extends Animales{
    public String especie;

    public Pajaro(String genero, int edad, String nombre, String especie) {
        super(genero, edad, nombre);
        this.especie = especie;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro pia");
    }

    @Override
    public void informacion(){
        super.informacion();
        System.out.println("La raza es: " + especie);
    }
}
