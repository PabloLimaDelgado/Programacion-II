package EjercicioUno;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Pablo Lima", 10, "Mediocampista");
        Jugador j2 = new Jugador("Franco Reta", 9, "Delantero");
        Jugador j3 = new Jugador("Mati Picon", 2, "Defensor");
        Jugador j4 = new Jugador("Gonzalo Martinez",14, "Aguatero");

        ArrayList <Jugador> jugadoresUno = new ArrayList<>();

        jugadoresUno.add(j1);
        jugadoresUno.add(j2);
        jugadoresUno.add(j3);
        jugadoresUno.add(j4);

        Equipo e1 = new Equipo("Futbol Movi", jugadoresUno);

        e1.ordenarJugadoresPorNumero();

        for (Jugador jugador: e1) {
            System.out.println(jugador.getNombre());
        }
    }
}
