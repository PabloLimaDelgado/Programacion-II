package Vehiculos;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        if (tipo.equals("urbana") || tipo.equals("deportiva")) {
            this.tipo = tipo;
        }
        else {
            this.tipo = "Error";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("urbana") || tipo.equals("deportiva")) {
            this.tipo = tipo;
        }
        else {
            System.out.println("La bicicleta debe ser urbana o deportiva");
        }
    }


}
