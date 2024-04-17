package EjemploArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MiArrayList<T> implements Iterable<T> {
    private ArrayList<T> elementos;

    public MiArrayList() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public Iterator<T> iterator() {
        return new MiIterador2<>(elementos);
    }
}
