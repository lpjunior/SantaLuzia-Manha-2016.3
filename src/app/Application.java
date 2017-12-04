package app;

import entity.Aluno;
import implement.AlunoDAOImp;

public class Application {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setMatricula(2153);
		aluno.setNome("Karla");
		aluno.setEmail("karla@gmail.com");
		aluno.setNota01(6.);
		aluno.setNota02(6.);
		
		// chamada de objeto anonimo do AlunoDAOImp
		if(new AlunoDAOImp().salvar(aluno))
			System.out.println("DADOS GRAVADOS COM SUCESSO");
		else
			System.out.println("FALHA NA GRAVAÇÃO");
	}
}
