package com.jm.api.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegistroVendaDto {
	
	
	private String dataVenda;
	
	private BigDecimal valorVendido;
	
	private FuncionarioNomeDto funcionario;

}
