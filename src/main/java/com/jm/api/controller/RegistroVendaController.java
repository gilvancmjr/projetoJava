package com.jm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jm.api.assembler.RegistroVendaAssembler;
import com.jm.api.model.RegistroVendaDto;
import com.jm.domain.service.RegistroVendaService;

@RestController
@RequestMapping(value = "/registroVendas")
public class RegistroVendaController {
	
	@Autowired
	private RegistroVendaService registroVendaService;
	
	@Autowired
	private RegistroVendaAssembler registroVendaAssembler;
	
	@GetMapping
	public List<RegistroVendaDto> listar(@RequestParam String nome, @RequestParam String dataVenda) {
		//System.out.println("teste "+ data);
		return registroVendaAssembler.toCollectionModel(registroVendaService.listar(nome, dataVenda));
	}


}
