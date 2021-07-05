package br.com.sheldon.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.sheldon.escola.dominio.aluno.Email;

class EmailTest {
	@Test
	void nao_deveria_aceitar_email_invalido() {
		assertThrows(IllegalArgumentException.class, ()-> new Email(null));
		assertThrows(IllegalArgumentException.class, ()-> new Email(""));
		assertThrows(IllegalArgumentException.class, ()-> new Email("emailinvalido"));
	}

	@Test
	void deveria_aceitar_email_valido() {
		Email email = new Email("adjackson123@gmail.com");
		assertEquals("adjackson123@gmail.com", email.getEndereco());
	}
}
