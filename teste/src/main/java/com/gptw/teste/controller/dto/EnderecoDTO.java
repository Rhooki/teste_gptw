package com.gptw.teste.controller.dto;

import com.gptw.teste.model.Endereco;

public class EnderecoDTO {

	private Long idEndereco;
	private Long idEmpresa;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;

	public EnderecoDTO(Endereco endereco) {
		this.idEndereco = endereco.getIdEndereco();
		this.idEmpresa = endereco.getIdEmpresa();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.estado = endereco.getEstado();	
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}
	
}
