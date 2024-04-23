package EjercicioCinco;

public class Task {

    private String description;
    private int priority;

    public Task (String description, int priority) throws PersonalizedException{
        if (priority <=0){

            throw new PersonalizedException("NO SE PUEDE CREAR UNA TAREA CON PRIORIDAD MENOR O IGUAL A 0 (cero)");

        }
        this.description = description;
        this.priority = priority;
    }


    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDatos(){

        return "Descripcion: "+ this.getDescription()+ "    Prioridad: "+this.getPriority();

    }


}
