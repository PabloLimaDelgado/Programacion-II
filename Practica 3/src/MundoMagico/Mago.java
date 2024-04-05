package MundoMagico;

//El MAGO TIENE MUCHO ATAQUE PERO POCA DEFENSA
public class Mago extends PersonajeBase{
    public Mago() {
    }

    public Mago(int dañoAtaque, int nivel, String nombre, int puntosDefensa, int puntosVida) {
        super(dañoAtaque, nivel, nombre, puntosDefensa, puntosVida);
    }

    @Override
    public int atacar() {
        int dañoAtaque = getNivel() * getDañoAtaque();
        return 2 * dañoAtaque;
    }

    @Override
    public int defender(int dañoRecibido) {
        int dañoVidaQuitado = (getPuntosDefensa() * getNivel()) - dañoRecibido;

        return (getPuntosVida() - dañoVidaQuitado) - 10;

    }
}
