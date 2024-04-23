package EjercicioCinco;

import java.util.Scanner;

public class taskMain {
    public static void main(String[] args) throws PersonalizedException {
        Scanner sc = new Scanner(System.in);
        int optionUser;
        String newTask = " ";
        int priority = 0;
        Task t;
        TaskList taskList = new TaskList();


        do {
            System.out.println("Bienvenido a la aplicacion de organizador de tareas!!!");
            System.out.println(" ");
            System.out.println("Dime,¿Que deseas hacer? ");
            System.out.println(" ");
            do {

                System.out.println("1) Agregar Tarea     2)Borrar Tarea con descripcion    3)Mostrar Tareas     0)Salir");
                optionUser = sc.nextInt();
                if (optionUser<0 || optionUser>3){
                    System.out.println(" ");
                    System.out.println("OPCION INCORRECTA, INTENTALO DE NUEVO");
                }

            }while (optionUser<0 || optionUser>3);


            if (optionUser == 1){
                do {
                    System.out.println(" ");
                    System.out.println("Ingresa la descripcion de la tarea (no puede ser un espacio vacio): ");
                    newTask = sc.nextLine().toUpperCase();
                    System.out.println(" ");
                }while (newTask.isEmpty());

                do {
                    System.out.println("Ingresa la prioridad de esta tarea (no puede ser menor a 1): ");
                    priority = sc.nextInt();
                    System.out.println(" ");

                }while (priority<1);

                taskList.addTask(new Task(newTask , priority));
                System.out.println(" ");


            } else if (optionUser == 2) {
                System.out.println(" ");

                if (taskList.isEmpty()){
                    System.out.println("No hay ninguna tarea para borrar");
                }else {

                    taskList.eliminateTask();

                }
                System.out.println(" ");

            } else if (optionUser == 3) {
                System.out.println(" ");
                if (taskList.isEmpty()) {

                    System.out.println("No hay ninguna tarea para mostrar");
                }else {
                    taskList.showTasks();
                }
                System.out.println(" ");
            }


        }while (optionUser != 0);

        System.out.println("GRACIAS POR USAR ESTA APLICACION :)");

    }
}
