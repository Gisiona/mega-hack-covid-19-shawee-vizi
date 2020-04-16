package br.com.vizi.processor.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.vizi.dto.request.ClienteRequestDto;
import br.com.vizi.dto.response.ClienteResponseDto;
import br.com.vizi.entity.Cliente;
import br.com.vizi.processor.IClienteProcessor;
import br.com.vizi.repository.ClienteRepository;

@Component
public class ClienteProcessor implements IClienteProcessor {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public ClienteResponseDto adicionar(ClienteRequestDto request) {
		Cliente cli = new Cliente();
		cli.setNome(request.getNome());
		cli.setAtivo(true);
		cli.setCep(request.getCep());
		cli.setCpf(request.getCpf());
		cli.setDataCadastro(LocalDate.now());
		cli.setEmail(request.getEmail());
		cli.setEnderecoCompleto(request.getEnderecoCompleto());
		cli.setWhatsapp(request.getWhatsapp());
		
		Cliente resp = clienteRepository.save(cli);
		
		ClienteResponseDto response = new ClienteResponseDto();
		response.setCep(resp.getCep());
		response.setCpf(resp.getCpf());
		response.setEmail(resp.getEmail());
		response.setEnderecoCompleto(resp.getEnderecoCompleto());
		response.setId(resp.getId());
		response.setNome(resp.getNome());
		response.setWhatsapp(resp.getWhatsapp());
		
		return response;
	}

}
