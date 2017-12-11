package respostas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();

		int numero;
		double soma = 0;

		// auto-fechamento do Scanner
		try (Scanner scan = new Scanner(System.in)) {
			// looping infinito
			for (;;) {
				System.out.print("Informe um número ou 0 para parar: ");

				numero = scan.nextInt();

				// condição de parada
				if (numero == 0) {
					break;
				}

				// carregamento do array
				numeros.add(numero);

				// calculo da media
				soma += numero;
			}

			// imprimindo o vetor na sua forma original

			System.out.println("Impressão do array como foi digitado:");
			for (Integer num : numeros) {
				System.out.print(" " + num);
			}

			// Método Java para ordenação crescente
			Collections.sort(numeros);

			System.out.println("\nArray ordenado:");
			for (Integer num : numeros) {
				System.out.print(" " + num);
			}

			// saída da soma dos números
			System.out.println("\nSoma: " + soma);
			// saída da média dos números
			System.out.println("\nMedia: " + soma / numeros.size());
		}
	}
}
