package es.javapagar.spring.backend.model.service;

import java.util.List;

import es.javapagar.spring.backend.model.entity.Cliente;

public interface IClienteService {
	/**
	 * devuelve todo los clientes de la bd
	 * @return List <Cliente>
	 */
	List<Cliente> findAll();
	
	/**
	 * devuelve un cliente por Id
	 * @param id
	 * @return Cliente o null
	 */
	Cliente findById(Long id);
	
	/**
	 * Añade un cliente a la bd
	 * @param cliente
	 * @return Cliente 
	 */
	Cliente save (Cliente cliente);
	
	/**
	 * Borra un cliente pasandole su id
	 * @param id
	 */
	void delete(Long id);
	
	/**
	 * actualiza el cliente actual localizado por su id, con los nuevos datos de cliente
	 * @param cliente
	 * @param id
	 * @return Cliente
	 */
	Cliente update (Cliente clienteModificado, Long id);
}
