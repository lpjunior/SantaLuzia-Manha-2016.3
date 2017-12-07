package lista03;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.print("Digite um número: ");
		numero = scan.nextInt();

		scan.close();
		
		if(numero %2 == 0)
			System.out.println("Número par");
		else
			System.out.println("Número impar");
	}
}
