package com.jm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.api.assembler.RegistroVendaAssembler;
import com.jm.api.model.RegistroVendaDto;
import com.jm.api.model.form.RegistroVendaForm;
import com.jm.domain.service.RegistroVendaService;

@RestController
@RequestMapping(value = "/registroVendas")
public class RegistroVendaController {
	
	@Autowired
	private RegistroVendaService registroVendaService;
	
	@Autowired
	private RegistroVendaAssembler registroVendaAssembler;
	
//	@GetMapping
//	public List<RegistroVendaDto> listar(@RequestBody List<RegistroVendaForm> registroVendaForms) {
//	System.out.println("registroVendaForms"+registroVendaForms);
//		//System.out.println("teste "+ data);
//		return registroVendaAssembler.toCollectionModel(registroVendaService.listar(registroVendaForms));
//	}
	
	@PostMapping
	public List<RegistroVendaDto> listar(@RequestBody List<RegistroVendaForm> registroVendaForms) {
	System.out.println("registroVendaForms"+registroVendaForms);
		//System.out.println("teste "+ data);
		return registroVendaAssembler.toCollectionModel(registroVendaService.listar(registroVendaForms));
	}


}
