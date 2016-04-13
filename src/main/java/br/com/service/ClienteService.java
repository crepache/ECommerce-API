package br.com.service;

import java.util.Collection;

import br.com.domain.Cliente;

public interface ClienteService {

	Cliente buscarPorCodigo(Long codigo);
	
	Collection<Cliente> buscarTodos();
	
	Cliente criar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(Cliente cliente);
}
