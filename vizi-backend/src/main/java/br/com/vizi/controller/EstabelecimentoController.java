package br.com.vizi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vizi.dto.request.EstabelecimentoRequestDto;
import br.com.vizi.dto.response.EstabebelecimentoResponseDto;
import br.com.vizi.processor.IEstabelecimentoProcessor;

@RestController
@RequestMapping("/viziapp/v1/estabelecimentos")
public class EstabelecimentoController {

	@Autowired
	private IEstabelecimentoProcessor estabelecimentoProcessor;
	
	@GetMapping()
	public List<EstabebelecimentoResponseDto> listaEstabelecimentos() throws Exception{		
		return estabelecimentoProcessor.listaEstabelecimentos();
	}
	
	@GetMapping("/{id}")
	public EstabebelecimentoResponseDto listaEstabelecimentoPorId(@PathVariable("id") Long id) throws Exception{		
		return estabelecimentoProcessor.listaEstabelecimentoPorId(id);
	}
	
	@PostMapping()
	public EstabebelecimentoResponseDto adicionarEstabelecimento(@RequestBody EstabelecimentoRequestDto request) throws Exception{		
		return estabelecimentoProcessor.adicionar(request);
	}
	
	@GetMapping("/healthcheck")
	public String healthcheck(){		
		return "200 OK";
	}
}
