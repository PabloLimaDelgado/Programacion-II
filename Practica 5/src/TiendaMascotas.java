import Animal.Animal;

import java.util.ArrayList;

public class TiendaMascotas {
    private String nombre;
    private ArrayList<Animal> animales = new ArrayList<>();

    public TiendaMascotas() {
    }
    public TiendaMascotas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAnimal(Animal animal){
        animales.add(animal);
    }

    public void venderAnimal(String nombre){
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equals(nombre)) {
                animales.remove(i);
                break;
            }
        }
    }

    public void alimentarAnimal(String nombre){
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equals(nombre)) {
                animales.get(i).Alimentar();
            }
        }
    }

    public void listarAnimales(){
        for (int i = 0; i < animales.size(); i++) {
            System.out.println("Animal " + (i+1) + ": ");
            System.out.println("Nombre: " + animales.get(i).getNombre());
            System.out.println("Edad: " + animales.get(i).getEdad());
            System.out.println("Precio: " + animales.get(i).getPrecio());
        }
    }
}
