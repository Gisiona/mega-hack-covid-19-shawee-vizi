package br.com.vizi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EstabebelecimentoResponseDTO {
	
	@JsonProperty("codigo")
	private String id;
	
	@JsonProperty("razao_social")
	private String razaoSocial;
	
	@JsonProperty("nome_fantasia")
	private String nomeFantasia;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("nome_responsavel")
	private String nomeResponsavel;
	
	@JsonProperty("telefone_fixo")
	private String telefone;
	
	@JsonProperty("telefone_whatsapp")
	private String whatsapp;
	
	@JsonProperty("cep_postal")
	private String cep;
	
	@JsonProperty("endereco_completo")
	private String enderecoCompleto;
}
