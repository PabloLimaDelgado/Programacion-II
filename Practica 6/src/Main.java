import EjemploArrayList.MiArrayList;
import EjemploArreglo.MiColeccion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejemplo con Arreglo.");
        String[] palabras = {"Hola", "Mundo", "en", "Java"};
        MiColeccion miColeccion = new MiColeccion(palabras);

        for (String palabra : miColeccion) {
            System.out.println(palabra);
        }

        System.out.println("--------------------------");
        System.out.println("Ejemplo con ArrayList.");
        MiArrayList<String> miLista = new MiArrayList<>();
        miLista.agregarElemento("Hola");
        miLista.agregarElemento("Mundo");
        miLista.agregarElemento("en");
        miLista.agregarElemento("Java");

        for (String elemento : miLista) {
            System.out.println(elemento);
        }
    }
}