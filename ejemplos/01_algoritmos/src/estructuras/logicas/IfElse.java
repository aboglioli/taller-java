package estructuras.logicas;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.print("a> ");
		a = sc.nextInt();
		System.out.print("b> ");
		b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else if (a < b) {
			System.out.println(a + " es menor que " + b);
		} else {
			System.out.println(a + " es igual a " + b);
		}
	}
}
