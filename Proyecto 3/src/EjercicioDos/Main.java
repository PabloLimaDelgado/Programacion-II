package EjercicioDos;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pablo Lima");
        Employee e2 = new Employee("Ulises Guzman");

        Supervisor s1 = new Supervisor("Andres Bercich");

        e1.assignSupervisor(s1);

        System.out.println(e1.obtainSupervisorName());
        System.out.println(e2.obtainSupervisorName());
    }
}
