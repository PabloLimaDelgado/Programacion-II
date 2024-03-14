package Animales;

public class Perro extends Animales{
    public String raza;

    public Perro(String genero, int edad, String nombre, String raza) {
        super(genero, edad, nombre);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void informacion(){
        super.informacion();
        System.out.println("La raza es: " + raza);
    }
}
