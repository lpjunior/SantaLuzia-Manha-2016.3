package com.senac.notasaluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.senac.notasaluno.domain.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long>{

}
