package EjercicioDos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //EJERCICIO 1
        /*Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición
        del arreglo está el mayor número leído.

        ArrayList <Integer> integers = new ArrayList<Integer>();
        int maxNumber = 0;

        for (int i = 0; i <= 9; i++) {
            Integer randomNumber = (int) (Math.random() * 100);
           integers.add(randomNumber);
        }

        System.out.println("Array List: ");
        for(Integer integer : integers){

            if(maxNumber < integer){
                maxNumber = integer;
            }

            System.out.print(integer + " ");
        }

        System.out.println(" ");
        System.out.println("El mayor número es: " + maxNumber + " y se encuentra en la posición: " + integers.indexOf(maxNumber)); */

        //EJERCICIO 2
        /*Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición
        del arreglo está el mayor número primo leído.

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> primeNumber = new ArrayList<>();
        int maxPrimeNumber = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Integer number = sc.nextInt();
            integers.add(number);
        }

        System.out.println("Array List: ");
        for (Integer integer : integers) {
            int counter = 0;
            System.out.print(integer + " ");

            for (int i = 1; i <= integer; i++) {
                if (integer % i == 0) {
                    counter++;
                }
            }

            if (counter <= 2) {
                primeNumber.add(integer);
            }
        }
        System.out.println(" ");

        System.out.println("Array List de numeros primos: ");
        for (Integer integer : primeNumber) {
            if (maxPrimeNumber < integer) {
                maxPrimeNumber = integer;
            }
            System.out.print(integer + " ");
        }

        System.out.println(" ");
        System.out.println("El mayor número primo es: " + maxPrimeNumber + " y se encuentra en la posición: " + primeNumber.indexOf(maxPrimeNumber)); */

        //EJERCICIO 3
        /*Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos
        entre 100 y 300. Luego mostrarlos en pantalla.

        ArrayList<Integer> primeNumber = new ArrayList<>();

        for (int i = 100; i <= 300; i++) {
            int counter = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    counter++;
                }
            }

            if(counter == 2){
                primeNumber.add(i);
            }
        }

        System.out.println("Array List de números primos comprendidos entre 100 y 300: ");
        for (Integer integer : primeNumber) {
            System.out.print(integer + " ");
        }
        System.out.println(" "); */

        //EJERCICIO 4
        /*Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones
        se encuentran los números terminados en 4.

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Integer number = sc.nextInt();
            integers.add(number);
        }

        System.out.println("Array List: ");
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

        System.out.println(" ");
        for (Integer integer : integers) {
            if (integer % 10 == 4) {
                System.out.println("El número " + integer + " está en la posición " + integers.indexOf(integer));
            }
        } */

        //EJERCICIO 5
        /*Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas veces está repetido el mayor.

        ArrayList<Integer> integers = new ArrayList<>();
        int maxNumber = 0;
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Integer number = sc.nextInt();
            integers.add(number);
        }

        System.out.println("Array List: ");
        for (Integer integer : integers) {
            System.out.print(integer + " ");

            if(maxNumber < integer){
                maxNumber = integer;
            }
        }
        System.out.println(" ");

        for (Integer integer : integers) {
            if(maxNumber == integer){
                counter++;
            }
        }

        System.out.println("El mayor número es: " + maxNumber + " y se repite: " + counter + " veces."); */
    }
}
