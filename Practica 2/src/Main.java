import Animales.*;
import Herencia.*;

public class Main {
    public static void main(String[] args) {
        /*Operario o1 = new Operario("Pablo Lima", "Deposito");

        System.out.println(o1.toString());
        o1.entrarAreaTrabajo();

        Directivo d1 = new Directivo("Andres Bercich", "Ventas");

        System.out.println(d1.toString());

        Oficial ofi1 = new Oficial("Fede Cappelo", "Deposito", 10);

        ofi1.entrarAreaTrabajo();
        System.out.println(ofi1.toString());

        Tecnico t1 = new Tecnico("Santiago Comeglio", "Ventas", "Vendedor de autos");

        System.out.println(t1.toString());
        t1.entrarAreaTrabajo(); */

        Leon l1 = new Leon("190x200px", "Carnivoro", "Africa", "1m de alto y 2 de ancho");

        l1.comer("Liebre");
        l1.hacerRuido();
        l1.rugir();
    }
}