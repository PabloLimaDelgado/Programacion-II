package Animal;

public class Perro extends Animal {
    private String raza;
    private Boolean vacunado;

    public Perro() {
    }

    public Perro(String nombre, int edad, String tipoAnimal, double precio, String raza, Boolean vacunado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString(){
        return super.toString() + "su raza es: " + this.getRaza();
    }
}
