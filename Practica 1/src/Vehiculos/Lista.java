package Vehiculos;
import java.util.ArrayList;

public class Lista {
    ArrayList <Vehiculo> vehiculos = new ArrayList<>();
    public void catalogar(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void catalogar(int ruedas){
        for(Vehiculo v : vehiculos){
            if(ruedas == v.getRuedas()){
                System.out.println(v.getClass());
            }
        }
    }
    public void mostrar(){
        for(Vehiculo v : vehiculos){
            System.out.println(v.getClass());
        }
    }
}
