package EjercicioCinco;

import java.util.*;

public class TaskList implements Iterable<Task>{

    private ArrayList<Task> arrayTask;

    public TaskList(){
        arrayTask = new ArrayList<>();

    }

    public void eliminateTask(){
        Scanner sc = new Scanner(System.in);
        String descrip;
        Task taskAux = null;
        boolean aux = false;

        do {

            for (Task t : arrayTask){
                System.out.println(t.getDatos());
            }
            System.out.println(" ");
            System.out.println("¿Que tarea desea borrar? (Ingrese su descripcion) ");
            descrip = sc.nextLine().toUpperCase();

            System.out.println(" ");
            for (Task t : arrayTask){
                if (Objects.equals(t.getDescription(), descrip)){
                    aux = true;
                    taskAux = t;
                    break;
                }
            }
            if (!aux){
                System.out.println("No hay ninguna tarea con esa descripcion, intentalo de nuevo");
            }
            System.out.println(" ");

        }while (!aux);

        arrayTask.remove(taskAux);
        System.out.println("Se ha eliminado correctamente la tarea de la lista");
        System.out.println(" ");

    }

    public void showTasks(){

        for (Task t : arrayTask){

            System.out.println(t.getDatos());

        }

    }

    public boolean isEmpty(){

       return arrayTask.isEmpty();

    }

    public void addTask(Task t){
        arrayTask.add(t);
        System.out.println("La tarea se ha agregado correctamente");
        arrayTask.sort(Comparator.comparingInt(Task::getPriority).reversed());
    }

    @Override
    public Iterator<Task> iterator() {
        return new MiIterador(arrayTask);
    }

    public static class MiIterador implements Iterator<Task> {

        private final List<Task> taskList;
        private int indice = 0;

        public MiIterador(List<Task> taskList) {

            this.taskList = taskList;
            taskList.sort(Comparator.comparingInt(Task::getPriority).reversed());

        }

        @Override
        public boolean hasNext() {
            return indice < taskList.size();
        }

        @Override
        public Task next() {
            return taskList.get(indice++);
        }
    }
}
