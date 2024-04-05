package MundoMagico;

public abstract class PersonajeBase implements Personaje{
    private int dañoAtaque;
    private int nivel;
    private String nombre;
    private int puntosDefensa;
    private int puntosVida;

    public PersonajeBase() {
    }

    public PersonajeBase(int dañoAtaque, int nivel, String nombre, int puntosDefensa, int puntosVida) {
        this.dañoAtaque = dañoAtaque;
        this.nivel = nivel;
        this.nombre = nombre;
        this.puntosDefensa = puntosDefensa;
        this.puntosVida = puntosVida;
    }

    public int getDañoAtaque() {
        return dañoAtaque;
    }

    public void setDañoAtaque(int dañoAtaque) {
        this.dañoAtaque = dañoAtaque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}
