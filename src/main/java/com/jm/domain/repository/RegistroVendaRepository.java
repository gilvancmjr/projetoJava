package com.jm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jm.domain.model.RegistroVenda;

@Repository
public interface RegistroVendaRepository extends JpaRepository<RegistroVenda, Long>{
	
	//List<RegistroVenda> findByDataVendaAndVendedorNome(String dataVenda, String nome);

}
