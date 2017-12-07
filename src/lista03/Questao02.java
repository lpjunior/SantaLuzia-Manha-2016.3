package lista03;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String valorA;
		String valorB;
		String auxiliar;
		
		System.out.println("Informe o primeiro valor");
		valorA = scan.nextLine();
		System.out.println("Informe o segundo valor");
		valorB = scan.nextLine();
		
		scan.close();
		
		auxiliar = valorA;
		valorA = valorB;
		valorB = auxiliar;

		System.out.println("O valor de A:" + valorA);
		System.out.println("O valor de B:" + valorB);
	}
}
