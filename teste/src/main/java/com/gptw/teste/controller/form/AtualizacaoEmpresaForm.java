package com.gptw.teste.controller.form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.gptw.teste.model.Empresa;
import com.gptw.teste.model.Endereco;
import com.gptw.teste.model.Telefone;
import com.gptw.teste.repository.EmpresaRepository;

public class AtualizacaoEmpresaForm {

	@NotNull @NotEmpty @Length(min=5)
	private String nome;
	@NotNull @NotEmpty @Length(min=14, max=14)
	private String cnpj;
	private String razaoSocial;
	private String numFuncio;
	private boolean ativo;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Telefone> telefones = new ArrayList<>();
		
	public Empresa atualizaEmpresa(Long id, EmpresaRepository empresaRepository) {
		Empresa empresa = empresaRepository.getOne(id);
		empresa.setNome(this.nome);
		empresa.setCnpj(this.cnpj);
		empresa.setRazaoSocial(this.razaoSocial);
		empresa.setNumFuncio(this.numFuncio);
		empresa.setAtivo(this.ativo);
/*		empresa.setEnderecos(this.enderecos);
		empresa.setTelefones(this.telefones);
*/		return empresa;
	}
	
}
