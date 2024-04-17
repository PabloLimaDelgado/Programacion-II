package EjercicioUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Iterable significa que lo puedo recorrer
public class Equipo implements Iterable<Jugador>{
    private String nombre;

    private ArrayList <Jugador> jugadores;
    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public Iterator<Jugador> iterator(){
        return jugadores.iterator();
    }

    public void ordenarJugadoresPorNumero() {
        // Ordena los jugadores por numero utilizando el método compareTo de la clase Jugador
        Collections.sort(jugadores);
    }
}
