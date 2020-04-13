package br.com.vizi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viziapp/v1/embaixadores")
public class EmbaixadorController {

	@GetMapping("/healthcheck")
	public String healthcheck(){		
		return "200 OK";
	}
}
