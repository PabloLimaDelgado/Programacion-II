package EjersicioTres;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Conductor", "Pablo");
        Empleado e2 = new Empleado("Mecanico", "Andres");
        Empleado e3 = new Empleado("Mecanico", "Santiago");
        Empleado e4 = new Empleado("Ingeniero", "Ulises");

        Departamento d1 = new Departamento("Carreras");
        Departamento d2 = new Departamento("Marketing");
        Departamento d3 = new Departamento("Atencion al cliente");

        d1.agregarEmpleado(e1);
        d1.agregarEmpleado(e2);
        d1.agregarEmpleado(e3);
        d2.agregarEmpleado(e4);

        /*for (int i = 0; i < d1.getEmployee().length; i++){
            if(d1.getEmployee()[i] == null){
                break;
            }
            System.out.println(d1.getEmployee()[i].getName());
        }*/

        Empresa empr1 = new Empresa("Ferrari");

        empr1.agregarDepartamentos(d1);
        empr1.agregarDepartamentos(d2);
        //empr1.agregarDepartamentos(d3);

        for (int i = 0; i < empr1.getDepartamentos().length; i++){
            if(empr1.getDepartamentos()[i] == null){
                break;
            }
            System.out.println(empr1.getDepartamentos()[i].getDepartamentName());

            for (int j = 0; j < empr1.getDepartamentos()[i].getEmployee().length; j++){
                if(empr1.getDepartamentos()[i].getEmployee()[j] == null){
                    break;
                }
                System.out.println(empr1.getDepartamentos()[i].getEmployee()[j].getName());
            }
        }
    }
}
