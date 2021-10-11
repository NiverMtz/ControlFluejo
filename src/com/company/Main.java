package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("¿Cuál es tu nombre? ");
        sc.nextLine();
        String nombre = sc.nextLine();

        if (edad > 18) {
            System.out.println("Tu nombre es " + nombre + ", eres mayor de edad");
        } else {
            System.out.println("Tu nombre es " + nombre + ", eres menor de edad");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int alfa = 0;
        int beta = 0;
        int gamma = 0;
        int triangule = 0;

        System.out.println("Ingresa el primer ángulo: ");
        alfa = sc.nextInt();
        System.out.println("Ingresa el segundo ángulo: ");
        beta = sc.nextInt();
        System.out.println("Ingresa el tercer ángulo: ");
        gamma = sc.nextInt();

        triangule = alfa + beta + gamma;

        if (triangule == 180 ) {
            System.out.println("Es un triángulo");
        } else if ( triangule > 180 ) {
            System.out.println("La suma de ángulos es mayor a 180°");
        } else if ( triangule < 180) {
            System.out.println("La suma de ángulos es menor a 180°");
        } else {
            System.out.println("Quién sabe que te metiste, verifica tus entradas, por favor.");
        }*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero1 = scan.nextInt();
        System.out.println("Ingresa otro número: ");
        int numero2 = scan.nextInt();
        System.out.println("Elige la operación: \n1)Suma\n2)Resta\n3)Producto\n4)División");
        int operacion = scan.nextInt();

        float resultado = 0;

        switch (operacion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
        }*/

        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.println("Ingresa un número: ");
            opcion = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }


        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un número válido");
                break;
        }
    }
}
