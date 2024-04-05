package MundoMagico;

//EL GUERRERO TIENE DAÑO MEDIO Y DEFENSA MEDIO
public class Guerrero extends PersonajeBase{
    public Guerrero() {
    }

    public Guerrero(int dañoAtaque, int nivel, String nombre, int puntosDefensa, int puntosVida) {
        super(dañoAtaque, nivel, nombre, puntosDefensa, puntosVida);
    }

    @Override
    public int atacar() {
        int dañoAtaque = getNivel() * getDañoAtaque();
        return dañoAtaque;
    }

    @Override
    public int defender(int dañoRecibido) {
        int dañoVidaQuitado = (getPuntosDefensa() * getNivel()) - dañoRecibido;

        return getPuntosVida() - dañoVidaQuitado;
    }
}
