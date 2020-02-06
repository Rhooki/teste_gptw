package com.gptw.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_enderecos")
@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_endereco")
	private Long idEndereco;

	@Column(name="id_empresa")
	private Long idEmpresa;
	
	@Column(name="logradouro") 
	private String logradouro;
	
	@Column(name="numero")
	private int numero;
	 
	@Column(name="complemento")
	private String complemento;
	 
	@Column(name="bairro")
	private String bairro;
	 
	@Column(name="cidade")
	private String cidade;
	 
	@Column(name="estado")
	private String estado;

	public Endereco() {};
	
	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
