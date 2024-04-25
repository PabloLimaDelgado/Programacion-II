package EjercicioTres;

import java.util.Scanner;

class PersonalizedException extends Exception {
    public PersonalizedException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws PersonalizedException {

        Scanner sc = new Scanner(System.in);

        String base, height;

        System.out.print("Ingrese la base: ");
        base = sc.next(); // Leer el valor de la base

        if (base.isEmpty()) {
            throw new PersonalizedException("La base ingresada está vacía.");
        } else if (base.startsWith(" ")) {
            throw new PersonalizedException("La base tiene espacios al principio.");
        } else if (base.endsWith(" ")) {
            throw new PersonalizedException("La base tiene espacios al final.");
        } else if (!base.matches("[0-9.]+")) {
            throw new PersonalizedException("La base contiene letras o símbolos especiales.");
        }

        System.out.print("Ingrese la altura: ");
        height = sc.next(); // Leer el valor de la base

        if (height.isEmpty()) {
            throw new PersonalizedException("La altura ingresada está vacía.");
        } else if (height.startsWith(" ")) {
            throw new PersonalizedException("La altura tiene espacios al principio.");
        } else if (height.endsWith(" ")) {
            throw new PersonalizedException("La altura tiene espacios al final.");
        } else if (!height.matches("[0-9.]+")) {
            throw new PersonalizedException("La altura contiene letras o símbolos especiales.");
        }

        double baseDouble = Double.parseDouble(base);
        double heightDouble = Double.parseDouble(height);

        System.out.println("El area del triangulo es: " + ((baseDouble*heightDouble)/2));

    }
}


