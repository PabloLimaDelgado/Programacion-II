import Vehiculos.*;
import Animales.*;

public class Main {
    public static void main(String[] args) {
        /*Lista lista = new Lista();

        Bicicleta b1 = new Bicicleta("Azul", 2, "urbana");
        Coche c1 = new Coche("Marron", 4, 33, 120.4);

        lista.catalogar(b1);
        lista.catalogar(c1);

        //lista.mostrar();

        lista.catalogar(2); */

        Perro p1 = new Perro("Masculino", 20, "Roco", "Caniche");

        p1.hacerSonido();
        p1.informacion();
    }
}