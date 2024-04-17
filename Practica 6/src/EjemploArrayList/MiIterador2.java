package EjemploArrayList;

import java.util.Iterator;
import java.util.List;

public class MiIterador2<T> implements Iterator<T> {
    private List<T> elementos;
    private int indice = 0;

    public MiIterador2(List<T> elementos) {
        this.elementos = elementos;
    }

    @Override
    public boolean hasNext() {
        return indice < elementos.size();
    }

    @Override
    public T next() {
        return elementos.get(indice++);
    }
}
