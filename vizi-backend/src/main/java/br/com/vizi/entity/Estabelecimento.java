package br.com.vizi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity @Table(name = "estabelecimento")
public class Estabelecimento {

	@Id
	private Long id;
	private String razaoSocial;
	private String nomeFantasia;
	private String email;
	private String nomeResponsavel;
	private String telefone;
	private String whatsapp;
	private String cep;
	private String enderecoCompleto;
}
