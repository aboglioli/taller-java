package main;

import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Número entero: ");
        num1 = sc.nextInt();

        System.out.println("X");

        System.out.print("Número entero: ");
        num2 = sc.nextInt();

        int resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }
}
