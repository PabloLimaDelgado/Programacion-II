import Automoviles.*;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("Pablo", 4, 4, true);
        Camion c1 = new Camion("Juan", 2, 6, 45.50F);

        a1.caracteristicas();
        c1.caracteristicas();
    }
}