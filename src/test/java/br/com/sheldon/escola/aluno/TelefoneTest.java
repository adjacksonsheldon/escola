package br.com.sheldon.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.sheldon.escola.dominio.aluno.Telefone;

class TelefoneTest {
	@Test
	void nao_deveria_telefone_invalido() {
		assertThrows(IllegalArgumentException.class, ()-> new Telefone(null, null));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("", ""));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("12", "7897897"));
	}

	@Test
	void deveria_aceitar_telefone__valido() {
		var telefone = new Telefone("12", "78978978");
		assertEquals("78978978", telefone.getNumero());
	}
}
