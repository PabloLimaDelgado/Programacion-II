package EjercicioDos;

public class Employee {
    private String name;
    private Supervisor supervisor;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void assignSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String obtainSupervisorName(){
        if(supervisor == null){
            return "Sin supervisor";
        }else{
            return supervisor.getName();
        }
    }
}
