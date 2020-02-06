package com.gptw.teste.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gptw.teste.model.Empresa;
import com.gptw.teste.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Empresa, Long>{

	Page<Telefone> findByIdEmpresa(Long IdEmpresa,Pageable paginacao);
	
}
