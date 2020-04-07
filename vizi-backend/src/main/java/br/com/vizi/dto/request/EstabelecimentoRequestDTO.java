package br.com.vizi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EstabelecimentoRequestDTO {
	
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
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	
}
