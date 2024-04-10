package EjersicioDos;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Trinidad");
        Persona p3 = new Persona("Candela");

        Libro l1 = new Libro("El hobbit");
        Libro l2 = new Libro("Harry Potter");
        Libro l3 = new Libro("Narnia");

        p1.setLibrosTiene(l1);
        p1.setLibrosTiene(l2);

        p2.setLibrosTiene(l3);

        l1.setPersonasLoTiene(p3);

        for (int i = 0; i < l1.getPersonasLoTiene().size(); i++) {
            System.out.println(l1.getPersonasLoTiene().get(i).getNombre());
        }

        for (int i = 0; i < p1.getLibrosTiene().size(); i++) {
            System.out.println(p1.getLibrosTiene().get(i).getNombreLibro());
        }
    }
}
