package br.com.vizi.processor.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.vizi.dto.request.EstabelecimentoRequestDto;
import br.com.vizi.dto.response.EstabebelecimentoResponseDto;
import br.com.vizi.entity.Estabelecimento;
import br.com.vizi.processor.IEstabelecimentoProcessor;
import br.com.vizi.repository.EstabelecimentoRepository;

@Component
public class EstabelecimentoProcessor implements IEstabelecimentoProcessor {

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public EstabebelecimentoResponseDto listaEstabelecimentoPorId(Long id) throws Exception {
		try {
			Optional<Estabelecimento> response = estabelecimentoRepository.findById(id);
			EstabebelecimentoResponseDto dto = null;
			
			if(response.isPresent()) {
				dto = new EstabebelecimentoResponseDto();
				dto.setId(response.get().getId());
				dto.setEmail(response.get().getEmail());
				dto.setEnderecoCompleto(response.get().getEnderecoCompleto());
				dto.setNomeFantasia(response.get().getNomeFantasia());
				dto.setWhatsapp(response.get().getWhatsapp());
				dto.setCnpjCpf(response.get().getCnpjCpf());
				dto.setSegmento(response.get().getSegmento());
			}
			return dto;
		} catch (Exception e) {
			throw new Exception("Erro ao consultar estabelecimento. ERRO: " + e.getMessage());
		}		
	}

	public List<EstabebelecimentoResponseDto> listaEstabelecimentos() throws Exception {
		try {
			EstabebelecimentoResponseDto dto = null;
			List<EstabebelecimentoResponseDto> dtos = new ArrayList<EstabebelecimentoResponseDto>();
			List<Estabelecimento> lista = estabelecimentoRepository.findAll();
			
			if(lista.size() > 0 ) {
				for (Estabelecimento response : lista) {
					dto = new EstabebelecimentoResponseDto();
					dto.setId(response.getId());
					dto.setEmail(response.getEmail());
					dto.setEnderecoCompleto(response.getEnderecoCompleto());
					dto.setNomeFantasia(response.getNomeFantasia());
					dto.setWhatsapp(response.getWhatsapp());
					dto.setCnpjCpf(response.getCnpjCpf());
					dto.setSegmento(response.getSegmento());
					
					dtos.add(dto);
				}				
			}
			
			return dtos;
		} catch (Exception e) {
			throw new Exception("Erro ao consultar estabelecimento. ERRO: " + e.getMessage());
		}
		
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public EstabebelecimentoResponseDto adicionar(EstabelecimentoRequestDto request) throws Exception {
		
		EstabebelecimentoResponseDto dto = null;
		try {
			Estabelecimento esta = new Estabelecimento();
			esta.setAtivo(true);			
			esta.setEmail(request.getEmail());
			esta.setEnderecoCompleto(request.getEnderecoCompleto());
			esta.setNomeFantasia(request.getNomeFantasia());		
			esta.setTelefone(request.getWhatsapp());
			esta.setWhatsapp(request.getWhatsapp());
			esta.setCnpjCpf(request.getCnpjCpf());
			esta.setSenha(request.getSenha());
			esta.setSegmento(request.getSegmento());
			esta.setDescricao(request.getDescricao());
			
			Estabelecimento response = estabelecimentoRepository.save(esta);
			
			dto = new EstabebelecimentoResponseDto();
			dto.setId(response.getId());
			dto.setEmail(response.getEmail());
			dto.setEnderecoCompleto(response.getEnderecoCompleto());
			dto.setNomeFantasia(response.getNomeFantasia());
			dto.setWhatsapp(response.getWhatsapp());
			dto.setCnpjCpf(response.getCnpjCpf());
			dto.setSegmento(response.getSegmento());
			
		} catch (Exception e) {
			throw new Exception("Erro ao salvar estabelecimento. ERRO: " + e.getMessage());
		}
		return dto;
	}

}
