import MundoMagico.Guerrero;
import Poligonos.Circulo;
import Poligonos.Cuadrado;

public class Main {
    public static void main(String[] args) {
        /* Cuadrado c1 = new Cuadrado(3.4);
        Circulo cir1 = new Circulo(33.5);

        System.out.println("El area del cuadrado es: " + c1.area());
        System.out.println("El area del triangulo es: " + cir1.area());

        c1.dibujar("Papel");
        c1.rotar(20);

        cir1.dibujar("Pizarra"); */


        Guerrero g1 = new Guerrero(10,5, "Arturo", 15, 100);

        System.out.println("El ataque genero: " + g1.atacar() + " de daño.");
        System.out.println("El guerrero perdio " + g1.defender(100) + " puntos de vida");
    }
}