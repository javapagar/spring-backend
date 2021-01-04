package es.javapagar.spring.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.javapagar.spring.backend.model.entity.Cliente;
import es.javapagar.spring.backend.model.service.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("api/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping
	public List<Cliente> getAll(){
		return clienteService.findAll();
	}
}
