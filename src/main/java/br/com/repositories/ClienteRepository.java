package br.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
