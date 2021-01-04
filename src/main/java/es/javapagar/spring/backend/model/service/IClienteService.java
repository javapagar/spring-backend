package es.javapagar.spring.backend.model.service;

import java.util.List;

import es.javapagar.spring.backend.model.entity.Cliente;

public interface IClienteService {

	List<Cliente> findAll();
}
