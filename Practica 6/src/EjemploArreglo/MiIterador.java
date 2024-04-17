package EjemploArreglo;

import java.util.Iterator;

public class MiIterador implements Iterator<String> {
    private String[] elementos;
    private int indice = 0;

    public MiIterador(String[] elementos) {
        this.elementos = elementos;
    }

    @Override
    public boolean hasNext() {
        return indice < elementos.length;
    }

    @Override
    public String next() {
        return elementos[indice++];
    }
}
