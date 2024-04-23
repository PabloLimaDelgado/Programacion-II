package EjercicioCuatro;

public class Student {
    private String nombre;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(String nombre, int age, double mark) {
        this.nombre = nombre;
        this.age = age;
        this.mark = mark;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
