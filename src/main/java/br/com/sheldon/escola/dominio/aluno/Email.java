package br.com.sheldon.escola.dominio.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Email {
	private final String endereco;

	public Email(String endereco) {
		this.validate(endereco);
		this.endereco = endereco;
	}

	private void validate(String endereco) {
		String regexValidacaoEmail = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		if(endereco == null || !endereco.matches(regexValidacaoEmail)) {
			throw new IllegalArgumentException("E-mail inválido");		
		}
	}
}
