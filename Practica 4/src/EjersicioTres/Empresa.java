package EjersicioTres;

public class Empresa {
    private String companyName;
    private Departamento[] departament = new Departamento[2];

    public Empresa() {
    }

    public Empresa(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Departamento[] getDepartamentos() {
        return departament;
    }

    public void agregarDepartamentos(Departamento departaments){
        for (int i = 0; i < departament.length; i++) {
            if(departament[i] == null){
                departament[i] = departaments;
                break;
            }else if (departament[departament.length - 1] != null)  {
                System.out.println("El departamento " + departaments.getDepartamentName() + " no puede unirse, no puede haber mas departamentos");
                break;
            }
        }
    }
}
