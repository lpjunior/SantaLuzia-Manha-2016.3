package aplicativo;

import java.util.Scanner;

import entidade.Aluno;
import entidade.Pessoa;

public class App {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o nome do aluno: ");
		aluno.setNome(scan.nextLine());
		System.out.print("Informe o email do aluno: ");
		aluno.setEmail(scan.nextLine());
		System.out.print("Informe o telefone do aluno: ");
		aluno.setTelefone(scan.nextLine());
		System.out.print("Informe a matricula do aluno: ");
		aluno.setMatricula(Long.parseLong(scan.nextLine()));
		System.out.print("Informe a 1ª nota do aluno: ");
		aluno.setNota01(Double.parseDouble(scan.nextLine()));
		System.out.print("Informe a 2ª nota do aluno: ");
		aluno.setNota02(Double.parseDouble(scan.nextLine()));

		scan.close();
		System.out.println(aluno);

		Aluno a2 = new Aluno("Karla", "karla@gmail.com", "2121-2121", 1234L, 10., 10.);

		System.out.println(a2);

	}
}
