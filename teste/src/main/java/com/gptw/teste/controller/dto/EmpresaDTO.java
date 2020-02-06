package com.gptw.teste.controller.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import com.gptw.teste.model.Empresa;
import com.gptw.teste.model.Endereco;
import com.gptw.teste.model.Telefone;

public class EmpresaDTO {

	private Long idEmpresa;
	private String nome;
	private String cnpj;
	private String razaoSocial;
	private String numFuncio;
	private boolean ativo;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Telefone> telefones = new ArrayList<>();
	
	public EmpresaDTO(Empresa empresa) {
		this.idEmpresa = empresa.getIdEmpresa();
		this.nome = empresa.getNome();
		this.cnpj = empresa.getCnpj();
		this.razaoSocial = empresa.getRazaoSocial();
		this.numFuncio = empresa.getNumFuncio();
		this.ativo = empresa.isAtivo();
/*		this.enderecos = empresa.getEnderecos();
		this.telefones = empresa.getTelefones();
*/	}

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
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public static Page<EmpresaDTO> retornarLista(Page<Empresa> empresas) {
		return empresas.map(EmpresaDTO::new);
		//return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
	}
	
}
