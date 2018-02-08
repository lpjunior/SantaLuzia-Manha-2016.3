package com.senac.notasaluno.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * A anotação @Embeddable marca a classe que será responsável por conter as chaves primarias.
 **/
@Embeddable
public class CursaDisciplinaPK implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	/**
	 * A anotação @ManyToOne - define que será uma relação MUITOS-PARA-UM, aonde a classe corrente terá muitas relações com a classe associada  
	 * A anotação @JoinColumn(name) define o nome do atributo de relação (Foreign key)
	 **/
	@ManyToOne
	@JoinColumn(name="disciplina_id")
	Disciplina disciplina;
	
	@ManyToOne
	@JoinColumn(name="aluno_id")
	Aluno aluno;
	
	public CursaDisciplinaPK() {

	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
