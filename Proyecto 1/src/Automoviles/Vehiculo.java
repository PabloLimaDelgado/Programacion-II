package Automoviles;

public abstract class Vehiculo {
    protected String dueño;
    protected int puerta;
    protected int ruedas;

    public Vehiculo(String dueño, int puerta, int ruedas) {
        this.dueño = dueño;
        this.puerta = puerta;
        this.ruedas = ruedas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public abstract void caracteristicas();
}
