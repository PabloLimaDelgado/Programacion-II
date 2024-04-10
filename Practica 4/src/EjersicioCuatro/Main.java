package EjersicioCuatro;

public class Main {
    public static void main(String[] args) {
        Casa c1 = new Casa(2000, 3);

        c1.tienePuertas(new Puerta("Madera"));
        c1.tienePuertas(new Puerta("Roble"));
        c1.tienePuertas(new Puerta("Metal"));

        c1.tienePuertas(new Puerta("Adobe"));
        c1.mostrarMaterialesPuertas();
    }
}
