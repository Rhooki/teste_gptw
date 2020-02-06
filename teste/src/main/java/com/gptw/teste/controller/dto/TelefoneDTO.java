package com.gptw.teste.controller.dto;

import com.gptw.teste.model.Telefone;

public class TelefoneDTO {
	
	private long idTelefone;
	private long idEmpresa;
	private String preFix;
	private String numero;
	
	public TelefoneDTO(Telefone telefone) {
		this.idTelefone = telefone.getIdTelefone();
		this.idEmpresa = telefone.getIdEmpresa();
		this.preFix = telefone.getPreFix();
		this.numero = telefone.getNumero();
	}

	public long getIdTelefone() {
		return idTelefone;
	}

	public long getIdEmpresa() {
		return idEmpresa;
	}

	public String getPreFix() {
		return preFix;
	}

	public String getNumero() {
		return numero;
	}
	
	
}
