package com.jm.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm.domain.model.Funcionario;
import com.jm.domain.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<Funcionario> listar(String nome, String data){
		return funcionarioRepository.findByNomeAndVendaDataVenda(nome, data);
	}
}
