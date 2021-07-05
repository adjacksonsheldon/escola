package br.com.sheldon.escola.dominio.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Telefone {
	private String ddd;
	private String numero;
	public Telefone(String ddd, String numero) {
		validate(ddd, numero);
		this.ddd = ddd;
		this.numero = numero;
	}
	
	private void validate(String ddd, String numero) {
		if(ddd == null || numero == null
				|| !ddd.matches("\\d{2}")
					|| !numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Telefone inválido");		
		}
	}
}
