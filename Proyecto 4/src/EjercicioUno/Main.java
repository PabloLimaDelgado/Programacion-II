package EjercicioUno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = (int) (100 * Math.random());
        int attempts = 0, attempt = 0;

        try {
            do {
                System.out.print("Ingrese un número para adivinar cuál es: ");
                try {
                    attempt = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar un número.");
                    sc.next(); // Limpiar el buffer del scanner
                    attempts++;
                    continue;
                }

                if (num != attempt) {
                    if (num > attempt) {
                        System.out.println("Debe ingresar un numero mayor");
                    } else {
                        System.out.println("Debe ingresar un numero menor");
                    }
                    attempts++;
                }
            } while (num != attempt);

            System.out.println("¡Felicidades! ¡Has adivinado el número!");
            System.out.println("Número de intentos: " + attempts);

        } finally {
            sc.close(); // Cerrar el scanner al finalizar
        }
    }
}
