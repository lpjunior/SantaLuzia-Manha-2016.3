package com.senac.notasaluno.popula;

import java.util.HashSet;
import java.util.Set;

import com.senac.notasaluno.domain.Aluno;
import com.senac.notasaluno.domain.enums.SituacaoAluno;

public class PopulaAluno {


	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Set<String> telefones = new HashSet<String>();

		aluno.setMatricula("ALU001");
		aluno.setNome("Luis");
		aluno.setEmail("luis@gmail.com");
		aluno.setCpf("123.456.789-00");
		
		telefones.add("(21) 99927-5383");
		telefones.add("(21) 2555-5555");
		
		aluno.setTelefones(telefones);
		
		aluno.setSituacao(SituacaoAluno.ATIVO);
		
	}
}
