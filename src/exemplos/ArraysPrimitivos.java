package exemplos;

public class ArraysPrimitivos {
	
	static String[] nomes = new String[11];
	static int cont = 0;
	
	public static void main(String[] args) {
		
		add("Roberto");
		add("Anisio Cuba Libre");
		add("Gabriela");
		add("Maxwell Gambiarra");
		add("Pedro Way");
		add("Gabriel");
		add("Joaquim");
		add("Thais");
		add("Karla");
		add("Josi, cade?");
		add("Wellington");
		
		imprimir();
	}
	
	private static void add(String nome) {
		nomes[cont] = nome;
		cont++;
	}
	
	private static void imprimir() {
		for (String nome : nomes) {
			System.out.print(" " + nome);
		}
	}
}
