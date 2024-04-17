package EjercicioUno;

//Cuando una clase implementa la interfaz Comparable,
//se le permite la capacidad de ser comparada con otros objetos de la misma clase.
public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private int numero;
    private String posicion;

    public Jugador() {
    }

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //Es responsable de definir el orden natural de los objetos de la clase.
    //Devuelve un valor entero negativo, cero, o un valor entero positivo si el objeto
    //actual es menor, igual o mayor que el objeto especificado.
    @Override
    public int compareTo(Jugador other) {
        return Integer.compare(this.getNumero(), other.getNumero());
    }
}
