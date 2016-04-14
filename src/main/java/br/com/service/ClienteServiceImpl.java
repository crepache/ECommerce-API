package br.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.domain.Cliente;
import br.com.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente buscarPorCodigo(Long codigo) {
		return clienteRepository.findOne(codigo);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return (Collection<Cliente>) clienteRepository.findAll() ;
	}

	@Override
	public Cliente persistir(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void remover(Cliente cliente) {
		clienteRepository.delete(cliente);
	}
}