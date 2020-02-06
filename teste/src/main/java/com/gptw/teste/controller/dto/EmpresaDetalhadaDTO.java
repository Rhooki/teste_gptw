package com.gptw.teste.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gptw.teste.model.Empresa;

public class EmpresaDetalhadaDTO {

	private Long idEmpresa;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private String numFuncio;
	private boolean ativo;
	private List<EnderecoDTO> enderecos;
	private List<TelefoneDTO> telefones;
	
	public EmpresaDetalhadaDTO(Empresa empresa) {
		super();
		this.idEmpresa = empresa.getIdEmpresa();
		this.nome = empresa.getNome();
		this.cnpj = empresa.getCnpj();
		this.razaoSocial = empresa.getRazaoSocial();
		this.numFuncio = empresa.getNumFuncio();
		this.ativo = empresa.isAtivo();
		this.enderecos = new ArrayList<>(); 
//		this.enderecos.addAll(empresa.getEnderecos().stream().map(EnderecoDTO::new).collect(Collectors.toList()));
		this.telefones = new ArrayList<>(); 
//		this.telefones.addAll(empresa.getTelefones().stream().map(TelefoneDTO::new).collect(Collectors.toList()));
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNumFuncio() {
		return numFuncio;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public List<EnderecoDTO> getEnderecos() {
		return enderecos;
	}

	public List<TelefoneDTO> getTelefones() {
		return telefones;
	}
}
