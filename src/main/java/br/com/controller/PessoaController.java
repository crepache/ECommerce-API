package br.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.domain.Pessoa;
import br.com.service.PessoaService;

@RestController
@RequestMapping(value = "/api/v1/pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public Pessoa buscarPorCodigo(@PathVariable Long codigo) {
		return pessoaService.buscarPorCodigo(codigo);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Pessoa> buscarTodos() {
		return pessoaService.buscarTodos();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pessoa criar(@RequestBody Pessoa pessoa) {
		return pessoaService.persistir(pessoa);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pessoa atualizar(@RequestBody Pessoa pessoa) {
		return pessoaService.persistir(pessoa);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void excluir(Long pessoa) {
		pessoaService.remover(pessoaService.buscarPorCodigo(pessoa));
	}
}
