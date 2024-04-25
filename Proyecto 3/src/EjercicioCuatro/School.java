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

    public void addStudent(Student student) throws nombreEstudiante{
        if(student.getAge() < 18){
            throw new nombreEstudiante();
        } else{
            students.add(student);
        }
    }
    public double averageScore() throws Exception{
        double sum = 0.0;

        for(Student student: students){
            sum += student.getMark();
        }

        if(sum < 0){
            throw new Exception("La nota no peude ser menor a 0");
        }else{
            return sum/students.size();
        }
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

    public void searchNameStudent(String name) throws Exception{
        System.out.println("El alumno es: ");
        boolean encontrado = false;
        for (Student student : students) {
            if (student.getNombre().equals(name)) {
                encontrado = true;
                System.out.println("Nombre: " + student.getNombre());
                System.out.println("Edad: " + student.getAge());
                System.out.println("Nota: " + student.getMark());
                break;
            }
        }
        if (!encontrado) {
            throw new Exception("No se ha encontrado el alumno");
        }
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
