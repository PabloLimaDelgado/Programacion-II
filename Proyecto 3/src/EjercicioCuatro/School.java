package EjercicioCuatro;

import java.util.HashSet;
import java.util.Set;

public class School {
    private String name;
    private Set<Student> students = new HashSet<>();

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public double averageScore(){
        double sum = 0.0;

        for(Student student: students){
            sum += student.getMark();
        }

        return sum/students.size();
    }
    public double highestMark(){
        double maxMark = 0.0;

        for(Student student: students){
            if(maxMark < student.getMark()){
                maxMark = student.getMark();
            }
        }

        return maxMark;
    }

    public void searchNameStudent(String name){
        System.out.println("El alumno es: ");
        for(Student student: students){
            if(student.getNombre().equals(name)){
                System.out.println("Nombre: " + student.getNombre());
                System.out.println("Edad: " + student.getAge());
                System.out.println("Nota: " + student.getMark());
            }
        }
        System.out.println(" ");
    }

    public void showStudents(){
        System.out.println("Los alumnos son: ");
        for(Student student: students){
            System.out.println("Nombre: " + student.getNombre());
            System.out.println("Edad: " + student.getAge());
            System.out.println("Nota: " + student.getMark());
            System.out.println(" ");
        }
    }
}
