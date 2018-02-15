package com.senac.lojaincomoda.domain;

import javax.persistence.Entity;
import javax.persistence.Transient;

//@Entity
public class PagamentoComCartao extends Pagamento {
	
	@Transient
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {

	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
