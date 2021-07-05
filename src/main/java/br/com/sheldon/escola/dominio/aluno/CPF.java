package br.com.sheldon.escola.dominio.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class CPF {
	private final String numero;

	public CPF(String numero) {
		this.validate(numero);
		this.numero = numero;
	}
	
	private void validate(String numero) {
		String regexValidacaoEmail = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";
		if(numero == null || !numero.matches(regexValidacaoEmail)) {
			throw new IllegalArgumentException("E-mail inválido");		
		}
	}
}
