package es.javapagar.spring.backend.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.javapagar.spring.backend.model.entity.Cliente;
import es.javapagar.spring.backend.model.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public Cliente update(Cliente clienteModificado, Long id) {
		Cliente clienteActual = clienteRepository.findById(id).orElse(null);
		
		if(clienteActual ==null ) {
			return null;
		}
		
		clienteActual.setNombre(clienteModificado.getNombre());
		clienteActual.setApellido(clienteModificado.getApellido());
		clienteActual.setEmail(clienteModificado.getEmail());
		
		return clienteRepository.save(clienteActual);
	}

}
