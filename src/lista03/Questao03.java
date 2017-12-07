package lista03;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int valor;
		
		System.out.print("Informe o valor: ");
		valor = scan.nextInt();
		
		scan.close();

		if(valor < 0)
			valor *= (-1);
		
		System.out.println("O valor absoluto é: " + valor);
	}
}
