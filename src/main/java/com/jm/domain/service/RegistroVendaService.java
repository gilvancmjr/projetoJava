package com.jm.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm.api.model.form.RegistroVendaForm;
import com.jm.domain.model.RegistroVenda;
import com.jm.domain.repository.RegistroVendaRepository;

@Service
public class RegistroVendaService {

	@Autowired
	private RegistroVendaRepository registroVendaRepository;

	public List<RegistroVenda> listar(List<RegistroVendaForm> registroVendaForms) {
		List<RegistroVenda> result = new ArrayList<RegistroVenda>();
		registroVendaForms.forEach(registroVendaForm->{
			result.addAll(registroVendaRepository.findRegistroVendaByDataVendaAndFuncionario_nome(
					registroVendaForm.getDataVenda(), registroVendaForm.getNome()));
			
		});
//		for (RegistroVendaForm registroVendaForm : registroVendaForms) {
//			result.addAll(registroVendaRepository.findRegistroVendaByDataVendaAndFuncionario_nome(
//					registroVendaForm.getDataVenda(), registroVendaForm.getDataVenda()));
//		}

		//System.out.println(registroVendaForms);
		return result;
		

	}

}
