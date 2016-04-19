package br.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.domain.Pessoa;
import br.com.repositories.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public Pessoa buscarPorCodigo(Long codigo) {
		return pessoaRepository.findOne(codigo);
	}

	@Override
	public Collection<Pessoa> buscarTodos() {
		return (Collection<Pessoa>) pessoaRepository.findAll() ;
	}

	@Override
	public Pessoa persistir(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public void remover(Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
}