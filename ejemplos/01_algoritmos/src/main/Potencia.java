package main;

import java.util.Scanner;

public class Potencia {

    public static float potencia(int num, int pot) {
        /*
        * Si 5^3
        * (0) resultado = 1 * 5
        * (1) resultado = 5 * 5
        * (2) resultado = 5 * 5
        */
        
        float resultado = 1;
        int hasta = 0;
        // Potencia negativa
        if(pot < 0) {
            hasta = -pot;
        }
        else { // Potencia positiva
            hasta = pot;
        }
        
        for (int i = 0; i < hasta; i++) {
            resultado = resultado * num;
        }
        
        if(pot < 0) {
            resultado = 1 / resultado;
        }

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

        float resultado = potencia(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
}
