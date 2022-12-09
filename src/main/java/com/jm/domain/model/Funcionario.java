package com.jm.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Funcionario {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@Column(nullable = false)
	private String dataContratacao;

//	@ManyToMany
//	@JoinTable(name = "funcionario_cargo", joinColumns = @JoinColumn(name = "funcionario_id"), inverseJoinColumns = @JoinColumn(name = "cargo_id"))
//	private List<Cargo> cargo;
	
	@ManyToOne
	//@JoinTable(name = "funcionario_cargo", joinColumns = @JoinColumn(name = "funcionario_id"), inverseJoinColumns = @JoinColumn(name = "cargo_id"))
	private Cargo cargo;

//	@ManyToMany
//	@JoinTable(name = "funcionario_registro_venda", joinColumns = @JoinColumn(name = "funcionario_id"), inverseJoinColumns = @JoinColumn(name = "registro_id"))
//	private RegistroVenda venda;

}
