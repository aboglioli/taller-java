package main;

import java.util.Scanner;

public class Potencia {

    public static int potenciaConWhile(int num, int pot) {
        int resultado = 1;
        int contador = 0;
        while (contador < pot) {
            resultado = resultado * num;
            contador = contador + 1; // contador++;
        }
        return resultado;
    }

    public static int potenciaConFor(int num, int pot) {
        int resultado = 1;
        for (int i = 0; i < pot; i++) {
            resultado = resultado * num;
        }

        /*
		 * Si 5^3
		 * (0) resultado = 1 * 5
		 * (1) resultado = 5 * 5
		 * (2) resultado = 5 * 5
         */
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Número entero: ");
        num1 = sc.nextInt();

        System.out.println("^");

        System.out.print("Potencia: ");
        num2 = sc.nextInt();

        int resultado = potenciaConWhile(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
}
