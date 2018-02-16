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

import com.senac.notasaluno.domain.Endereco;
import com.senac.notasaluno.repository.EnderecoRepository;

@Controller
@RequestMapping(path = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository repository;

	@GetMapping()
	public @ResponseBody Iterable<Endereco> all() {
		return repository.findAll();
	}

	@PostMapping()
	public @ResponseBody String add(@RequestBody Endereco endereco) {
		repository.save(endereco);
		return "Saved";
	}

	@DeleteMapping(path = "/{id}")
	public @ResponseBody String remove(@PathVariable long id) {
		repository.delete(id);
		return "Removed";
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable long id) {
		Endereco endereco = repository.findOne(id);
		return new ResponseEntity<Endereco>(endereco, HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Endereco> update(@RequestBody Endereco endereco) {
		repository.save(endereco);
		return new ResponseEntity<Endereco>(endereco, HttpStatus.ACCEPTED);
	}
}
