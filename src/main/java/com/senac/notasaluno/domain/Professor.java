package com.senac.notasaluno.domain;

import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa {

	private static final long serialVersionUID = 1L;

	private Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
