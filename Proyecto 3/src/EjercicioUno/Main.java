package EjercicioUno;

import EjercicioUno.Escuela.Asignatura;
import EjercicioUno.Escuela.Grupo;
import EjercicioUno.Persona.Alumno;
import EjercicioUno.Persona.Profesor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Profesor p1 = new Profesor(43829992, "Pablo Lima", "Basicas");

        Asignatura a1 = new Asignatura(10,"10:30","Algebra");
        Asignatura a2 = new Asignatura(11,"08:00","Fisica I");
        Asignatura a3 = new Asignatura(12,"12:00","Analisis Matematico");

        Grupo g1 = new Grupo("Primero", 'A');
        Grupo g2 = new Grupo("Primero", 'B');
        Grupo g3 = new Grupo("Primero", 'C');

        g1.addAsignatura(a1);
        g1.addAsignatura(a2);

        g1.addAlumno(new Alumno(43239122,"Ulises Guzman"));
        g1.addAlumno(new Alumno(54294831,"Franco Reta"));
        g1.addAlumno(new Alumno(41500132,"Matias Picon"));
        g1.addAlumno(new Alumno(39012313,"Alan Gomez"));
        g1.addAlumno(new Alumno(32991750,"German Beder"));

        g1.getPertenece().get(0).addGrupo(g2);
        g1.getPertenece().get(0).addGrupo(g3);

        //System.out.println(g1.getPertenece().get(0).getCursos().get(0).getCurso());

        p1.impartirAsignatura(a1);
        p1.impartirAsignatura(a2);
        p1.impartirAsignatura(a3);

        //A
        /*System.out.println("Punto a: " + p1.getImparte().get(2).getNombre());*/

        //B
        /*System.out.println("Asignaturas: ");
        for (int i=0; i<p1.getImparte().size(); i++){
            System.out.println(p1.getImparte().get(i).getNombre());
        }*/

        //C
        /*for(Alumno alumno: a1.getGrupo().getPertenece()){
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("DNI: " + alumno.getDni());
        }*/

        //D
        /*System.out.println(g1.getPertenece().get(0).getCursos().get(2).getLetra());*/

        //E
        /*for(Asignatura asignatura: g1.getPertenece().get(0).getCursos().get(0).getRecibe()){
            System.out.println("Nombre: " + asignatura.getNombre());
            System.out.println("Hora: " + asignatura.getHora());
            System.out.println("Aula: " + asignatura.getAula());
        }*/

        //F
        /*String asignaturas;
        System.out.print("Diga el nombre de la asignatura: ");
        asignaturas = sc.nextLine();

        for(Asignatura asignatura: g1.getPertenece().get(0).getCursos().get(0).getRecibe()){
            if(asignatura.getNombre().equals(asignaturas)){
                System.out.println("Nombre: " + asignatura.getNombre());
                System.out.println("Hora: " + asignatura.getHora());
                System.out.println("Aula: " + asignatura.getAula());
            }
        }*/

        //G
        /*for(Alumno alumno: p1.getImparte().get(1).getGrupo().getPertenece()){
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("DNI: " + alumno.getDni());
        }*/

        //H
        /*Asociación:
        En una asociación, dos clases están relacionadas de alguna manera, pero cada una sigue existiendo de forma independiente.
                No hay una dependencia fuerte entre las clases y ninguna de las clases controla la existencia de la otra.
        Las asociaciones pueden ser unidireccionales o bidireccionales.
                Por ejemplo, una asociación podría ser entre una clase Estudiante y una clase Curso, donde un estudiante
                puede estar inscrito en varios cursos y un curso puede tener varios estudiantes inscritos.
         */

        /*Composición:
        La composición es una relación más fuerte entre dos clases, donde una clase (la parte) está compuesta por otra clase (el todo).
                La parte no puede existir independientemente del todo si el todo se destruye, las partes también se destruyen.

        En la composición, la relación es de "contiene a".
                La composición se representa típicamente como una relación de propiedad, donde una clase es propiedad de la otra.
                Por ejemplo, una clase Casa podría tener una composición con una clase Habitación, donde una casa está
                compuesta por varias habitaciones y si la casa se destruye, las habitaciones también se destruyen.
         */

        /*Agregación:
        La agregación es similar a la composición en el sentido de que representa una relación entre un todo y sus partes.
                Sin embargo, en la agregación, las partes pueden existir independientemente del todo.
        La relación en la agregación es más débil que en la composición.
        En la agregación, la relación es de "tiene un".
                Por ejemplo, una clase Universidad podría tener una agregación con una clase Departamento,
                donde un departamento puede existir independientemente de la universidad y varios departamentos
                pueden estar asociados con una universidad.
         */
    }
}
