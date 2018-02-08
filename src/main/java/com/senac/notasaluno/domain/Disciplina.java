package com.senac.notasaluno.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Disciplina implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * A anotação @Column(length) define o quantidade de caracteres A
	 * anotação @Column(nullable=true|false) define se o campo será nulo(vazio) ou
	 * não
	 **/
	@Column(length = 150, nullable = false)
	private String nome;

	/**
	 * @Column(name) define como sera o nome do atributo no banco
	 * @Column(columnDefinition) define o tipo do atributo no banco
	 **/
	@Column(name = "descricao", columnDefinition = "TEXT")
	private String txtDescricao;

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return txtDescricao;
	}

	public void setDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
