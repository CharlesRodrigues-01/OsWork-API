package com.charles.osworks.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charles.osworks.domain.model.Client;
import com.charles.osworks.domain.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> toList() {
		// return clientRepository.findAll();
		// return clientRepository.findByName("Maria Abadia");
		return clientRepository.findByNameContaining("Maria");
	}

}
