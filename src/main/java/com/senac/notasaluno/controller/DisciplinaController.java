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

import com.senac.notasaluno.domain.Disciplina;
import com.senac.notasaluno.repository.DisciplinaRepository;

@Controller
@RequestMapping(path = "/disciplinas")
public class DisciplinaController {

	@Autowired
	private DisciplinaRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Disciplina> all() {
		return repository.findAll();
	}

	@PostMapping()
	public @ResponseBody String add(@RequestBody Disciplina disciplina) {
		repository.save(disciplina);
		return "Saved";
	}

	@DeleteMapping(path = "/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Disciplina> findById(@PathVariable long id) {
		Disciplina disciplina = repository.findOne(id);
		return new ResponseEntity<Disciplina>(disciplina, HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Disciplina> update(@RequestBody Disciplina disciplina) {
		repository.save(disciplina);
		return new ResponseEntity<Disciplina>(disciplina, HttpStatus.ACCEPTED);
	}
}
