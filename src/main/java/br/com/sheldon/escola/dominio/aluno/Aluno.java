package br.com.sheldon.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Aluno {
	
	private CPF cpf;
	private String nome;
	private Email email;
	private final List<Telefone> telefones = new ArrayList<Telefone>();
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}
}
