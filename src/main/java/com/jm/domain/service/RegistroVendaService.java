package com.jm.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm.domain.model.RegistroVenda;
import com.jm.domain.repository.RegistroVendaRepository;

@Service
public class RegistroVendaService {
	
	@Autowired
	private RegistroVendaRepository registroVendaRepository;
	
	public List<RegistroVenda> listar(String nome, String data){
		
		return registroVendaRepository.findRegistroVendaByDataVendaAndFuncionario_nome(data, nome);
		
	}

}
