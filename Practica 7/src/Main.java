import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        String operacion;

        try {
            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextDouble();

            // Consumir el carácter de nueva línea pendiente
            sc.nextLine();

            System.out.println("Ingrese la operacion (+, -, *, /): ");
            operacion = sc.next();

            switch (operacion) {
                case "+":
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("La division es: " + (num1 / num2));
                    } else {
                        throw new ArithmeticException("¡Error! No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese números válidos.");
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}