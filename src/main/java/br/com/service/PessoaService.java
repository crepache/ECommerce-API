package br.com.service;

import java.util.Collection;

import br.com.domain.Pessoa;

public interface PessoaService {

	Pessoa buscarPorCodigo(Long codigo);
	
	Collection<Pessoa> buscarTodos();
	
	Pessoa persistir(Pessoa cliente);
	
	void remover(Pessoa cliente);
}
