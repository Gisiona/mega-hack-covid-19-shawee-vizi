package br.com.vizi.processor;

import java.util.List;

import br.com.vizi.dto.request.EstabelecimentoRequestDto;
import br.com.vizi.dto.response.EstabebelecimentoResponseDto;

public interface IEstabelecimentoProcessor {
		
	EstabebelecimentoResponseDto adicionar(EstabelecimentoRequestDto request) throws Exception;
	EstabebelecimentoResponseDto listaEstabelecimentoPorId(Long id) throws Exception;
	List<EstabebelecimentoResponseDto> listaEstabelecimentos() throws Exception;
}
