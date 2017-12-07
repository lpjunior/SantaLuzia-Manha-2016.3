package lista03;

import javax.swing.JOptionPane;

public class Questao07 {
	public static void main(String[] args) {

		String txtNumero;
		int numero;
		int contador;
		
		txtNumero = JOptionPane.showInputDialog("Informe um número");
		numero = Integer.parseInt(txtNumero);
		contador = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				contador++;
		}
		if (contador == 2) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é primo");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo");
		}
	}
}
