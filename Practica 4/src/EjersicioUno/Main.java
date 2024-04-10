package EjersicioUno;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pablo");

        Universidad u1 = new Universidad("UTN");
        Universidad u2 = new Universidad("UnCuyo");

        e1.setUniversidad(u1);
        System.out.println(e1.getUniversidad().getNombre());

        e1.setUniversidad(u2);
        System.out.println(e1.getUniversidad().getNombre());
    }
}
