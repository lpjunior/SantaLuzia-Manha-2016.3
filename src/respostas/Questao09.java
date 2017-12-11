package respostas;

public class Questao09 {
	public static void main(String[] args) {
		Double fulano;
		Double ciclano;
		int anos;
		
		fulano = 1.50;
		ciclano = 1.10;
		anos = 0;
		
		while (ciclano <= fulano) {
			fulano += 0.02;
			ciclano += 0.03;
			anos++;
		}
		
		System.out.println("Serão necessários " + anos + " anos");
	}
}
