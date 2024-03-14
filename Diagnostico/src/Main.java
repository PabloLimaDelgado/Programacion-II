import java.util.Scanner;

public class Main {

    //EJERCICIO 5
    public static boolean NumeroPrimo(int num) {
        int dividendos = 0;
        int divisor = 1;
        if (num < 0) {
            while (divisor >= num) {
                if (num % divisor == 0 && num != 1 && num != 0 && num != -1) {
                    dividendos += 1;
                }
                divisor -= 1;
            }
        } else {
            while (divisor <= num) {
                if (num % divisor == 0 && num != 1 && num != 0 && num != -1) {
                    dividendos += 1;
                }
                divisor += 1;
            }
        }
        return dividendos > 2;

    }

    //EJERCICIO 6
    public static String VocalesConsonantes (String f){
        int vocales, consonantes;
        vocales = 0;consonantes = 0;
        f = f.toLowerCase();
        char [] arrayF = f.toCharArray();

        for (char a : arrayF){
            if (a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u'){
                vocales+=1;
            }else if (a != ' '){
                consonantes+=1;
            }
        }
        return "La frase ingresada tiene "+ vocales + " vocales, y tiene "+ consonantes + " consonantes";
    }

    //EJERCICIO 7
    public static void CalculadoraPolacaInversaApp(double num1, double num2, String operando){
        switch (operando) {
            case "+":
                System.out.println((num1 + num2));
                break;
            case "-":
                System.out.println((num1 - num2));
                break;
            case "/":
                System.out.println((num1 / num2));
                break;
            case "*":
                System.out.println((num1 * num2));
                break;
            case "^":
                System.out.println((Math.pow(num1, num2)));
                break;
            case "%":
                System.out.println((num1 % num2));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static void main(String[] args) {

        //EJERCICIO 1
        /*1.Crea una calculadora simple en Java que pueda realizar operaciones
        básicas como suma, resta, multiplicación y división. El programa debe solicitar al usuario
        que ingrese dos números y luego le permitirle elegir la operación que desea realizar.
        Una vez completada la operación, debe mostrar el resultado al usuario. Cada operación debe implementarse
        en un método diferente. El programa principal debe llamar a estos métodos según la operación seleccionada
        por el usuario.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese la operacion que desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por 0");
                } else {
                    System.out.println("El resultado de la division es: " + ((double) num1 / (double)num2));
                }
                break;
            default:
                System.out.println("El dato introducido es incorrecto");
        } */

        //EJERCICIO 2
        /*2.Crea un programa en Java que convierta la temperatura de grados Celsius a
        Fahrenheit y viceversa. El programa debe permitir al usuario elegir la dirección de la conversión y
        luego ingresar la temperatura a convertir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opcion");
        System.out.println("1. Celcius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celcius");

        int grados = scanner.nextInt();

        if (grados > 2){
            System.out.println("los datos ingresados son incorrectos");
        }

        switch (grados){
            case 1:
                System.out.println("Ingrese los grados Celsius");
                double grado1 = scanner.nextDouble();
                System.out.println("La conversion de Celcius a Fahrenheit es: " + ((grado1 * 9/5) + 32));
                break;
            case 2:
                System.out.println("Ingrese los grados Fahrenheit");
                double grado2 = scanner.nextDouble();
                System.out.println("La conversion de Fahrenheit a Celcius es: " + ((grado2 - 32) + 5/9));
                break;
        }*/

        //EJERCICIO 5
        /*5.Crea un programa que pida al usuario un número mínimo y un máximo y muestre por pantalla todos los
        números primos incluidos en ese rango. Validar que mínimo sea menor que máximo.

        Scanner sc = new Scanner(System.in);

        int numMax, numMin;
        System.out.println("Ingrese el numero mínimo: ");
        numMin = sc.nextInt();
        numMax = numMin;
        while (numMax <= numMin) {

            System.out.println("Ingrese el numero Maximo (Este debe ser distinto y mayor al número mínimo): ");
            numMax = sc.nextInt();

        }

        while (numMin <= numMax) {

            if (!NumeroPrimo(numMin)){
                System.out.println("El número "+ numMin+ " es primo");
            }
            numMin+=1;

        } */

        //EJERCICIO 6
        /*6_Pide al usuario que ingrese una frase y devuelve la cantidad de vocales y consonantes que tiene esa frase.
        Scanner sc = new Scanner(System.in);

        String frase;
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        System.out.println(VocalesConsonantes(frase)); */

        //EJERCICIO 7
        /*7.Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá
        2 operandos (int) y un signo aritmético (String), según este último se realizara
        la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
        Los signos aritméticos disponibles son:

        a.	+: suma los dos operandos.
        b.	-: resta los operandos.
                c.	*: multiplica los operandos.
                d.	/: divide los operandos, este debe dar un resultado con decimales (double)
                e.	^:  1º operando como base y 2º como exponente.
                f.	%:  módulo, resto de la división entre operando1 y operando2.

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        String operando;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el primer número: ");
        num2 = sc.nextDouble();

        System.out.print("Ingrese el operando (+, -, *, /, ^, %): ");
        operando = sc.next();

        CalculadoraPolacaInversaApp(num1, num2, operando); */

        //EJERCICIO 8
        /*8. Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
        Al terminar, mostrará lo siguiente:
        a.	mayor numero introducido
        b.	menor numero introducido
        c.	suma de todos los numeros
        d.	suma de los numeros positivos
        e.	suma de los numeros negativos
        f.	media de la suma (la primera que pido)
        El número -1 no contara como número.

        Scanner sc = new Scanner(System.in);
        double num1, maxNum=0, minNum=0, sum=0, sumPositivo=0, sumNegativo=0, media=0, contador=0;

        do{
            System.out.print("Ingrese un número: ");
            num1 = sc.nextDouble();

            if(num1 == -1){
                break;
            }
            if (maxNum < num1){
                maxNum = num1;
            }
            if(minNum > num1){
                minNum = num1;
            }

            sum += num1;

            if (num1 >= 0){
                sumPositivo += num1;
            }else{
                sumNegativo += num1;
            }

            contador += 1;
        } while (num1 != -1);


        System.out.println(" ");
        System.out.println("El número mas grande es: " + maxNum);
        System.out.println("El número mas chico es: " + minNum);
        System.out.println("La suma es: " + sum);
        System.out.println("La suma de los números positivos: " + sumPositivo);
        System.out.println("La suma de los números negativos: " + sumNegativo);
        System.out.println("La media es: " + sum / contador); */
    }
}