package Person;

import Legal.Contract;
import java.lang.Math;

public class Athlete extends Person implements Contract {
    private double height;
    private int age;
    private double weight;

    public Athlete() {
    }
    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculatesIMC() {
        return (weight / Math.pow(height,2));
    }

    //Si su IMC es entre 25.0 y 29.9, se encuentra dentro del rango de sobrepeso.
    @Override
    public boolean extraWeight(double IMC) {
        if(IMC >= 25.0 && IMC <= 29.9){
            return true;
        }else{
            return false;
        }
    }

    //Para calcular la frecuencia cardíaca máxima (FCM), se puede usar la siguiente fórmula:
    //220 - edad = FCM
    @Override
    public double takeKeystrokes() {
        return 220 - age;
    }
}
