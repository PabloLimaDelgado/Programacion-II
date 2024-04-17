package EjemploArreglo;

import java.util.Iterator;

public class MiColeccion implements Iterable<String>{
    private String[] elementos;

    public MiColeccion(String[] elementos) {
        this.elementos = elementos;
    }

    @Override
    public Iterator<String> iterator() {
        return new MiIterador(elementos);
    }
}
