package es.javapagar.spring.backend.model.repository;

import org.springframework.data.repository.CrudRepository;

import es.javapagar.spring.backend.model.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
