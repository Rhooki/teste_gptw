package com.gptw.teste.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gptw.teste.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	Page<Empresa> findByNome(String nomeEmpresa,Pageable paginacao);
	
}
