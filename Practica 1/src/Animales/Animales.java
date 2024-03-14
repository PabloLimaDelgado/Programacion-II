package Animales;

public class Animales {
    public String genero;
    public int edad;
    public String nombre;

    public Animales(String genero, int edad, String nombre) {
        this.genero = genero;
        this.edad = edad;
        this.nombre = nombre;
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido genérico");
    }

    public void informacion(){
        System.out.println("El genero es: " + genero);
        System.out.println("La edad es: " + edad);
        System.out.println("El nombre es: " + nombre);
    }
}
