package EjercicioTres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Semana implements Iterable <String>{

private String[] arrayStr;

    public Semana() {
        this.arrayStr = new String[7];
        arrayStr[0] = "lunes";
        arrayStr[1] = "Martes";
        arrayStr[2] = "Miercoles";
        arrayStr[3] = "Jueves";
        arrayStr[4] = "Viernes";
        arrayStr[5] = "Sabado";
        arrayStr[6] = "Domingo";
    }

    @Override
    public Iterator<String> iterator() {
        return new dia(arrayStr);
    }

    public void insertar(int position,String day)throws ExceptionPerso{

        if (position < 1 || position > 7){
            throw new ExceptionPerso("Los dias van del 1 al 7");
        }else {
            arrayStr [position-1]= day;
            System.out.println("Se modifico la posicion: "+position);
        }

    }
    public void mostar(int position)throws ExceptionPerso{
        if (position < 1 || position > 7){
            throw new ExceptionPerso("Los dias van del 1 al 7");
        }else {
            System.out.println("Dia: "+arrayStr[position-1]);
        }

    }
    public void eliminar(String day){
        int indice;
        indice = 0;
        for (String a: arrayStr){
            if (a.equalsIgnoreCase(day)) {
                arrayStr[indice] = null;
                System.out.println("Se ha eliminado correctamente");
                break;
            }
            indice++;

        }
        System.out.println("No se ha encontrado");

    }
    public void borrarTodo(){
        for (String a : arrayStr){
            a = null;

        }
        System.out.println("Se ha borrado todo correctamente");

    }
    public void buscar(String day){
        boolean x = false;
        for (String a: arrayStr){
            if (a.equalsIgnoreCase(day)) {
                System.out.println("Se ha encontrado el elemento correctamente");
                x = true;
                break;
            }
        }
        if (!x) {
            System.out.println("No se ha encontrado");
        }
    }
    public void mostrarSemana(){
        for (String a : arrayStr){
            System.out.println(a);
        }
    }
    public class dia implements Iterator<String>{
        private String[] semana = arrayStr;
        private int indice = 0;

        public dia(String[] elementos) {
            this.semana = elementos;
        }

        @Override
        public boolean hasNext() {
            return indice < semana.length;
        }

        @Override
        public String next() {
            return semana[indice++];
        }
    }
}
