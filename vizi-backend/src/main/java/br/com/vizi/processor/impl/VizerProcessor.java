package br.com.vizi.processor.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.fasterxml.jackson.core.io.UTF32Reader;

import br.com.vizi.dto.request.VizerRequestDto;
import br.com.vizi.dto.response.VizerResponseDto;
import br.com.vizi.entity.Vizer;
import br.com.vizi.processor.IVizerProcessor;
import br.com.vizi.repository.VizerRepository;

@Component
public class VizerProcessor implements IVizerProcessor {

	@Autowired
	private VizerRepository vizerRepository;
	
	@Override
	public VizerResponseDto adicionar(VizerRequestDto request) throws Exception {
		try {
			Vizer vizer = new Vizer(request);						
			vizer = vizerRepository.save(vizer);
			return new VizerResponseDto(vizer);
		} catch (Exception e) {
			throw new Exception("Erro ao salvar vizer. ERRO: " + e.getMessage());
		}
	}

	@Override
	public VizerResponseDto consultarPorId(Long id) throws Exception {
		try {
			Optional<Vizer> vizer = vizerRepository.findById(id);
			
			if(vizer.isPresent()) {
				return new VizerResponseDto(vizer.get());
			}else {
				throw new Exception("Nenhum registro encontrado");
			}
		} catch (Exception e) {
			throw new Exception("Erro ao consultar vizer. ERRO: " + e.getMessage());
		}
	}

	@Override
	public List<VizerResponseDto> consultarTodos() throws Exception {
		try {
			List<Vizer> vizers = vizerRepository.findAll();
			List<VizerResponseDto> dtos = new ArrayList<VizerResponseDto>();
			if(vizers.size() >= 1) {
				for (Vizer vizer : vizers) {
					dtos.add(new VizerResponseDto(vizer));
				}
				return dtos;
			}else {
				throw new Exception("Nenhum registro encontrado");
			}
		} catch (Exception e) {
			throw new Exception("Erro ao consultar vizer. ERRO: " + e.getMessage());
		}
	}

}
