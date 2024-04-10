package EjersicioCuatro;

public class Casa {
    private int kmCuadrados;
    private int cantPuertas;
    private Puerta[] puertas;

    public Casa() {
    }

    public Casa(int kmCuadrados, int cantPuertas) {
        this.kmCuadrados = kmCuadrados;
        this.cantPuertas = cantPuertas;
        this.puertas = new Puerta[cantPuertas];
    }

    public void tienePuertas(Puerta puerta){
        for (int i = 0; i < puertas.length; i++) {
            if(puertas[i] == null){
                puertas[i] = puerta;
                break;
            }else if (puertas[puertas.length-1] != null){
                System.out.println("No pueden entrar mas puertas");
                break;
            }
        }
    }

    public void mostrarMaterialesPuertas(){
        for (int i = 0; i < puertas.length; i++) {
            if (puertas[i] != null){
                System.out.println(puertas[i].getMaterial());
            }
        }
    }
}
