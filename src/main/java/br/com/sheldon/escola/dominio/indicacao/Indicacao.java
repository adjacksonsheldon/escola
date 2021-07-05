package br.com.sheldon.escola.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.sheldon.escola.dominio.aluno.Aluno;
import lombok.Getter;

@Getter
public class Indicacao {
	private Aluno indicado;
	private Aluno indicante;
	private final LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}
}
