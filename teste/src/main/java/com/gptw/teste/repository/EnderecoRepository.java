package com.gptw.teste.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gptw.teste.model.Empresa;
import com.gptw.teste.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Empresa, Long>{

	Page<Endereco> findByIdEmpresa(Long idEmpresa,Pageable paginacao);
	
}
