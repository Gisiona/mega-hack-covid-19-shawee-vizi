package br.com.vizi.processor;

import br.com.vizi.dto.request.ClienteRequestDto;
import br.com.vizi.dto.response.ClienteResponseDto;

public interface IClienteProcessor {

	ClienteResponseDto adicionar(ClienteRequestDto request);
}
