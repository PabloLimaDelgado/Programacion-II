package Animal;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String tipoAnimal;
    protected double precio;

    public Animal() {
    }

    public Animal(String nombre, int edad, String tipoAnimal, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void Alimentar(){
        System.out.println("El animal " + this.getNombre() + " se alimento");
    }

    @Override
    public String toString(){
        return "El nombre es: " + this.getNombre() + " y ";
    }
}
