package br.com.sheldon.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.sheldon.escola.dominio.aluno.CPF;

class CPFTest {
	@Test
	void nao_deveria_aceitar_cpf_invalido() {
		assertThrows(IllegalArgumentException.class, ()-> new CPF("1234567897"));
	}

	@Test
	void deveria_aceitar_cpf_valido() {
		CPF cpf = new CPF("123.123.123-12");
		assertEquals("123.123.123-12", cpf.getNumero());
	}
}
