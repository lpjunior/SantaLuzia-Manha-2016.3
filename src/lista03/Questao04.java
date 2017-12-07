package lista03;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] valores = new int[3];
		int auxiliar;

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Informe o valor: ");
			valores[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores.length - 1; j++) {
				if (valores[j] < valores[j + 1]) {
					auxiliar = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = auxiliar;
				}
			}
		}

		for (int i : valores) {
			System.out.println(" " + i);
		}
	}
}
