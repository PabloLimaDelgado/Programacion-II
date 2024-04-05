package MundoMagico;

//EL PICARO TIENE MENOS ATAQUE PERO MAS DEFENSA
public class Picaro extends PersonajeBase{
    public Picaro() {
    }

    public Picaro(int dañoAtaque, int nivel, String nombre, int puntosDefensa, int puntosVida) {
        super(dañoAtaque, nivel, nombre, puntosDefensa, puntosVida);
    }

    @Override
    public int atacar() {
        int dañoAtaque = getNivel() * getDañoAtaque();
        return dañoAtaque - 10;
    }

    @Override
    public int defender(int dañoRecibido) {
        int dañoVidaQuitado = (getPuntosDefensa() * getNivel()) - dañoRecibido;

        return (getPuntosVida() - dañoVidaQuitado) * 2;
    }
}
