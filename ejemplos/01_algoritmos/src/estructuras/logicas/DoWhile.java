package estructuras.logicas;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int resultado = 0;
		do {
			System.out.print("+ ");
			num = sc.nextInt();
			resultado = resultado + num;
		} while(num != 0);
		
		System.out.println("= " + resultado);
	}
}
