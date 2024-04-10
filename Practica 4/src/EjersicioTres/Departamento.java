package EjersicioTres;

public class Departamento {
    private String departamentName;
    private Empleado[] employee = new Empleado[3];

    public Departamento() {
    }

    public Departamento(String departamentName) {
        this.departamentName = departamentName;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }

    public Empleado[] getEmployee() {
        return employee;
    }

    public void agregarEmpleado(Empleado empleado){
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] == null){
                employee[i] = empleado;
                break;
            }else if (employee[employee.length - 1] != null)  {
                System.out.println("El empleado " + empleado.getName() + "no puede unirse, no puede haber mas empleados");
                break;
            }
        }
    }
}
