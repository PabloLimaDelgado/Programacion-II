package Animal;

public class Pez extends Animal{
    private String biomaHabita;

    public Pez() {
    }
    public Pez(String nombre, int edad, String tipoAnimal, double precio, String biomaHabita) {
        super(nombre, edad, tipoAnimal, precio);
        this.biomaHabita = biomaHabita;
    }

    public String getBiomaHabita() {
        return biomaHabita;
    }

    public void setBiomaHabita(String biomaHabita) {
        this.biomaHabita = biomaHabita;
    }

    @Override
    public String toString(){
        return super.toString() + "el bioma en el que habita es: " + this.getBiomaHabita();
    }
}
