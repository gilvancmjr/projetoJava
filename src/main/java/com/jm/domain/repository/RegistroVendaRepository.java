package com.jm.domain.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jm.domain.model.RegistroVenda;

@Repository
public interface RegistroVendaRepository extends JpaRepository<RegistroVenda, Long>{
	
	List<RegistroVenda> findRegistroVendaByDataVendaAndFuncionario_nome(String dataVenda, String nome);

}
