package Animal;

public class Ave extends Animal{
    private String especie;
    private Boolean habla;

    public Ave() {
    }
    public Ave(String nombre, int edad, String tipoAnimal, double precio, String especie, Boolean habla) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Boolean getHabla() {
        return habla;
    }

    public void setHabla(Boolean habla) {
        this.habla = habla;
    }

    @Override
    public String toString(){
        return super.toString() + "su especie es: " + this.getEspecie();
    }
}
