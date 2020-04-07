package br.com.vizi.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vizi.dto.request.EstabelecimentoRequestDTO;
import br.com.vizi.dto.response.EstabebelecimentoResponseDTO;
import br.com.vizi.entity.Estabelecimento;
import br.com.vizi.repository.EstabelecimentoRepository;

@Component
public class EstabelecimentoProcessor {

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public EstabebelecimentoResponseDTO listaEstabelecimentoPorId(Long id) {
		Optional<Estabelecimento> response = estabelecimentoRepository.findById(id);
		EstabebelecimentoResponseDTO dto = new EstabebelecimentoResponseDTO();
		
		return dto;		
	}

	public List<EstabebelecimentoResponseDTO> listaEstabelecimentos() {
		EstabebelecimentoResponseDTO dto = new EstabebelecimentoResponseDTO();
		List<EstabebelecimentoResponseDTO> dtos = new ArrayList<EstabebelecimentoResponseDTO>();
		List<Estabelecimento> lista = estabelecimentoRepository.findAll();
		return dtos;
	}

	public EstabebelecimentoResponseDTO adicionarEstabelecimento(EstabelecimentoRequestDTO request) {
		Estabelecimento esta = new Estabelecimento();
		EstabebelecimentoResponseDTO dto = new EstabebelecimentoResponseDTO();
		Estabelecimento estaRet = estabelecimentoRepository.save(esta);
		return dto;
	}

}
