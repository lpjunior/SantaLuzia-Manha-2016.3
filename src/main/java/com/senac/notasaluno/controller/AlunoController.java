package com.senac.notasaluno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.senac.notasaluno.domain.Aluno;
import com.senac.notasaluno.repository.AlunoRepository;

@Controller
@RequestMapping(path = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Aluno> all() {
		return repository.findAll();
	}

	@PostMapping()
	public @ResponseBody String add(@RequestBody Aluno aluno) {
		repository.save(aluno);
		return "Saved";
	}

	@DeleteMapping(path = "/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Aluno> findById(@PathVariable long id) {
		Aluno aluno = repository.findOne(id);
		return new ResponseEntity<Aluno>(aluno, HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Aluno> update(@RequestBody Aluno aluno) {
		repository.save(aluno);
		return new ResponseEntity<Aluno>(aluno, HttpStatus.ACCEPTED);
	}
}
