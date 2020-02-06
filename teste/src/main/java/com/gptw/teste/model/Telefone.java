package com.gptw.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_telefones")
@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_telefone")
	private long idTelefone;

	@Column(name="id_empresa")
	private long idEmpresa;
	
	@Column(name="prefix")
	private String preFix;
	
	@Column(name="numero")
	private String numero;
	
	public Telefone(){};
	
	@Column(name="id_empresa")
	public long getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(long idTelefone) {
		this.idTelefone = idTelefone;
	}
	public long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getPreFix() {
		return preFix;
	}
	public void setPreFix(String preFix) {
		this.preFix = preFix;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
