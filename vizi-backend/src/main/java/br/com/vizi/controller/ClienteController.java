package br.com.vizi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vizi.processor.IClienteProcessor;

@RestController
@RequestMapping("/viziapp/v1/clientes")
public class ClienteController {

	@Autowired
	private IClienteProcessor clienteProcessor;
	
	@GetMapping("/healthcheck")
	public String healthcheck(){		
		return "200 OK";
	}
}
