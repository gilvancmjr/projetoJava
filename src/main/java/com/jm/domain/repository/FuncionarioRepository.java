package com.jm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jm.domain.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
//	@Query("from Funcionario f join f.venda where f.nome = :nome and f.venda.dataVenda")
//	List<Funcionario> consulta(String nome);
	
	
	//List<Funcionario> findFuncionarioByNomeAndVenda_dataVenda(String nome,String data);

}
