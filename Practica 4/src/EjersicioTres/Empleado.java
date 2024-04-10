package EjersicioTres;

public class Empleado {
    private String charge;
    private String name;

    public Empleado() {
    }

    public Empleado(String charge, String name) {
        this.charge = charge;
        this.name = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
