package br.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.domain.Cliente;
import br.com.service.ClienteService;

@RestController
@RequestMapping(value = "/api/v1/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public Cliente buscarPorCodigo(@PathVariable Long codigo) {
		return clienteService.buscarPorCodigo(codigo);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Cliente> buscarTodos() {
		return clienteService.buscarTodos();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cliente criar(@RequestBody Cliente cliente) {
		return clienteService.criar(cliente);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cliente atualizar(@RequestBody Cliente cliente) {
		return clienteService.atualizar(cliente);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void excluir(Long codigo) {
		Cliente cliente = clienteService.buscarPorCodigo(codigo);
		clienteService.remover(cliente);
	}
}
