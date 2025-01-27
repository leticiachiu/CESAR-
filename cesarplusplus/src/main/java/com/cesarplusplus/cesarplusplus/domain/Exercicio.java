package com.cesarplusplus.cesarplusplus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Exercicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short exercicioId;
	
	@Column(length = 60, nullable = false)
	private String titulo;

	@Column(length = 255, nullable = false)
	private String textoQuestao;

	@Column(length = 255, nullable = false)
	private String entrada;

	@Column(length = 255, nullable = false)
	private String saida;
	
	@Column(length = 255, nullable = false)
	private String nivelQuestao;

	@Column(length = 10, nullable = false)
	private int tempoExecucao;

	@Column(length = 255, nullable = false)
	private String fonteQuestao;

	@Column(length = 255, nullable = false)
	private String turmasQuestao;

}
