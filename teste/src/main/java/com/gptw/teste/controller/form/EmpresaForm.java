package com.gptw.teste.controller.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import com.gptw.teste.model.Empresa;
import com.gptw.teste.model.Endereco;
import com.gptw.teste.model.Telefone;

public class EmpresaForm {

	@NonNull @NotEmpty @Length(min=5)
	private String nome;
	@NonNull @NotEmpty @Length(min=14, max=14)
	private String cnpj;
	@NonNull @NotEmpty @Length(min=5)
	private String razaoSocial;
	private String nFunc;
	private Boolean status;
	private List<Endereco> enderecos;
	private List<Telefone> telefones;
	
	public EmpresaForm(){}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNFunc() {
		return nFunc;
	}

	public void setNFunc(String nFunc) {
		this.nFunc = nFunc;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Empresa converter() {
		Empresa empresa = new Empresa(nome, cnpj, razaoSocial, nFunc, status);
/*		empresa.setTelefones(telefones);
		empresa.setEnderecos(enderecos);
*/		return empresa;
	};
	
}
