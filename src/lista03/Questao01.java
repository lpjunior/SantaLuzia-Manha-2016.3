package lista03;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		String valor01;
		String valor02;
		String operacao;

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		valor01 = scan.next();
		System.out.print("Informe o segundo valor: ");
		valor02 = scan.next();
		System.out.print("Informe a operação desejada: ");
		operacao = scan.next();

		scan.close();
		
		switch (operacao) {
		case "soma":
			System.out.println("A soma dos numeros é: " + (Integer.parseInt(valor01) + Integer.parseInt(valor02)));
			break;
		case "divisao":
			if (!valor02.equals("0")) {
				System.out.println(
						"A divisao dos numeros é: " + (Double.parseDouble(valor01) / Integer.parseInt(valor02)));
			} else {
				System.out.println("Divisão por 0");
			}
			break;

		case "subtracao":
			System.out.println("A subtração dos numeros é: " + (Double.parseDouble(valor01) - Double.parseDouble(valor02)));
			break;
		case "multiplicacao":
			System.out.println("A multiplicação dos numeros é: " + (Double.parseDouble(valor01) * Double.parseDouble(valor02)));
			break;
		default:
			System.out.println("Operação invalida");
			break;
		}
	}
}
