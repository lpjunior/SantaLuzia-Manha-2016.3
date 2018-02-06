package com.senac.notasaluno.domain.enums;

public enum SituacaoAluno {

	ATIVO(1, "Aluno Ativo"), DESATIVADO(2, "Aluno Desativado");
	
	private int id;
	private String descricao;
	
	private SituacaoAluno(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static SituacaoAluno toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for(SituacaoAluno sc : SituacaoAluno.values()) {
			if(id.equals(sc.getId())) {
				return sc;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " + id);
	}
}
