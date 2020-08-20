package com.charles.osworks.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charles.osworks.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/client")
	public List<Client> list() {
		return "teste";
		
	}

}
