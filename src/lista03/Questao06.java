package lista03;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();

		scan.close();
		
		if(numero %2 == 0)
			System.out.println("N�mero par");
		else
			System.out.println("N�mero impar");
	}
}
