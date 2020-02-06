package com.gptw.teste.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.gptw.teste.controller.dto.EmpresaDTO;
import com.gptw.teste.controller.dto.EmpresaDetalhadaDTO;
import com.gptw.teste.controller.form.AtualizacaoEmpresaForm;
import com.gptw.teste.controller.form.EmpresaForm;
import com.gptw.teste.model.Empresa;
import com.gptw.teste.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	/*
	@Autowired
	private CursoRepository cursoRepository;
	*/
	
	@GetMapping
	//@Cacheable(value="listaEmpresas")
	public Page<EmpresaDTO> listaEmpresas(@RequestParam(required=false) String nomeEmpresa, 
		@PageableDefault(sort="nome" ,direction =Direction.DESC ,page=0, size=10) Pageable paginacao){
		
		if(nomeEmpresa == null) {
			return EmpresaDTO.retornarLista(empresaRepository.findAll(paginacao));
		}else {
			return EmpresaDTO.retornarLista(empresaRepository.findByNome(nomeEmpresa, paginacao));
		}
	} 
	
	@GetMapping("/{id}")
	public ResponseEntity<EmpresaDetalhadaDTO> retornaEmpresaDetalhado(@PathVariable Long id) {
		Optional<Empresa> empresa = empresaRepository.findById(id);
		if(empresa.isPresent()) {
			return ResponseEntity.ok(new EmpresaDetalhadaDTO(empresa.get()));	
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<EmpresaDTO> insereTopicos(@RequestBody @Valid EmpresaForm form, UriComponentsBuilder uriBuilder) {
		Empresa empresa = form.converter();
		empresaRepository.save(empresa);
		URI uri = uriBuilder.path("/empresas/{id}").buildAndExpand(empresa.getIdEmpresa()).toUri();
		return ResponseEntity.created(uri).body(new EmpresaDTO(empresa));  
	};
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<?> atualizaTopico(@PathVariable Long id,@RequestBody @Valid AtualizacaoEmpresaForm form){
		Optional<Empresa> empresaOpt = empresaRepository.findById(id);
		if(empresaOpt.isPresent()) {
			Empresa empresa = form.atualizaEmpresa(id, empresaRepository);
			return ResponseEntity.ok(new EmpresaDTO(empresa));			
		}
		return ResponseEntity.notFound().build();
	} 
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> excluiTopico(@PathVariable Long id){
		Optional<Empresa> topicoOpt = empresaRepository.findById(id);
		if(topicoOpt.isPresent()) {
			empresaRepository.deleteById(id);
			return ResponseEntity.ok().build();			
		}
		return ResponseEntity.notFound().build();
	}
		
}
