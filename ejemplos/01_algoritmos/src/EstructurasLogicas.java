import java.util.Scanner;

public class EstructurasLogicas {
	public static void main(String[] args) {
		// IF
		System.out.println("IF");
		
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

		// WHILE
		System.out.println("WHILE");
		int x = 0;
		while (x <= 15) {
			System.out.println(x);
			x = x + 1; // x++;
		}

		// FOR
		System.out.println("FOR");
		for (int i=0; i<=15; i++) {
			System.out.println();
		}
	}
}
