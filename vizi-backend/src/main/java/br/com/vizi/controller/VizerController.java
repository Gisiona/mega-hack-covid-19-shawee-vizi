package br.com.vizi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vizi.dto.request.VizerRequestDto;
import br.com.vizi.dto.response.VizerResponseDto;
import br.com.vizi.processor.IVizerProcessor;

@RestController
@RequestMapping("/viziapp/v1/vizers")
public class VizerController {

	@Autowired
	private IVizerProcessor vizerProcessor;
	
	@GetMapping("/healthcheck")
	public String healthcheck(){		
		return "200 OK";
	}
	
	@PostMapping()
	public VizerResponseDto adicionarVizer(@RequestBody VizerRequestDto request) throws Exception{		
		return vizerProcessor.adicionar(request);
	}
	
	@GetMapping("/{id}")
	public VizerResponseDto consultarPorId(@PathVariable("id") Long id) throws Exception{		
		return vizerProcessor.consultarPorId(id);
	}
	

	@GetMapping()
	public java.util.List<VizerResponseDto> consultarTodos() throws Exception{		
		return vizerProcessor.consultarTodos();
	}
}
