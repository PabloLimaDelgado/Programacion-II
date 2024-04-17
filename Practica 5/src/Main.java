import Animal.Ave;
import Animal.Gato;
import Animal.Perro;
import Animal.Pez;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Coco", 12, "Canino", 1200.5, "Caniche", true);
        Gato g1 = new Gato("Dastan", 10, "Felino", 2000.0, "Americano", false);
        Pez pez1 = new Pez("Marte", 2, "Maritimo",100.5,"Costa");
        Ave a1 = new Ave("Canela", 3, "Alado", 500.9, "Canario", false);

        TiendaMascotas tm1 = new TiendaMascotas("PetShop");

        tm1.addAnimal(p1);
        tm1.addAnimal(g1);
        tm1.addAnimal(pez1);

        tm1.listarAnimales();

        tm1.alimentarAnimal("Coco");
        tm1.alimentarAnimal("Marte");

        tm1.venderAnimal("Coco");

        tm1.listarAnimales();

        tm1.addAnimal(a1);

        tm1.listarAnimales();
    }
}