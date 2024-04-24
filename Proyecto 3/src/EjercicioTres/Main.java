package EjercicioTres;

public class Main {
    public static void main(String[] args) throws ExceptionPerso {

    Semana semana = new Semana();
    semana.insertar(4,"Juernes");
    semana.mostar(3);
    semana.mostar(4);
    semana.mostar(1);
    semana.mostar(7);
    semana.eliminar("Jueres");
    semana.mostar(4);
    semana.mostrarSemana();
    semana.buscar("Lunes");
    semana.borrarTodo();
    }
}