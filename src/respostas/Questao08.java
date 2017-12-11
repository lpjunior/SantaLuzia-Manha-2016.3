package respostas;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {

		Double saldoMedio;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe o saldo m�dio: ");
			saldoMedio = scan.nextDouble();
		}
		
		if(saldoMedio < 201.) {
			System.out.println("nenhum cr�dito");
		} else if(saldoMedio < 401.) {
			System.out.println("20% do valor do saldo m�dio");
		} else if(saldoMedio < 601.) {
			System.out.println("30% do valor do saldo m�dio");
		} else {
			System.out.println("40% do valor do saldo m�dio");
		}
	}
}
