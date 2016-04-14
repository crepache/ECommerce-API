package br.com.service;

import java.util.Collection;

import br.com.domain.Cliente;

public interface ClienteService {

	Cliente buscarPorCodigo(Long codigo);
	
	Collection<Cliente> buscarTodos();
	
	Cliente persistir(Cliente cliente);
	
	void remover(Cliente cliente);
}
