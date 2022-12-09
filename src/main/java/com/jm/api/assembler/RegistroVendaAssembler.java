package com.jm.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jm.api.model.RegistroVendaDto;
import com.jm.domain.model.RegistroVenda;

@Component
public class RegistroVendaAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public RegistroVendaDto toModel(RegistroVenda registroVenda) {
		return modelMapper.map(registroVenda, RegistroVendaDto.class);

	}

	public List<RegistroVendaDto> toCollectionModel(List<RegistroVenda> registroVendas) {
		return registroVendas.stream()
				.map(registroVenda -> toModel(registroVenda))
				.collect(Collectors.toList());
	}

}
