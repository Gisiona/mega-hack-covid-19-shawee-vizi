package br.com.vizi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vizi.dto.request.EstabelecimentoRequestDTO;
import br.com.vizi.dto.response.EstabebelecimentoResponseDTO;
import br.com.vizi.processor.EstabelecimentoProcessor;

@RestController
@RequestMapping("/v1/api/estabelecimento")
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoProcessor estabelecimentoProcessor;
	
	@GetMapping()
	public List<EstabebelecimentoResponseDTO> listaEstabelecimentos(){		
		return estabelecimentoProcessor.listaEstabelecimentos();
	}
	
	@GetMapping("/{id}")
	public EstabebelecimentoResponseDTO listaEstabelecimentoPorId(@PathVariable("id") Long id){		
		return estabelecimentoProcessor.listaEstabelecimentoPorId(id);
	}
	
	@PostMapping()
	public EstabebelecimentoResponseDTO adicionarEstabelecimento(@RequestBody EstabelecimentoRequestDTO request){		
		return estabelecimentoProcessor.adicionarEstabelecimento(request);
	}
}
